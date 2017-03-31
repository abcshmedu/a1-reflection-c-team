package edu.hm.cs.swa.lab01;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)

/**
 * RenderMe 
 * @author Michael Eggers
 * @author Rebecca Brydon
 *
 */
public @interface RenderMe {
	String with() default "";
}
