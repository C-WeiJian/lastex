package rest;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MenuItem implements Serializable{

	private String name;
	private String description;
	private double price;
	private String type;
	private boolean isPromo;
	
	public MenuItem(String name, String description, double price, String type, boolean isPromo) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.type = type;
		this.isPromo = isPromo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isPromo() {
		return isPromo;
	}
	public void setPromo(boolean isPromo) {
		this.isPromo = isPromo;
	}
	
}
