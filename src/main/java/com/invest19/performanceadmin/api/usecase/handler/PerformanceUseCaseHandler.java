package com.invest19.performanceadmin.api.usecase.handler;

import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.codehaus.jettison.json.JSONObject;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invest19.performanceadmin.api.adapter.repository.OrderRepository;
import com.invest19.performanceadmin.api.common.Queries;
import com.invest19.performanceadmin.api.entity.Order;
import com.invest19.performanceadmin.api.usecase.PerformanceUseCase;

@Service
public class PerformanceUseCaseHandler implements PerformanceUseCase {

	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	OrderRepository orderRepository;

	@Override
	public LinkedList getAllOrderDetailsBetweenDates(String date_from, String date_to) {
		LinkedList linkedList = new LinkedList();
		try {

			List<Object[]> list = orderRepository.getAllOrderDetailsBetweenDates(Timestamp.valueOf(date_from),
					Timestamp.valueOf(date_to));
			System.out.println("list :" + list);

			for (Object[] Obj : list) {
				JSONObject jsonObj = new JSONObject();
				jsonObj.put("ClientInv19Id", Obj[0]);
				jsonObj.put("ClientBowId", Obj[1]);
				jsonObj.put("BrokerInv19Id", Obj[2]);
				jsonObj.put("BrokerName", Obj[3]);
				jsonObj.put("LastLoginTime", Obj[4]);
				jsonObj.put("TotalTrade", Obj[5]);
				jsonObj.put("TotalVolume", Obj[6]);
				jsonObj.put("totalSell", Obj[7]);
				jsonObj.put("totalBuy", Obj[8]);

				linkedList.add(jsonObj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return linkedList;
	}

	@Override
	public LinkedList getAllTransactionDetailsBetweenDatesForUser(String date_from, String date_to,
			String ClientBowId) {
		LinkedList<Order> list = orderRepository.getAllTransactionDetailsBetweenDatesForUser(Timestamp.valueOf(date_from),
				Timestamp.valueOf(date_to), ClientBowId);
		return list;
	}
}
