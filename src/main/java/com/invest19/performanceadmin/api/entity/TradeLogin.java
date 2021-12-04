package com.invest19.performanceadmin.api.entity;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "inv19_trade_login")
public class TradeLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private int id;

	@Column(name = "client_inv19_id")
	private String clientInv19Id;

	@Column(name = "client_bow_id")
	private String clientBowId;

	@Column(name = "broker_inv19_id")
	private String brokerInv19Id;

	@Column(name = "login_time")
	private Timestamp loginTime;

	@Column(name = "platform")
	private String Platform = "Android";
}
