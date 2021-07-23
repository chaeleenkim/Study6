package com.cl.s4;

public class S4Main {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		tiger.sound();
		tiger.wash();
		
		cat.sound();
		cat.drop();
		
		dog.sound();
		dog.guard();
		
		
		//에러, 타입이 다름
		//tiger = cat;
		
		//case
		//모으려고하는데이터타입 [] 변수명;
		//Tiger is a Animal
		//Tiger 타입은 Animal 타입 이다
		
		//Animal 클래스는 객체 못 만들어도 선언은 가능
		//Tiger 타입을 Animal 타입으로 형변환
		Animal animal = tiger;
		
		//Cat타입은 Animal타입이다
		animal = cat;
		animal = dog;
		
		Animal [] animals = new Animal[3];
		animals[0] = tiger;
		animals[1] = cat;
		animals[2] = dog;
		
		for(int i=0; i<animals.length; i++) {
			animals[i].sound();
		}
		
		System.out.println("============================================");
		
		//호랑이 타입에 넣을 수 없다
		Animal a = animals[1];
		
		
		//instanceof A: A입니까? 
		System.out.println(a instanceof Tiger); //falses


//		a.sound();
//		//에러, 호랑이가 아닐 수 있으면 호랑이 행동 시킬 수 없다 
//		//부모가 알고 있는 것만 가능
//		//a.wash();
//		
//		//다시 호랑이로 원상복구 : 형변환
//		Tiger t = (Tiger)a;
//		
//		t.sound();
//		t.wash();
		
	}

}
