package com.lti.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "IceCreamShopDetails")
public class IceCreamShops {
	@Id
	@GeneratedValue
	private int Shopid;
	private String Shopname;
	private String OwnarName;
	private String Address;

	@OneToMany(mappedBy = "ics")
	private List<IceCreamDetails> icd;

	public String getShopname() {
		return Shopname;
	}

	public void setShopname(String shopname) {
		Shopname = shopname;
	}

	public String getOwnarName() {
		return OwnarName;
	}

	public void setOwnarName(String ownarName) {
		OwnarName = ownarName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public List<IceCreamDetails> getIcd() {
		return icd;
	}

	public void setIcd(List<IceCreamDetails> icd) {
		this.icd = icd;
	}

	public void setShopid(int shopid) {
		Shopid = shopid;
	}

	public int getshopid() {
		return Shopid;
	}

}
