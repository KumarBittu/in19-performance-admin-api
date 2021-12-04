package com.invest19.performanceadmin.api.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.transaction.annotation.Transactional;

//import com.invest19.trade.auth.entity.CompositePrimaryID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "inv19_client_broker_mapping")
@Transactional
public class Inv19ClientBrokerMapping {

	@Id
	@Column(name = "client_inv19_id")
	private String clientInv19Id;
	
	@Column(name="broker_inv19_id")
	private String brokerInv19Id; 
	

	@Column(name = "client_bow_id")
	private String clientBowId;

	@Column(name = "client_ucc")
	private String clientUcc;

	@Column(name = "client_name")
	private String clientName;

	@Column(name = "client_email")
	private String clientEmail;

	@Column(name = "client_mobile_no")
	private String clientMobileNo;

	@Column(name = "client_pan")
	private String clientPAN;

	@Column(name = "status_flag")
	private String statusFlag;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "is_invest19_user")
	private Boolean isInvest19User;

	@Column(name = "client_pos_status")
	private Boolean posStatus;

	@Column(name = "profile_pic_url")
	private String profilePicUrl;

}
