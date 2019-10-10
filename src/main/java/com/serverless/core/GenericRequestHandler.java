package com.serverless.core;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public abstract class GenericRequestHandler<I,O> implements RequestHandler<I, O> {

	@Override
	public O handleRequest(I input, Context context) {
		
		
		return null;
	}

	
}
