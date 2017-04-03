package edu.hm.cs.swa.lab01;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Renderer prints name, type and value of a field that was annotated by RenderMe.
 * 
 * @author Michael Eggers
 * @author Rebecca B.
 *
 */
public class Renderer {

	/**
	 * Concrete object to work on
	 */
	private final Object object;
	
	/**
	 * It looks like the constructor of this class.
	 * 
	 * @param object The object to check for anntated fields.
	 */
	public Renderer(final Object object) {
		this.object = object;
	}
	
	/**
	 * Seriously? This is a getter... clearly!
	 * 
	 * @return object
	 */
	public Object getObject() {
		return object;
	}
	
	/**
	 * Renders a concrete object that has fields annotated with RenderMe.
	 * 
	 * @return A string representation of the annotated field in the form: <name> (<type>) <value>.
	 * 
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public String render() throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException {
		String result = "";

		Class< ? > classObject = object.getClass();
		Field[] fields = classObject.getFields();
		for (final Field field : fields) {
			Annotation[] annotations = field.getAnnotations();
			for (final Annotation annotation : annotations) {
				if (annotation instanceof RenderMe) {
					String type = "";
					String value = "";
					if (((RenderMe) annotation).with().equals("edu.hm.renderer.ArrayRenderer")) {
						ArrayRenderer arrayR = new ArrayRenderer(object,field);
						String [] info = arrayR.render();
						value = info[0];
						type = info[1];
					}
					else {
						type = field.getType().getSimpleName().toString();
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


