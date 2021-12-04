package com.invest19.performanceadmin.api.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "inv19_order")
public class Order {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	String orderId;
	
	@Column(name = "client_bow_id")
	String clientBowId;

	@Column(name = "client_inv19_id")
	String clientInv19Id;

	@Column(name = "broker_inv19_id")
	String brokerInv19Id;

	@Column(name = "symbol")
	String symbol;

	@Column(name = "buy_or_sell_indicator")
	BigInteger buyOrSellIndicator;

	@Column(name = "create_time")
	Timestamp createTime;

	@Column(name = "count")
	BigInteger count;

	@Column(name = "amount")
	BigDecimal amount;

}
