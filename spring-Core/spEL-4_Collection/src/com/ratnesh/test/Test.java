package com.ratnesh.test;

import java.util.ArrayList;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.ratnesh.beans.City_state;
import com.ratnesh.beans.City_state_Collection;

public class Test {

	public static void main(String[] args) {

		City_state_Collection csc = new City_state_Collection();
		StandardEvaluationContext context = new StandardEvaluationContext(csc);
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression expr = parser.parseExpression("city_state.?[state == 'mah']");
		
		ArrayList<City_state> list = (ArrayList<City_state>) expr.getValue(context);
		
		for(City_state cs : list)
		{
			System.out.println(cs);
		}
		System.out.println(list);
	}

}
