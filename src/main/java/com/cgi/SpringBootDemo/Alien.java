package com.cgi.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype") //the moment you say prototype the instance or obj will not be created by default for you.
//it will be created when you ask for a bean or getBean() : 2 times obj created as we asked getBean two times. So object ondefault not created in spring container

public class Alien {
	private int aId;
	private String aName;
	private String tech;
	
	@Autowired  //when we specify this as Autowired then only we get the bean or obj of laptop from the Spring Container 
	@Qualifier("lap1") // to search the obj or bean by name .: name changed by default(laptop) to lap1
	private Laptop laptop; //laptop type is a special type coming from laptop class
	
	public Alien() {
		super(); //object created
		System.out.println("obj created"); //by default obj will be created only once and spring so called singleton design pattern
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aName=" + aName + ", tech=" + tech + "]";
	}
	public void show() {
		System.out.println("retun this for alien");
		laptop.compile();
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	
	
	
}
