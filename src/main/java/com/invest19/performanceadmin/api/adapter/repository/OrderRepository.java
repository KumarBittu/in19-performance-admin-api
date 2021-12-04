package com.invest19.performanceadmin.api.adapter.repository;

import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.invest19.performanceadmin.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order, String> {

	@Query(value = "select t.client_inv19_id, t.client_bow_id,t.broker_inv19_id,\r\n"
			+ "(SELECT b.broker_name from inv19_broker_master b \r\n"
			+ " where b.broker_inv19_id=t.broker_inv19_id), t.login_time,\r\n"
			+ " (select count(*) from inv19_order o where o.client_bow_id=tm.client_bow_id AND o.create_time BETWEEN :date_from AND :date_to) as total_trade,\r\n"
			+ " (select sum(amount) from inv19_order o where o.client_bow_id=tm.client_bow_id AND o.create_time BETWEEN :date_from AND :date_to) as total_volume,\r\n"
			+ " (select count(*) from inv19_order o where o.client_bow_id=tm.client_bow_id and buy_or_sell_indicator='1.00' AND o.create_time BETWEEN :date_from AND :date_to) as total_sell,\r\n"
			+ " (select count(*) from inv19_order o where o.client_bow_id=tm.client_bow_id and buy_or_sell_indicator='0.00' AND o.create_time BETWEEN :date_from AND :date_to) as total_buy\r\n"
			+ "from inv19_trade_login t\r\n" + "inner join ( \r\n"
			+ "	select client_bow_id, max(login_time) as MaxDate \r\n" + "	from inv19_trade_login \r\n"
			+ "	group by client_bow_id\r\n"
			+ ") tm on t.client_bow_id = tm.client_bow_id and t.login_time = tm.MaxDate", nativeQuery = true)
	public List<Object[]> getAllOrderDetailsBetweenDates(@Param("date_from") Timestamp date_from,
			@Param("date_to") Timestamp date_to);

	@Query(value = "SELECT * from inv19_order where client_bow_id = :client_bow_id AND create_time BETWEEN :date_from AND :date_to", nativeQuery = true)
	public LinkedList<Order> getAllTransactionDetailsBetweenDatesForUser(@Param("date_from") Timestamp date_from,
			@Param("date_to") Timestamp date_to, @Param("client_bow_id") String client_bow_id);

}
