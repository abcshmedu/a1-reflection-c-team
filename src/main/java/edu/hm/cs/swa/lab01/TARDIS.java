package edu.hm.cs.swa.lab01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * TARDIS A Annotation class for testing purpose.
 * 
 * @author Michael Eggers
 * @author Rebecca Brydon
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface TARDIS {
  /**
   * with Optional.
   * 
   * @return String
   */
  String with() default "DOCTOR WHO?!";
}
