package com.invest19.performanceadmin.api.common;

import org.springframework.data.jpa.repository.Query;

public class Queries {

//	public static final String FIND_ORDER_DETAILS_BETWEEN_DATES = "\r\n"
//			+ "SELECT t.clientInv19Id, t.clientBowId, t.brokerInv19Id, t.loginTime, (SELECT b.brokerName FROM BrokerEntity b WHERE b.brokerInv19Id = t.brokerInv19Id), (SELECT COUNT(*) FROM o WHERE o.clientBowId=t.clientBowId AND BETWEEN :date_from AND :date_to AND t.clientBowId) as noOfTrades from TradeLogin t , Order o WHERE o.createTime BETWEEN :date_from AND :date_to AND t.clientBowId = o.clientBowId";

//	public static final String FIND_ORDER_DETAILS_BETWEEN_DATES = "select t.clientInv19Id, t.clientBowId, o.brokerInv19Id, t.loginTime, (select b.brokerName from BrokerEntity b where b.brokerInv19Id = o.brokerInv19Id), o.count, o.amount from TradeLogin t , Order o where o.createTime between :date_from and :date_to and t.clientBowId = o.clientBowId";

//	public static final String FIND_ORDER_DETAILS_BETWEEN_DATES = "select t.clientInv19Id, t.clientBowId, t.brokerInv19Id, "
//			+ "(SELECT b.brokerName from BrokerEntity b where b.brokerInv19Id=t.brokerInv19Id) as brokerName, t.loginTime"
//			+ ",(select count(*) from Order o where o.clientBowId=tm.clientBowId AND o.createTime BETWEEN :date_from AND :date_to) as totalTrade"
//			+ ",(select sum(amount) from Order o where o.clientBowId=tm.clientBowId AND o.createTime BETWEEN :date_from AND :date_to) as totalVolume"
//			+ ",(select count(*) from Order o where o.clientBowId=tm.clientBowId and o.buyOrSellIndicator='1.00' AND o.createTime BETWEEN :date_from AND :date_to) as totalSell"
//			+ ",(select count(*) from Order o where o.clientBowId=tm.clientBowId and o.buyOrSellIndicator='0.00' AND o.createTime BETWEEN :date_from AND :date_to) as totalBuy from TradeLogin t"
//			+ "inner join (select clientBowId, max(loginTime) as MaxDate from TradeLogin group by clientBowId) as tm on t.clientBowId = tm.clientBowId and t.loginTime = tm.MaxDate";

//	public static final String FIND_ORDER_DETAILS_BETWEEN_DATES="select clientBowId, max(loginTime) as MaxDate from TradeLogin group by clientBowId";

}
