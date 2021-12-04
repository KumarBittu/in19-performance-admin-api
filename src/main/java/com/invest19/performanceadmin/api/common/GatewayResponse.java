package com.invest19.performanceadmin.api.common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Getter;

/**
 * POJO containing response object for API Gateway.
 */
@Getter
@JsonAutoDetect
public class GatewayResponse<T> {

	private final T body;
	private final Map<String, String> headers;

	/**
	 * Creates a GatewayResponse object.
	 * 
	 * @param body       body of the response
	 * @param headers    headers of the response
	 * @param statusCode status code of the response
	 */
	public GatewayResponse(final T body, final Map<String, String> headers) {
		this.body = body;
		this.headers = Collections.unmodifiableMap(new HashMap<>(headers));
	}
}