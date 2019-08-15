package com.anand;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

public class App implements RequestHandler<Numbers, APIGatewayProxyResponseEvent>
{
	public APIGatewayProxyResponseEvent handleRequest(Numbers input, Context context) {
		
		APIGatewayProxyResponseEvent response=new APIGatewayProxyResponseEvent();
		response.setBody("Sum of two numbers is : " + (input.getNumber1()+input.getNumber2()));
		return response;
	}
}
