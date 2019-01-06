package com.ysp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解上面不加 Retention(什么时候有效)，那么往往在程序中就获取不到相应大注解了
 *
 * @author Elon-apple
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.FIELD)
public @interface FieldInfo {

	public int fieldLength() default 5;

}
