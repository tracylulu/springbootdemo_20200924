package com.h3c.cll.entity;

public class TestObject {
	private String name;
	private String sex;
	private int age;
	private String email;
	private boolean isMng;
	
	public TestObject() {
	}
	
	public TestObject(String name,String sex,int age,String email,boolean isMng){
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.email=email;
		this.isMng=isMng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isMng() {
		return isMng;
	}

	public void setMng(boolean isMng) {
		this.isMng = isMng;
	}
	
	
}
