package com.infotel.travel.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MiscUtils {

	private static String DATE_FORMAT = "yyyy-MM-dd";
	private static SimpleDateFormat sdf;		
			
	public static String workingFile(String baseName) {
		String workingFile = System.getProperty("user.dir") + 
				System.getProperty("file.separator");
		workingFile += "resources" + System.getProperty("file.separator") + baseName;
		return workingFile;
	}

	public static String workingFile(String path,String baseName) {
		return path + System.getProperty("file.separator") + baseName;
	}
	
	public static String format(Date d) {
		if (sdf==null) sdf = new SimpleDateFormat(DATE_FORMAT);	
		return sdf.format(d);
	}
	
	public static Date parse(String s) {
		try {
			if (sdf==null) sdf = new SimpleDateFormat(DATE_FORMAT);	
			return sdf.parse(s);
		} catch (ParseException e) {
			return new Date();
		}
	}	
}
