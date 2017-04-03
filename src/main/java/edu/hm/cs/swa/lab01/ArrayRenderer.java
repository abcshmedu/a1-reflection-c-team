package edu.hm.cs.swa.lab01;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

/**
 * ArrayRenderer extracts type and values of array fields annotated by
 * RenderMe(with="edu.hm.renderer.ArrayRenderer").
 * 
 * @author Michael Eggers
 * @author Rebecca Brydon
 *
 */
public class ArrayRenderer {
  /**
   * object and field of the array to render.
   *
   */
  private final Object object;
  private final Field field;

  /**
   * Constructor.
   * 
   * @param object
   *          The object to render
   * @param field
   *          The field of the object
   *
   */
  public ArrayRenderer(Object object, Field field) {
    this.object = object;
    this.field = field;
  }

  /**
   * Seriously? This is a getter... clearly!.
   * 
   * @return object
   */
  public Object getObject() {
    return object;
  }

  /**
   * Seriously? This is a getter... clearly!.
   * 
   * @return field
   */
  public Field getField() {
    return field;
  }

  /**
   * Renders an array field that is annotated with RenderMe.
   *
   * @return A string array with type and values of the array field
   * 
   * @throws IllegalArgumentException,
   *           IllegalAccessException
   */
  public String[] render() {
    try {
      String[] info = new String[2];
      String value = "";
      String type = "";
      Object val = field.get(object);

      int length = Array.getLength(val);
      if (length > 0) {
        value += "[" + Array.get(val, 0);
        for (int index = 1; index < length; index++) {
          value += ", " + Array.get(val, index);
        }
        value += "]";
      }

      type = val.getClass().getSimpleName();

      info[0] = value;
      info[1] = type;

      return info;

    } catch (Exception e) {
      throw new RuntimeException();
    }
  }

}
