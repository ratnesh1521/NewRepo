package com.ratnesh.test;

import java.beans.Expression;
import java.util.ArrayList;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.ratnesh.beans.TownState_Collection;
import com.ratnesh.beans.Town_State;



public class Test {

	public static void main(String[] args) throws Exception {
		TownState_Collection tsc = new TownState_Collection();
		StandardEvaluationContext context = new StandardEvaluationContext(tsc);
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression expr = (Expression) parser.parseExpression("town_state.?[state=='bihar']");
		
		ArrayList<Town_State> list = (ArrayList<Town_State>) expr.getValue(context);
		/*
		for(Town_State tsc : list)
		{
			System.out.println(tsc);
		}
		
	*/
	}

}
