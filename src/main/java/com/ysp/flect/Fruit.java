package com.ysp.flect;


import com.ysp.annotation.ClassInfo;
import com.ysp.annotation.FieldInfo;
import com.ysp.annotation.MethodInfo;

@ClassInfo(className="水果类",isEffect=true)
public class Fruit {

	@FieldInfo(fieldLength=9)
	public String fruitSize;

	@FieldInfo(fieldLength=10)
	public String fruitColor;

	@MethodInfo(author="elon",comments="水果成长",date="2016-05-31")
	public void fruitGrow(){
		System.out.println("----------fruitGrow()----");
	}

	@MethodInfo(revision=1,date="2013-02-22",comments="水果说hello")
	public String fruitSayHello(){
		System.out.println("-------------fruitSayHello()----------");
		return "sayHello";
	}

	public static void main(String[] args) {

	}
}
