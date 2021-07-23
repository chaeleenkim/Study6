package com.cl.s4;

public class Cat extends Animal{
	

	@Override
	public void sound() {
		System.out.println("야옹!");
	}
	
	//고양이만 하는 행동
	public void drop() {
		System.out.println("물건 떨구기");
	}
}
