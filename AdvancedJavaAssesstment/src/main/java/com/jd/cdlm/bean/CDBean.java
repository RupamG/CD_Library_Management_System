package com.jd.cdlm.bean;

public class CDBean {
	private int cdId;							
	private String cdName;						
	private int releaseYear;					
	private double price;
	public CDBean() {}
	
	public CDBean(int cdId, String cdName, int releaseYear, double price) {
		super();
		this.cdId = cdId;
		this.cdName = cdName;
		this.releaseYear = releaseYear;
		this.price = price;
	}

	public int getCdId() {
		return cdId;
	}
	public void setCdId(int cdId) {
		this.cdId = cdId;
	}
	public String getCdName() {
		return cdName;
	}
	public void setCdName(String cdName) {
		this.cdName = cdName;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
