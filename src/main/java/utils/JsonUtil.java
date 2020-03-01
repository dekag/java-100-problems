package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.DocumentContext;

import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;

public class JsonUtil {
	
	public static void main(String[] args) {
		InputStream is = JsonUtil.class.getClassLoader().getResourceAsStream("example.json");
		updateJsonValue();
	}
	
	private static void updateJsonValue() {

		JSONParser parser = new JSONParser();
		JSONObject jsonObject = new JSONObject();

		FileReader reader = null;
		try {
		    //File jsonFile = new File("path to book.json");
		    //reader = new FileReader(jsonFile);
		    InputStream is = JsonUtil.class.getClassLoader().getResourceAsStream("example.json");
		    jsonObject = (JSONObject) parser.parse(is);

		} catch (Exception ex) {
		    System.out.println(ex.getLocalizedMessage());
		}

		Map<String, Object> userData = null;
		try {
		    userData = new ObjectMapper().readValue(jsonObject.toJSONString(), Map.class);
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}

		MutableJson json = new MutableJson(userData);

		System.out.println("Before:\t" + json.map());

		json.update("$..store.book[0].author", "jigish");
		json.update("$.store.book[1].category", "action");

		System.out.println("After:\t" + json.map().toString());

		}

}
