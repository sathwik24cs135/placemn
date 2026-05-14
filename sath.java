package sath;

import java.util.ArrayList;

import java.util.Collections;

class student implements Comparable<student>{

	String name;
	int id;
	int percentage;
	public student(String name,int id,int percentage) {
		super();
		
		this.name=name;
		this.id=id;
		this.percentage=percentage;
		
		
	}
	
	@Override
	public String toString() {
		String s="|Name:"+name+"| id:"+id+"|Percentage:"+percentage;
		return s;
	}
	@Override
	public int  compareTo(student std) {
		return std.percentage-this.percentage;
	}
}

public class sath{
	public static void main(String[] args) {
		
		student s1=new student("si",002,85);
		student s2=new student("si",003,5);
		student s3=new student("si",004,75);
		student s4=new student("si",005,55);
		ArrayList<student>list=new ArrayList<student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		Collections.sort(list);
		list.forEach((std)->System.out.println(std));
	
		
	}
}


