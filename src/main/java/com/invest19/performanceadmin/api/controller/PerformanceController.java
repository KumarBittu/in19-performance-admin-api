package com.invest19.performanceadmin.api.controller;

import java.util.LinkedList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.invest19.performanceadmin.api.common.GatewayResponse;
//import com.invest19.performanceadmin.api.entity.OrderDetails;
import com.invest19.performanceadmin.api.usecase.PerformanceUseCase;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class PerformanceController {

	@Autowired
	private PerformanceUseCase performanceUseCase;

	private static final Logger LOG = LoggerFactory.getLogger(PerformanceController.class);

	@ApiOperation(value = "Get Order details in between given dates", notes = "Get Order details in between given dates", response = GatewayResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid date range") })
	@GetMapping(value = "/performance/get/all/orders/details/between/dates")
	@ResponseBody
	public String getAllOrderDetailsBetweenDates(@RequestParam(name = "date_from") String date_from,
			@RequestParam(name = "date_to") String date_to) {
		LinkedList jsonArr = performanceUseCase.getAllOrderDetailsBetweenDates(date_from, date_to);
		return jsonArr.toString();
	}

	@ApiOperation(value = "Get Order details in between given dates", notes = "Get Order details in between given dates", response = GatewayResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid date range") })
	@GetMapping(value = "/performance/get/all/transaction/details/between/dates/for/user")
	@ResponseBody
	public String getAllTransactionDetailsBetweenDatesForUser(@RequestParam(name = "date_from") String date_from,
			@RequestParam(name = "date_to") String date_to, @RequestParam(name = "ClientBowId") String ClientBowId) {
		LinkedList jsonArr = performanceUseCase.getAllTransactionDetailsBetweenDatesForUser(date_from, date_to,
				ClientBowId);
		return jsonArr.toString();
	}
}
