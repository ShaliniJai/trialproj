package com.me.iTextTrial.util;

import com.itextpdf.text.BaseColor;

public class ExtendedColor extends BaseColor {

	public ExtendedColor(int red, int green, int blue) {
		super(red, green, blue);
		
	}
	
	public static final ExtendedColor LIGHT_BLUE = new ExtendedColor(182, 196, 222);

}
