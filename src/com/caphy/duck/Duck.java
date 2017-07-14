package com.caphy.duck;

import com.caphy.behavior.QuackBehavior;
import com.caphy.behavior.impl.FlyWithWings;

public abstract class Duck {
	QuackBehavior quackBehavior;
	FlyWithWings flyBehavior;

	public abstract void display();
	
	public void performQuack(){
		quackBehavior.quack();
	}
	public void performFly(){
		flyBehavior.fly();
	}
}
 