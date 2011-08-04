package org.mule.examples.hello;

public class HelloComponent {
	
	public String sayHello(String name) {
		if("JUNK".equalsIgnoreCase(name)) {
			throw new IllegalArgumentException("Junk ain't a valid name");
		}
			
		return "Hello " + name;
	}

}
