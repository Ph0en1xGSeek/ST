package com.Triangle;

import static org.junit.Assert.*;
 
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
 
import com.Triangle.Triangle;

@RunWith(Parameterized.class)
public class PositiveTest {
	private int a;
	private int b;
	private int c;
	private String expected;
	private Triangle triangle;
	
	public PositiveTest(int a, int b, int c, String expected){
		this.a = a;
		this.b = b;
		this.c = c;
		this.expected = expected;
	}
	
	@Before
	public void setUp(){
		System.out.println("Before Positive Test");
		this.triangle = new Triangle(this.a, this.b, this.c);
	}
	
	@After
	public void tearDown(){
		System.out.println("After Positive Test");
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
			{3,3,3,"positive"}
		});
	}
	
	@Test
	public void testAdd(){
		assertEquals(this.expected, triangle.isPositive());
	}
}
