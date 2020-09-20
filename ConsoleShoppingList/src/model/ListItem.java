package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class ListItem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="STORE")
	private String store;
	
	@Column(name="ITEM")
	private String item;
	
	//constructors
	public ListItem(String store, String item) {
		super();
		this.store = store;
		this.item = item;
	}
	public ListItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}

	//print method
	public String returnItemDetails() {
		return store + ": " + item;
	}
}
