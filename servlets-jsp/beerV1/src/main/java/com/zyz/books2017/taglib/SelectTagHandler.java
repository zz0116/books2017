package com.zyz.books2017.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ZhangYuanzhuo on 2017/4/6.
 */
public class SelectTagHandler extends SimpleTagSupport implements DynamicAttributes {
    private static final String ATTR_TEMPLATE = "%s='%s' ";
    private static final String OPTION_TEMPLATE
            = " <option value='%l$s'>%l$s</option>";
    private List optionsList;
    private String name;
    private String size;
    private Map<String, Object> tagAttrs = new HashMap<>();

    public void setOptionsList(List optionsList) {
        this.optionsList = optionsList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void doTag() throws JspException, IOException {
        PageContext pageContext = (PageContext) getJspContext();
        JspWriter out = pageContext.getOut();

        out.print("<select ");
        out.print(String.format(ATTR_TEMPLATE, "name", this.name));
//        out.print(String.format(ATTR_TEMPLATE, "size", this.size));

        for (String attrName : tagAttrs.keySet()) {
            String attrDefinition =
                    String.format(ATTR_TEMPLATE, attrName,
                            tagAttrs.get(attrName));
            out.print(attrDefinition);
        }

        out.println('>');

        for (Object option : this.optionsList) {
            String optionTag =
                    String.format(OPTION_TEMPLATE, option.toString());
            out.println(optionTag);
        }

        out.println(" </select>");
    }

    @Override
    public void setDynamicAttribute(String uri, String name, Object value) throws JspException {
        tagAttrs.put(name, value);
    }
}
