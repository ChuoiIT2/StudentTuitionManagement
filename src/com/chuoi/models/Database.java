package com.chuoi.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Database {
	private String url;

	public Database(String dbName) {
		String rootPath = new File("").getAbsolutePath();
		this.url = rootPath + "/src/com/chuoi/databases/" + dbName;
	}

	public JSONArray readArray() {
		JSONArray parsedData = null;
		try {
			FileReader fileReader = new FileReader(url);
			JSONParser jsonParser = new JSONParser();

			Object fileDataObject = jsonParser.parse(fileReader);
			parsedData = (JSONArray) fileDataObject;

			return parsedData;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return parsedData;
	}

	public JSONObject readObject() {
		JSONObject parsedData = null;
		try {
			FileReader fileReader = new FileReader(url);
			JSONParser jsonParser = new JSONParser();

			Object fileDataObject = jsonParser.parse(fileReader);
			parsedData = (JSONObject) fileDataObject;

			return parsedData;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return parsedData;
	}
}
