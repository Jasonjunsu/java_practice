package com.github.jason;

public class JavaPractice {

	
	public static void main(String[] args){
//		JavaStringPractice.JavaStringPractice();
//	    JavaArrayPractice.javaArrayPractice();
		int[] array = new int[1000];
		for(int i =0 ; i<1000; i++){
			array[i] = i;
		}
		Sort.bubbleSort(array);
		Sort.printArray(array);
	}
}
