package com.cl.s1;

public class S1Main {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		Phone phone = new Phone();
		Tablet tablet = new Tablet();
		
		computer.setBrand("Imac");
		phone.setBrand("Apple");
		tablet.setBrand("Samsung");		
		
		//코드에 빨간 줄 - 컴파일 에러
		//선언은 가능하지만 객체를 만들 수 없다
		//Product product = new Product();
		//abstract : 부모역할만 하고 상속받아서 쓰세요
		
		//메서드는 같지만 info의 내용은 다르다 : 오버라이딩
		computer.info();
		phone.info();
		tablet.info();
		
		computer.info2();

	}

}
