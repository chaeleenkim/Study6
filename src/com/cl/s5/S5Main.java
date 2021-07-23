package com.cl.s5;

public class S5Main {

	public static void main(String[] args) {
		
		//캐릭터 생성
		Character character = new Character();
		
		//객체 생성 전에는 null
		//System.out.println(character.sword); 
		
		//Sword 객체 생성해야 attack 쓸 수 있음
		Sword sword = new Sword();
		character.weapon = sword;
		
		//character.sword = sword;
		character.weapon.attack();
		
		//사냥 성공했더니 Gun을 드랍
		Gun gun = new Gun();
		character.weapon = gun;
		character.weapon.attack();
		
		
		
	}

}
