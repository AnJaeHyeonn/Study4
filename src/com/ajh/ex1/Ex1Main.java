package com.ajh.ex1;

public class Ex1Main {
	public static void main(String[] args) {
		System.out.println("Ex1 Start");

		// 캐릭터 - 이름, 레벨, 체력, 마나, 골드

		// 몬스터 - 이름, 레벨, 체력, 마나, 골드

		// 무기 - 이름, 공격력, 공격성공률, 강화
		
		// 펫 - 이름, 레벨, 친밀도

		// 캐릭터 생성
		Character ch = new Character();
		ch.name = "안재현";
		ch.level = 30;
		ch.hp = 50000;
		ch.mp = 30000;
		ch.gold = 3000;
		System.out.println(ch.weapon); //null

		// 무기 생성
		Weapon wp = new Weapon();
		wp.name = "낡은검";
		wp.damage = 3500;
		wp.critical = 0.7;
		wp.upgrade = 7;

		ch.weapon = wp;
		System.out.println(ch.weapon.name); //낡은검

		// ch가 가지고 있는 무기의 이름 변경 후 출력
		ch.weapon.name = "지팡이";
		System.out.println(ch.weapon.name); //지팡이
		wp.name = "도끼";
		System.out.println(ch.weapon.name); // 도끼

		// 몬스터 생성
		Monster mon = new Monster();
		mon.name = "고블린";
		mon.level = 25;
		mon.hp = 10000;
		mon.mp = 5000;
		mon.gold = 1000;
		mon.weapon = new Weapon();
		mon.weapon.name = "몽둥이";
		mon.weapon.damage = 200;
		mon.weapon.critical = 0.8;
		mon.weapon.upgrade = 3;

		System.out.println(mon.weapon.name); //몽둥이

		// ch = monster; 타입이 달라서 에러

		ch.gold = ch.gold + mon.gold;
		ch.weapon = mon.weapon; // 몬스터의 무기로 바꿔끼기

		System.out.println("이름 : " + ch.name);
		System.out.println("레벨 : " + ch.level);
		System.out.println("체력 : " + ch.hp);
		System.out.println("마나 : " + ch.mp);
		System.out.println("골드 : " + ch.gold);
		System.out.println("무기이름 : " + ch.weapon.name);
		System.out.println("무기공격력 : " + ch.weapon.damage);
		System.out.println("무기 공격성공률 : " + ch.weapon.critical);
		System.out.println("무기강화 : " + ch.weapon.upgrade);
		System.out.println("==============================");

		System.out.println("이름 : " + mon.name);
		System.out.println("레벨 : " + mon.level);
		System.out.println("체력 : " + mon.hp);
		System.out.println("마나 : " + mon.mp);
		System.out.println("골드 : " + mon.gold);
		System.out.println("==============================");

		mon = new Monster();

		System.out.println("Ex1 Finish");
	}

}
