package com.marlabs.day1;

public class DefaultValuesDemo {

	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean B;
	String str;
	Object obj;

	public void knowDefaultValues() {
		System.out.println("*****************************************");
		System.out.println("Default value for byte " + b);
		System.out.println("Default value for short " + s);
		System.out.println("Default value for int " + i);
		System.out.println("Default value for long " + l);
		System.out.println("Default value for float " + f);
		System.out.println("Default value for double " + d);
		System.out.println("Default value for char " + c);
		System.out.println("Default value for boolean " + B);
		System.out.println("Default value for String " + str);
		System.out.println("Default value for Object " + obj);
		System.out.println("*****************************************");
	}

	public static void main(String[] args) {
		System.out.println("I am from main Method");
		DefaultValuesDemo demo = new DefaultValuesDemo();
		System.out.println(demo);
		demo.knowDefaultValues();
		System.out.println("End of main method");
	}
}
