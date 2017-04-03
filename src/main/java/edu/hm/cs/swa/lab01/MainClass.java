package edu.hm.cs.swa.lab01;

import java.lang.reflect.InvocationTargetException;

/**
 * App Main 
 * @author Michael Eggers
 * @author Rebecca Brydon
 */
public class MainClass 
{
    public static void main( String[] args ) throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException, InvocationTargetException
    {
        System.out.println( "RenderMe fields: \n" );
        
        Renderer renderer = new Renderer(new SomeClass(20));
        System.out.println(renderer.render());
    }
}
