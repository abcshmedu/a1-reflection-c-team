package edu.hm.cs.swa.lab01;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IllegalArgumentException, IllegalAccessException
    {
        System.out.println( "Hello World!" );
        
        Renderer renderer = new Renderer(new SomeClass(20));
        System.out.println(renderer.render());
    }
}
