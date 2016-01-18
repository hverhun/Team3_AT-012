package com.lits012.main;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.lits012.JavaTeamProject.dto.Employee;
import com.lits012.parser.ParserJSON;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;

public class Main {

	public static void main(String[] args) throws Exception, JSONException, JsonParseException, JsonMappingException, IOException {

	        // JSON Jackson Parser
	        System.out.println("JSON Jackson Parser :  ");
	        ParserJSON jacksonParser = new ParserJSON();
	       List<Employee> someData2 = jacksonParser.ParseJsonUsingJackson();
	       
	}

}
