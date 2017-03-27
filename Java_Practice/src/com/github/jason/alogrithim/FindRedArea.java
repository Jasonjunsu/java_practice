package com.github.jason.alogrithim;

import java.util.Scanner;

public class FindRedArea {
	
	static int TCNumbers;
	static int height, width;
	static int[][] map;
	static int[][] visited;
	static int[] totalWhiteArea =new int[2500];
	static int totalWhiteCounts;
	static int totalNumbers;
	//static 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		TCNumbers = sc.nextInt();
		for(int index =1; index<=TCNumbers; index++){
			width =sc.nextInt();
			height =sc.nextInt();
			map = new int[height][width];
			visited = new int[height][width];
			
			for(int i=0; i<height; i++){
			    for(int j=0;j<width; j++){
			    	map[i][j] = sc.nextInt();
			    }	
			}
			
			totalNumbers = 0;
			for(int i=0; i<height; i++){
				for(int j=0; j<width;j++){
					if (map[i][j] == 0 && visited[i][j] ==0){
						//totalNumbers ++;
						totalWhiteCounts =0;
						findRed(i,j);
						totalWhiteArea[totalNumbers++]=totalWhiteCounts;
					}
				}
			}
			bubbleSort(totalWhiteArea);
			int final_result =0;
//			System.out.println(totalNumbers);
			for(int i=0; i<totalNumbers;i++){
				//System.out.print(totalWhiteArea[i] + " ");
				if(i%3==0){
					final_result +=totalWhiteArea[i];
				}
			}
			
		System.out.println("#" + index + " " +final_result);
			
		}
	}
	
	public static void bubbleSort(int[] array){
		  for(int i = 0; i < array.length; i ++){
			  for(int j = 0; j<array.length-1-i; j++){
				  if (array[j] < array[j+1]){
					  int temp = array[j];
					  array[j] = array[j+1];
					  array[j+1] = temp;
				  }
			  }
		  } 	
	}
	
	private static boolean findRed(int i, int j) {
		// TODO Auto-generated method stup
		
		if (!checkEdge(i,j)) return false;
		
	    totalWhiteCounts ++;

		visited[i][j] = 1;
		
		if(checkEdge(i+1,j) && map[i+1][j] == 0 && visited[i+1][j]==0){
			findRed(i+1,j);
		}
		
		if(checkEdge(i-1,j) && map[i-1][j] == 0 && visited[i-1][j]==0){
			findRed(i-1,j);
		}
		
		if(checkEdge(i,j+1) && map[i][j+1] == 0 && visited[i][j+1]==0){
			findRed(i,j+1);
		}
		
		if(checkEdge(i,j-1) && map[i][j-1] == 0 && visited[i][j-1]==0){
			findRed(i,j-1);
		}
		
		return true;
	}

	private static boolean checkEdge(int i, int j) {
		// TODO Auto-generated method stub
		return (i >=0 && i<height && j>=0 &&j<width);
	}
	
}
