package model;

import javax.persistence.*;

@Entity
@Table(name="shopper")
public class Shopper {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SHOPPER_ID")
	private int id;
	
	@Column(name="SHOPPER_NAME")
	private String shopperName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShopperName() {
		return shopperName;
	}
	public void setShopperName(String shopperName) {
		this.shopperName = shopperName;
	}
	public Shopper() {
		super();
		//  Auto-generated constructor stub
	}
	public Shopper(int id, String shopperName) {
		super();
		this.id = id;
		this.shopperName = shopperName;
	}
	public Shopper(String shopperName) {
		super();
		this.shopperName = shopperName;
	}
	@Override
	public String toString() {
		return "Shopper [id=" + id + ", shopperName=" + shopperName + "]";
	}
	
	
}
