package com.caphy.behavior.impl;


import com.caphy.behavior.QuackBehavior;

/**
 * @author 作者 E-mail: 
 * @version 创建时间：2017-7-14 上午10:08:50 
 * 类说明 
 */
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("我不会叫!");
		
	}

}
 