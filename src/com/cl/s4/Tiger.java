package com.cl.s4;
//구현클래스 - 실제 객체 만드는 클래스
public class Tiger extends Animal{
	
	//호랑이만 가지고 있는 특징
	private String weapon;
	

	public String getWeapon() {
		return weapon;
	}


	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	//호랑이만 하는 행동
	public void wash() {
		System.out.println("온천욕");
	}


	@Override
	public void sound() {
		System.out.println("어흥!");
	
	}
	
	
}
