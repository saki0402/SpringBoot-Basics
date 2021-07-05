package com.cgi.SpringBootDemo;

import org.springframework.stereotype.Component;

@Component("lap1")  //this will create an object in the Spring container and to get the object of this they need to use @Autowired
public class Laptop {
	private int Id;
	private String brand;
	
	public Laptop() {
		super();
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [Id=" + Id + ", brand=" + brand + "]";
	}
	
	public void compile() {
		System.out.println("compilling......");
	}
	
}
