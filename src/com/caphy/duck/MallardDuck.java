package com.caphy.duck;


import com.caphy.behavior.impl.FlyWithWings;
import com.caphy.behavior.impl.Quack;


public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display(){
		System.out.println("I'm a real Mallard duck!");
	}
}
 
