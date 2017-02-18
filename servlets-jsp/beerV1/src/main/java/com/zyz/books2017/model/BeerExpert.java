package com.zyz.books2017.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2017/2/17.
 */
public class BeerExpert {
	public List getBrands(String color) {
		List<String> brands = new ArrayList<>();
		if (color.equals("amber")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		} else {
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
		}
		return brands;
	}
}
