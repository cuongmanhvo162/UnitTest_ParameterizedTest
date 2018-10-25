package com.cuongvo.util;

public class Util {
	
	public static boolean isValidEmailAddress(String email) throws Exception{

		String ePattern = "^(?!\\.)(?!.*[.]{2})([a-zA-Z0-9!.#$%&'\"*+/=?^_`{|}~-]+)([^\\.])"
				+ "@(?!\\-)((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])"
				+ "|(([a-zA-Z\\-]+\\.)"
				+ "+((?!web$)[a-zA-Z]{2,}))"
				+ "|((([0-9\\-]+\\.)"
				+ "+[0-9]{1,3}))"
				+ ")$";

		java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
		java.util.regex.Matcher m = p.matcher(email);

		return m.matches();

	}
}