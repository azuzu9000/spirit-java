package goit.module11.practice.lesson2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Repeat {
    //String value() default "";
    
    int value() default 1;
}
