package edu.hm.cs.swa.lab01;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;

public class ArrayRenderer {
	
	final Object object;
	final Field field;
	
	public ArrayRenderer(Object object, Field field) {
		this.object = object;
		this.field = field;
	}
	
	
	public String render() throws IllegalArgumentException, IllegalAccessException {
		
		String result = "";
		
		Class<?> classObject = field.getClass();
		
		String name = field.getName();
		String type = field.getType().getSimpleName();
		String value = "[";
	
		return result;
		
	}

	
	
}
