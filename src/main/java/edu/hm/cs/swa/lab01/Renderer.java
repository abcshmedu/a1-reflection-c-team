package edu.hm.cs.swa.lab01;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;

public class Renderer {
	
	final Object object;

	public Renderer(final Object object) {
		this.object = object;
	}

	public String render() throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException{
		String result = "";
		Class<?> classObject = object.getClass();
		Field[] fields = classObject.getFields();
		for(final Field field : fields){
			Annotation[] annotations = field.getAnnotations();
			for(final Annotation annotation : annotations){
				if(annotation instanceof RenderMe){
					String type = "";
					String value = "";
					if(((RenderMe) annotation).with().equals("edu.hm.renderer.ArrayRenderer")){
						Object val = field.get(object);						
											
						int length = Array.getLength(val);
						value += "[" + Array.get(val, 0); // TODO: check for 0 length array!
						for(int index = 1; index < length; index++)
							value += ", " + Array.get(val, index);
						value += "]";

						type = val.getClass().getSimpleName();
						
					}
					else{
						type = field.getType().toString();
						value = field.get(object).toString();
					}
					String name = field.getName();
					result += String.format("%s (%s) %s%n", name, type, value);
				}
			}
		}
		return result;
	}
}
