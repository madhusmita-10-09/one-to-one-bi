package com.ty.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class GST {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int  gstnumber;
	private String state;
	private String country;
	@OneToOne
	@JoinColumn
	private Company company;
	
	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the gstnumber
	 */
	public int getGstnumber() {
		return gstnumber;
	}
	/**
	 * @param gstnumber the gstnumber to set
	 */
	public void setGstnumber(int gstnumber) {
		this.gstnumber = gstnumber;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	

}
