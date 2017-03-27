package edu.hm.cs.swa.lab01;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)

public @interface RenderMe {
	String with() default " ";
}
