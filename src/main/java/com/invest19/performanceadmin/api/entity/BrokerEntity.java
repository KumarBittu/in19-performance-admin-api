package com.invest19.performanceadmin.api.entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "inv19_broker_master")
public class BrokerEntity extends CommonEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "broker_inv19_id")
	private String  brokerInv19Id;

	@Column(name = "broker_name")
	private String brokerName;
	
	@Column(name = "broker_short_name")
	private String brokerShortName;

	@Column(name = "broker_dp_id")
	private String brokerDPId;
	
	@Column(name = "registration_no_cdsl")
	private String registrationNoCdsl;
	
	@Column(name = "registration_date_cdsl")
	private Date registrationDateCdsl;

	@Column(name = "clearing_member_cin_no")
	private String clearingMemberCinNo;
	
	@Column(name = "clearing_member_sebi_reg_no")
	private String clearingMemberSebiRegNo;
	
	@Column(name = "broker_nse_member_id")
	private BigInteger brokerNseMemberId;

	@Column(name = "broker_bse_member_id")
	private BigInteger brokerBseMemberId;

	@Column(name = "broker_nse_exch_name")
	private String brokerNseExchName;

	@Column(name = "broker_bse_exch_name")
	private String brokerBseExchName;

	@Column(name = "broker_nse_trading_id")
	private BigInteger brokerNseTradingId;

	@Column(name = "broker_bse_trading_id")
	private BigInteger brokerBseTradingId;

	@Column(name = "broker_website_url")
	private String brokerWebsiteUrl;

	@Column(name = "broker_backoffice_name")
	private String brokerBackofficeName;

	@Column(name = "broker_backoffice_url")
	private String brokerBackofficeUrl;

	@Column(name = "broker_register_off_add")
	private String brokerRegisterOffAdd;

	@Column(name = "broker_register_off_city")
	private String brokerRegisterOffCity;

	@Column(name = "broker_register_off_state")
	private String brokerRegisterOffState;

	@Column(name = "broker_register_off_pin")
	private String brokerRegisterOffPin;

	@Column(name = "broker_register_phone")
	private String brokerRegisterPhone;

	@Column(name = "broker_register_email")
	private String brokerRegisterEmail;

	@Column(name = "broker_register_fax")
	private String brokerRegisterFax;

	@Column(name = "broker_correspond_off_add")
	private String brokerCorrespondOffAdd;

	@Column(name = "broker_correspond_off_city")
	private String brokerCorrespondOffCity;

	@Column(name = "broker_correspond_off_state")
	private String brokerCorrespondOffState;

	@Column(name = "broker_correspond_off_pin")
	private String brokerCorrespondOffPin;

	@Column(name = "broker_correspond_phone")
	private String brokerCorrespondPhone;

	@Column(name = "broker_correspond_email")
	private String brokerCorrespondEmail;

	@Column(name = "broker_correspond_fax")
	private String brokerCorrespondFax;

	@Column(name = "broker_compliance_officer_name")
	private String brokerComplianceOfficerName;

	@Column(name = "broker_compliance_officer_phone")
	private String brokerComplianceOfficerPhone;

	@Column(name = "broker_compliance_officer_email")
	private String brokerComplianceOfficerEmail;

	@Column(name = "broker_ceo_name")
	private String brokerCeoName;

	@Column(name = "broker_ceo_phone")
	private String brokerCeoPhone;

	@Column(name = "broker_ceo_email")
	private String brokerCeoEmail;

	@Column(name = "broker_clearing_member_info")
	private String brokerClearingMemberInfo;

	@Column(name = "broker_sebi_reg_no_nse")
	private String brokerSebiRegNoNse;

	@Column(name = "broker_sebi_reg_no_bse")
	private String brokerSebiRegNoBse;
	
	@Column(name = "broker_sebi_reg_no_dp")
	private String brokerSebiRegNoDp;
	
	@Column(name = "broker_sebi_reg_bse_date")
	private Date brokerSebiRegBseDate;
	
	@Column(name = "broker_sebi_reg_nse_date")
	private Date brokerSebiRegNseDate;
	
	@Column(name = "broker_sebi_reg_dp_date")
	private Date brokerSebiRegDpDate;

	@Column(name = "broker_grievance_cell_info")
	private String brokerGrievanceCellInfo;

	@Column(name = "broker_customercare_no")
	private String brokerCustomercareNo;

	@Column(name = "broker_customercare_email")
	private String brokerCustomercareEmail;

	@Column(name = "broker_dp_type_nsdl")
	private String brokerDpTypeNsdl;

	@Column(name = "broker_dp_status_nsdl")
	private String brokerDpStatusNsdl;

	@Column(name = "broker_dp_name_nsdl")
	private String brokerDpNameNsdl;

	@Column(name = "broker_dp_address_nsdl")
	private String brokerDpAddressNsdl;

	@Column(name = "broker_dp_city_nsdl")
	private String brokerDpCityNsdl;

	@Column(name = "broker_dp_state_nsdl")
	private String brokerDpStateNsdl;

	@Column(name = "broker_dp_pin_nsdl")
	private String brokerDpPinNsdl;

	@Column(name = "broker_dp_phone_nsdl")
	private String brokerDpPhoneNsdl;

	@Column(name = "broker_dp_email_nsdl")
	private String brokerDpEmailNsdl;

	@Column(name = "broker_dp_website_nsdl")
	private String brokerDpWebsiteNsdl;

	@Column(name = "broker_dp_type_cdsl")
	private String brokerDpTypeCdsl;

	@Column(name = "broker_dp_status_cdsl")
	private String brokerDpStatusCdsl;

	@Column(name = "broker_dp_name_cdsl")
	private String brokerDpNameCdsl;

	@Column(name = "broker_dp_address_cdsl")
	private String brokerDpAddressCdsl;

	@Column(name = "broker_dp_city_cdsl")
	private String brokerDpCityCdsl;

	@Column(name = "broker_dp_state_cdsl")
	private String brokerDpStateCdsl;

	@Column(name = "broker_dp_pin_cdsl")
	private String brokerDpPinCdsl;

	@Column(name = "broker_dp_phone_cdsl")
	private String brokerDpPhoneCdsl;

	@Column(name = "broker_dp_email_cdsl")
	private String brokerDpEmailCdsl;

	@Column(name = "broker_dp_website_cdsl")
	private String brokerDpWebsiteCdsl;

	@Column(name = "broker_dp_compliance_name_nsdl")
	private String brokerDpComplianceNameNsdl;

	@Column(name = "broker_dp_compliance_phone_nsdl")
	private String broker_dpCompliancePhoneNsdl;

	@Column(name = "broker_dp_compliance_email_nsdl")
	private String brokerDpComplianceEmailNsdl;
	@Column(name = "broker_dp_compliance_name_cdsl")
	private String brokerDpComplianceNameCdsl;

	@Column(name = "broker_dp_compliance_phone_cdsl")
	private String brokerDpCompliancePhoneCdsl;

	@Column(name = "broker_dp_compliance_email_cdsl")
	private String brokerDpComplianceEmailCdsl;
	
	@Column(name = "broker_clearing_member_name")
	private String brokerClearingMemberName;
	
	@Column(name = "broker_clearing_member_addr")
	private String brokerClearingMemberAddr;
	
	@Column(name = "broker_clearing_member_city")
	private String brokerClearingMemberCity;
	
	@Column(name = "broker_clearing_member_state")
	private String brokerClearingMemberState;
	
	@Column(name = "broker_clearing_member_pin")
	private String brokerClearingMemberPin;
	
	@Column(name = "broker_clearing_member_phone")
	private String brokerClearingMemberPhone;
	
	@Column(name = "broker_clearing_member_fax")
	private String brokerClearingMemberFax;
	
	@Column(name = "broker_clearing_member_email")
	private String brokerClearingMemberEmail;
	
	@Column(name = "broker_clearing_member_website")
	private String brokerClearingMemberWebsite;
	
	@Column(name = "broker_logo_url")
	private String brokerLogoUrl;

	@Column(name = "broker_created_by")
	private String brokerCreatedBy;

	@Column(name = "broker_updated_by")
	private String brokerUpdatedBy;
	
	@Column(name = "broker_star_rating")
	private BigInteger brokerStarRating;
	
	@Column(name = "broker_grievance_email_id")
	private String brokerGrievanceEmailId;
	
	@Column(name = "broker_upcoming_flag")
	private int brokerUpcomingFlag;
	
	@Column(name = "broker_stamp_url")
	private String brokerStampUrl;

	@Column(name = "broker_mail_host")
	private String brokerMailHost;

	@Column(name = "broker_mail_port")
	private Integer brokerMailPort;

	@Column(name = "broker_mail_id")
	private String brokerMailId;

	@Column(name = "broker_mail_password")
	private String brokerMailPassword;
	
    private boolean isEnabled;

}
