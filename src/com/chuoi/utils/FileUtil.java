package com.chuoi.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {
	public static FileReader getFileReader(String url) {
		try {
			FileReader fr = new FileReader(url);

			return fr;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void writeFile(String url, String data) {
		try {
			FileWriter fw = new FileWriter(url);
			fw.write(data);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
