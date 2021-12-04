package com.invest19.performanceadmin.api.usecase;

import java.util.LinkedList;

public interface PerformanceUseCase {
	public LinkedList getAllOrderDetailsBetweenDates(String date_from, String date_to);
	
	public LinkedList getAllTransactionDetailsBetweenDatesForUser(String date_from, String date_to, String ClientBowId);
}
