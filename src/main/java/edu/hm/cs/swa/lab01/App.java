package edu.hm.cs.swa.lab01;

/**
 * App Main 
 * @author Michael Eggers
 * @author Rebecca Brydon
 */
public class App 
{
    public static void main( String[] args ) throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException
    {
        System.out.println( "RenderMe fields: \n" );
        
        Renderer renderer = new Renderer(new SomeClass(20));
        System.out.println(renderer.render());
    }
}
