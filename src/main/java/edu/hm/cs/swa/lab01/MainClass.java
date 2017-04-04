package edu.hm.cs.swa.lab01;

/**
 * App Main.
 * 
 * @author Michael Eggers
 * @author Rebecca Brydon
 */
public final class MainClass {

  private static final int MAGIC_NUM = 20;

  /**
   * Constructor.
   * 
   */
  private MainClass() {
  }

  /**
   * Entry Point for the JVM.
   * 
   * @param args Arguments won't help here.
   * @throws RuntimeException If one of the many exceptions was thrown.
   */
  public static void main(String[] args) throws RuntimeException {
    System.out.println("RenderMe fields: \n");
    Renderer renderer = new Renderer(new SomeClass(MAGIC_NUM));
    System.out.println(renderer.render());
  }
}
