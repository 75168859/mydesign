package cn.stu.simpleFactory;

import java.text.DateFormat;

public class Test {

	public static void main(String[] args) {

		DateFormat df = DateFormat.getInstance();//jdk提供的简单工厂
		
		
		//Apple apple = new Apple();//控制不反转
		
		//不支持反射的语言做到这一步即可
		Fruit fruit1 = FruitFactory.getInstance("apple");
		fruit1.grow();
		
		
		Fruit fruit2 = FruitFactory.getInstance();
		fruit2.grow();
		
	}

}
