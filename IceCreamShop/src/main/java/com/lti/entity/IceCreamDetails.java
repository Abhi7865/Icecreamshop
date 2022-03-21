package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "IceCreamDetails")
public class IceCreamDetails {
	@Id
	@GeneratedValue
	private int IceCreamNo;

	private String flaver;
	private String name;
	private double price;

	@ManyToOne
	@JoinColumn(name = "shop_id")
	private IceCreamShops ics;

	public int getIceCreamNo() {
		return IceCreamNo;
	}

	public void setIceCreamNo(int iceCreamNo) {
		IceCreamNo = iceCreamNo;
	}

	public String getFlaver() {
		return flaver;
	}

	public void setFlaver(String flaver) {
		this.flaver = flaver;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public IceCreamShops getIcs() {
		return ics;
	}

	public void setIcs(IceCreamShops ics) {
		this.ics = ics;
	}

}
