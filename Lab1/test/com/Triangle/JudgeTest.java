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
public class JudgeTest {
	private int a;
	private int b;
	private int c;
	private String expected;
	private Triangle triangle;
	
	public JudgeTest(int a, int b, int c, String expected){
		this.a = a;
		this.b = b;
		this.c = c;
		this.expected = expected;
	}
	
	@Before
	public void setUp(){
		System.out.println("Before Judge Test");
		this.triangle = new Triangle(this.a, this.b, this.c);
	}
	
	@After
	public void tearDown(){
		System.out.println("After Judge Test");
	}
	
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
			{3,3,3,"equilateral"},
			{3,4,3, "isosceles"},
			{2,3,4, "triangle"},
			{1,2,3, "not a triangle"},
			{-1,1,2, "a is negative"},
			{1,-2,1, "b is negative"},
			{1,1,-2, "c is negative"}
		});
	}
	
	@Test
	public void testAdd(){
		assertEquals(this.expected, triangle.judge());
	}
}
