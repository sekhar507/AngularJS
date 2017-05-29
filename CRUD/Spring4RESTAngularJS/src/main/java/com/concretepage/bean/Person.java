package com.concretepage.bean;
public class Person {
	private int pid;
	private String location;
	private String name;
	public Person() {}
	public Person(int pid, String name, String location){
		this.pid = pid;
		this.location = location;
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
