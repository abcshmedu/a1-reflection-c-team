package edu.hm.cs.swa.lab01;

import java.lang.reflect.InvocationTargetException;

/**
 * App Main.
 * 
 * @author Michael Eggers
 * @author Rebecca Brydon
 */
public final class MainClass {

  private final static int MAGIC_NUM = 20;

  /**
   * Constructor.
   * 
   */
  private MainClass() {
  }

  /**
   * Main.
   * 
   * @param args
   *          Arguments.
   * 
   * @throws IllegalArgumentException
   * @throws IllegalAccessException
   * @throws ClassNotFoundException
   * @throws InvocationTargetException
   */
  public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException,
      ClassNotFoundException, InvocationTargetException {
    System.out.println("RenderMe fields: \n");
    Renderer renderer = new Renderer(new SomeClass(MAGIC_NUM));
    System.out.println(renderer.render());
  }
}
