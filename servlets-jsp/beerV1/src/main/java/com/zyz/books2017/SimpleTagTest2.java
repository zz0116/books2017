package com.zyz.books2017;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by ZhangYuanzhuo on 2017/3/27.
 */
public class SimpleTagTest2 extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        getJspBody().invoke(null);
    }
}
