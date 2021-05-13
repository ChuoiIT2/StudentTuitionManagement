package com.chuoi.utils;

import java.io.File;

public class DatabaseUtil {
	public static String getDatabaseUrl(String dbName) {
		String rootPath = new File("").getAbsolutePath();
		return rootPath + "/src/com/chuoi/databases/" + dbName + ".json";
	}
}
