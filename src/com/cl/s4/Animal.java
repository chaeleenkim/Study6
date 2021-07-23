package com.cl.s4;
//추상클래스
public class Animal {
	
	private String name;
	private int age;
	
	//동물마다 다른 소리 - 추상메서드로 오버라이딩 시킴
	public void sound() {};


	//setter, getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
