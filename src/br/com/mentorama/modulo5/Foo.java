package br.com.mentorama.modulo5;

import java.util.HashMap;
import java.util.Map;

public abstract class Foo {
	// Maps String key to corresponding Class object
	private static Map implementations = null;
    static Foo DefaultFoo;
	// Initializes implementations map the first time it's called
	private static synchronized void initMapIfNecessary() {
		if (implementations == null) {
			implementations = new HashMap();
			// Load implementation class names and keys from
			// Properties file, translate names into Class
			// objects using Class.forName and store mappings.
		}
	}

	public static Foo getInstance(String key) {
		initMapIfNecessary();
		Class c = (Class) implementations.get(key);
		if (c == null)
			return DefaultFoo;
		try {
			return (Foo) c.newInstance();
		} catch (Exception e) {
			return DefaultFoo; /*new DefaultFoo()*/
		}
	}
}
