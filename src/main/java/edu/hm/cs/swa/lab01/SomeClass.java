package edu.hm.cs.swa.lab01;

import java.util.*;

public class SomeClass {
	
	@RenderMe
	public int foo;
	
	@RenderMe(with = "edu.hm.renderer.ArrayRenderer")
	public int[] array = { 1, 2, 3, };
	
	@RenderMe
	public Date date = new Date(123456789);

	public SomeClass(int foo) {
		this.foo = foo;
	}
}