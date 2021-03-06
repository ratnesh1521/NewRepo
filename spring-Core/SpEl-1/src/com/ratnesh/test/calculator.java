package com.ratnesh.test;


import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class calculator {

	public static void main(String[] args)throws Exception {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expr = parser.parseExpression("10+10");
		int val1 = (int) expr.getValue();
		System.out.println(val1);
		
		
		expr = parser.parseExpression("10*10");
		int val2 = (Integer)expr.getValue();
		System.out.println(val2);
		
		expr = parser.parseExpression("'abc'+'def'");
		String str = (String) expr.getValue();
		System.out.println(str);
		
		/*
		expr = parser.parseExpression(true+true);
		boolean b = (boolean)expr.getValue();
		System.out.println(b);
		*/
	}

}
