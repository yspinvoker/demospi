package com.ysp.flect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射只能拿到 非private字段和方法
 *
 * @author Elon-apple
 *
 */
public class AnnotationMain {

	public static void main(String[] args) throws Exception {

		Class<Fruit> fClass = (Class<Fruit>) AnnotationMain.class.getClassLoader().loadClass("com.ysp.flect.Fruit");
		/** 获取类的相关 注解(只和类有关) **/
		Annotation[] annotations = fClass.getAnnotations();
		System.out.println("---------------------fClass:annotations---------------------------");
		for (int i = 0; i < annotations.length; i++) {
			System.out.println("-------fClass:annotations" + annotations[i]);
		}
		System.out.println("=======================================================");
		System.out.println("---------------------methods---------------------------");
		Method[] methods = fClass.getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println("=============methods:" + methods[i]);
		}
		System.out.println("=======================================================");
		System.out.println("---------------------fields---------------------------");
		Field[] fields = fClass.getFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println("=============fields:" + fields[i]);
		}
		System.out.println("=======================================================");

		System.out.println("---------------------methods annotation---------------------------");
		for (int i = 0; i < methods.length; i++) {
			/** 得到该方法的注解 **/
			annotations = methods[i].getAnnotations();
			for (int j = 0; j < annotations.length; j++) {
				System.out.println("-------methods:annotations" + methods[i] + "*****" + annotations[j]);
			}
		}
		System.out.println("=======================================================");
		System.out.println("---------------------fields annotation---------------------------");
		for (int k = 0; k < fields.length; k++) {
			/** 得到该方法的注解 **/
			annotations = fields[k].getAnnotations();
			for (int j = 0; j < annotations.length; j++) {
				System.out.println("-------fields:annotations" + fields[k] + "*****" + annotations[j]);
			}
		}
		System.out.println("=======================================================");
	}

}
