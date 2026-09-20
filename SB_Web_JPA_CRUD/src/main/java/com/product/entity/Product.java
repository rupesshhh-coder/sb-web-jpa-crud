package com.product.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sb_product")
public class Product implements Serializable {

	@Id
	private int pid;
	private String pname;
	private float cost;
	private String category;
	private int qty;

	public Product() {

	}

	public Product(int pid, String pname, float cost, String category, int qty) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.cost = cost;
		this.category = category;
		this.qty = qty;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
