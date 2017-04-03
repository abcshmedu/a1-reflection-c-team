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

  @RenderMe
  public int foo;

  @RenderMe(with = "edu.hm.renderer.ArrayRenderer")
  public final float[] array = { 1, 2, 3 };

  /**
   * getArray.
   * 
   * @return array
   */
  public float[] getArray() {
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

  @RenderMe
  private Date date = new Date(dateNumber);

  /**
   * Constructor.
   * 
   * @param foo
   *          Foo
   */
  public SomeClass(int foo) {
    this.foo = foo;
  }

  @TARDIS
  public String timeWarping = "timetime";

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