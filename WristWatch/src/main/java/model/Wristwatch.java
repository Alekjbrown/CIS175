package model;

public class Wristwatch {
	private String country;
	private boolean isNew;
	private double msrp;
	
	//Getters & Setters
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isNew() {
		return isNew;
	}
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	public double getMsrp() {
		return msrp;
	}
	public void setMsrp(double msrp) {
		this.msrp = msrp;
	}
	
	//Constructors
	
	public Wristwatch(String country) {
		super();
		this.country = country;
	}
	public Wristwatch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

