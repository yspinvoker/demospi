package com.ysp.annotation;

import java.lang.annotation.*;

/**
 * 注解上面不加 Retention(什么时候有效)，那么往往在程序中就获取不到相应大注解了
 *
 * @author Elon-apple
 *
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {

	String author() default "Pankaj";

	String date();//没有默认值的注解元素 ，就必须在使用时 给它值

	int revision() default 1;

	String comments();
}

