package jdk5andabove;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Retention;
@Retention(RUNTIME)
public @interface Nonveg {
public int ratio();
public String val() default"";
public String[] values();
}
