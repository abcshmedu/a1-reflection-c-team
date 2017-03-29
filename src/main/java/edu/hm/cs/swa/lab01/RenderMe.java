package edu.hm.cs.swa.lab01;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)

public @interface RenderMe {
	String with() default "";
}
