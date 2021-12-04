package com.invest19.performanceadmin.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.AllArgsConstructor;
import lombok.Getter;

@JsonAutoDetect
@Getter
@AllArgsConstructor
public class ErrorMessage {
	private String message;
	private int statusCode;
}
