package com.ysp.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 注解上面不加 Retention(什么时候有效)，那么往往在程序中就获取不到相应大注解了
 *
 * @author Elon-apple
 *
 */
@Retention(value=RetentionPolicy.RUNTIME)
public @interface ClassInfo {

	public String className() default "默认类名";

	public boolean isEffect() default false;
}
