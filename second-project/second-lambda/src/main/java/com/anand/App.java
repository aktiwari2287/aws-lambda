package com.anand;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

/**
 * Hello world!
 *
 */
public class App implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent>
{

	public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent input, Context context) {
		input.getHttpMethod();
		System.out.println(input.getBody());
		System.out.println(input.getResource());
		APIGatewayProxyResponseEvent res= new APIGatewayProxyResponseEvent();
		res.setBody("The method is " + input.getHttpMethod() +" query string is " + input.getQueryStringParameters() +
				"Body is " +  input.getBody());
		res.setStatusCode(200);
		return res;
	}
	
}
