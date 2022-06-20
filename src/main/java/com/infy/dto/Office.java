package com.infy.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="office_tbl")
public class Office {
	@Id
	@Column(name="oId")
	int oId;
	@Column(name="oStreet", length=20)
	String oStreet;
	@Column(name="oCity", length=20)
	String oCity;
	public Office() {
		super();
	}
	public Office(int oId, String oStreet, String oCity) {
		super();
		this.oId = oId;
		this.oStreet = oStreet;
		this.oCity = oCity;
	}
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getoStreet() {
		return oStreet;
	}
	public void setoStreet(String oStreet) {
		this.oStreet = oStreet;
	}
	public String getoCity() {
		return oCity;
	}
	public void setoCity(String oCity) {
		this.oCity = oCity;
	}
	@Override
	public String toString() {
		return "Office [oId=" + oId + ", oStreet=" + oStreet + ", oCity=" + oCity + "]";
	}
	

}
