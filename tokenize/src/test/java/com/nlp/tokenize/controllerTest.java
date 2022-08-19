package com.nlp.tokenize;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class controllerTest{
	String input="show my appointment";
	 
	static String inputInJson;
	 
	@Test
	public void informationTest(){
		
		 List<String> expected = Arrays.asList("show","my","appointment");
		 List<String>  actual= new ArrayList<String>();
		  String inputInJson[]=input.split(" ");
	        for(String y:inputInJson){
	            try{
	                actual.add(y);
	            }
	            catch(Exception e){}
	        }
	        assertFalse(actual.isEmpty());
	        assertTrue(actual.contains("appointment"));
	 }
	
}
