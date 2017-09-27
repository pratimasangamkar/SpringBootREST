package com.java8.examples;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashronDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScriptEngineManager script = new ScriptEngineManager();
		ScriptEngine nashron = script.getEngineByName("nashorn");
		
		String name = "Pratima";
		Integer result;
		
		try{
			nashron.eval("print('" +name+ "')");
			result = (Integer) nashron.eval("10+2");
			System.out.println(result.toString());
		}catch(ScriptException e){
			System.out.println("Error executing script : "+e.getMessage());
		}
		
	//	System.out.println(result.toString());
	}

}
