package com.github.jason;

public class JavaStringPractice {
	
	public static void JavaStringPractice(){
		
		String s1 = "hello ";
		String s2=  "world";
		String s3 = "hello world";
		String s4 = s1 +s2;
		
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		
		String s5 = new String("hello world");
		
		//method of String object
		System.out.println(s5.length() + "\n"
				+ s5.indexOf("hello") +"\n"
				+s5.charAt(1) +"\n"
				+ String.valueOf(s5.toCharArray()));
		
	   char[] a1={'h','e','l','l','o'};
	  
	   
	   //char[] to String
	   System.out.println(new String(a1));
	   String[][] str_arr= {{"abcd"},{"adbc"},{"abce"}};
	   System.out.println(str_arr[2][0]);
	   
	}
}
