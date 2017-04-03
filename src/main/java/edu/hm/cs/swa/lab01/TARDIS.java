package edu.hm.cs.swa.lab01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

/**
 * TARDIS 
 * @author Michael Eggers
 * @author Rebecca Brydon
 *
 */
public @interface TARDIS {
	String with() default "DOCTOR WHO?!";
}
