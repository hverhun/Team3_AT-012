package com.lits012.parser;

import com.fasterxml.jackson.core.JsonParseException;
//import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
 //import org.testng.annotations.Test;

import java.util.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import com.lits012.JavaTeamProject.dto.Employee;

public class ParserJSON {

	 public List<Employee> ParseJsonUsingJackson() throws JsonParseException, JsonMappingException, IOException {

	        InputStream input = new FileInputStream("resourses/JSONEmployees.json");

	        ObjectMapper objectMapper = new ObjectMapper();
	        //objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	        //objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
	        TypeFactory typeFactory = TypeFactory.defaultInstance();

	        List<Employee> employeeList = new ArrayList<>();
	        List<Employee> workers = objectMapper.readValue(input,
	        typeFactory.constructCollectionType(ArrayList.class, Employee.class));

	        for (int i = 0; i < workers.size(); i++) {
	            String lastName = workers.get(i).getLastName();
	            String position = workers.get(i).getPosition();
	            String salary = workers.get(i).getSalary();

	            employeeList.add(new Employee(lastName, position, salary));
	            // for test purposes
	            System.out.println("JacksonParserOutput: __ " + lastName + "__" + position + "__" + salary);
	        }
	        return employeeList;
	    }
}
