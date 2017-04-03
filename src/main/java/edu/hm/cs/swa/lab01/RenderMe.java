package edu.hm.cs.swa.lab01;

import java.lang.annotation.*;

/**
 * RenderMe.
 * 
 * @author Michael Eggers
 * @author Rebecca Brydon
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RenderMe {
  /**
   * Optional given RenderClass.
   * 
   * @return String
   */
  String with() default "";
}
