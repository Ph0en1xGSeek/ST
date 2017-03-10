package com.Triangle;

public class Triangle {
	
	int a, b, c;
	
	public Triangle(int x, int y, int z){
		a = x;
		b = y;
		c = z;
	}
	
	public String isPositive(){
		String msg = "";
		if(a > 0 && b > 0 && c > 0){
			msg = "positive";
		}else{
			if(a <= 0)
				msg += "a is negative";
			if(b <= 0)
				msg += "b is negative";
			if(c <= 0)
				msg += "c is negative";
		}
		//System.out.println(msg);
		return msg;
	}
	
	public String isTriangle(){
		String msg = "";
		if(a+b > c && a+c > b && b+c > a){
			msg = "triangle";
		}else{
			msg = "not a triangle";
		}
		//System.out.println(msg);
		return msg;
	}
	
	public String isIsosceles(){
		String msg = "";
		if(a == b || b == c || c == a){
			msg = "isosceles";
		}else{
			msg = "not isosceles";
		}
		//System.out.println(msg);
		return msg;
	}
	
	public String isEquilateral(){
		String msg = "";
		if(a == b & b == c){
			msg = "equilateral";
		}else{
			msg = "not equilateral";
		}
		//System.out.println(msg);
		return msg;
	}
	
	public String judge(){
		String msg = "";
		msg = this.isPositive();
		if(msg.equals("positive")){
			msg = this.isTriangle();
			if(msg.equals("triangle")){
				msg = this.isIsosceles();
				if(msg.equals("isosceles")){
					msg = this.isEquilateral();
					if(!msg.equals("equilateral")){
						return "isosceles";
					}
				}else{
					return "triangle";
				}
			}
		}
		return msg;
	}
}
