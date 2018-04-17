package com.zhangfengyi.tank.test;

public class Review {
	public static void main(String[] args) {
		Person p = new Person("laowang");
		p.v = new Broom();
		p.go("东北");
	}
}

class Person {
	public String name;
	public Vehicle v;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void go(String dest) {
		System.out.println(name + "驾驶着");
		v.run();
		System.out.println("去了" + dest);
	}
}

abstract class Vehicle {
	public abstract void run();
}

class Car extends Vehicle {

	@Override
	public void run() {
		System.out.println("Car run");
	}
	
}

class Broom extends Vehicle {

	@Override
	public void run() {
		System.out.println("Broom fly");
	}
	
}
