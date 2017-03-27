package edu.hm.cs.swa.lab01;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Renderer {
	
	final Object object;

	public Renderer(final Object object) {
		this.object = object;
	}

	public String render() throws IllegalArgumentException, IllegalAccessException{
		String result = "";
		Class<?> classObject = object.getClass();
		System.out.println(classObject);
		Field[] fields = classObject.getFields();
		System.out.println(fields.length);
		for(final Field field : fields){
			Annotation[] annotations = field.getAnnotations();
			for(final Annotation annotation : annotations){
				if(annotation instanceof RenderMe){
					String name = field.getName();
					String type = field.getType().toString();
					String value = field.get(object).toString();
					result += String.format("%s (%s) %s%n", name, type, value);
				}
			}
		}
		return result;
	}
}
