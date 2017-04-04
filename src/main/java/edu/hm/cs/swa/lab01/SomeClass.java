package edu.hm.cs.swa.lab01;

import java.util.*;

/**
 * SomeClass to try out RenderMe.
 * 
 * @author Michael Eggers
 * @author Rebecca Brydon
 *
 */
public class SomeClass {

  private final int dateNumber = 123456789;
  
  @TARDIS
  public String timeWarping = "timetime";
  
  @RenderMe
  public Date date;

  @RenderMe
  public int foo;

  @RenderMe(with = "edu.hm.renderer.ArrayRenderer")
  public final int[] array = { 1, 2, 3 };
  
  /**
   * Constructor.
   * 
   * @param foo
   *          Foo
   */
  public SomeClass(int foo) {
	  this.foo = foo;
	  date = new Date(dateNumber);
  }

  /**
   * getArray.
   * 
   * @return array
   */
  public int[] getArray() {
    return array;
  }

  @RenderMe(with = "edu.hm.renderer.ArrayRenderer")
  public final int[] nullArray = {};

  /**
   * getNullArray.
   * 
   * @return nullArray
   */
  public int[] getNullArray() {
    return nullArray;
  }

  /**
   * getTimeWarping.
   * 
   * @return timeWarping
   */
  public String getTimeWarping() {
    return timeWarping;
  }

  /**
   * getDate.
   * 
   * @return date
   */
  public Date getDate() {
    return date;
  }

  /**
   * setDate.
   * 
   * @param date
   *          Date
   */
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   * Timetravel is fantastic!.
   * 
   * @return String
   */
  @TARDIS
  public String travelInTime() {
    return "Fantasic!";
  }

  /**
   * Returns foo.
   * 
   * @return foo
   */
  @RenderMe
  public int getFoo() {
    return foo;
  }

  /**
   * Sets value of foo.
   * 
   * @param foo
   *          Foo
   */
  public void setFoo(int foo) {

  }

}