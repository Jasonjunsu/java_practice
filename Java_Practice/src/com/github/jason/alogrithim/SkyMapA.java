package com.github.jason.alogrithim;
import java.util.Scanner;
import java.io.FileInputStream;

class SkyMapA{

	static int N;
	static int[][] data =new int[27][27];
	static int dem,max=0;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		// sc = new Scanner(new FileInputStream("C:\\Users\\sev_user\\workspace\\thuchanhDay2\\src\\SkyMap\\input.txt"));

		int T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {
			int i, j,C=0;
			N = sc.nextInt();
			
			
			for (i = 1; i <=N; i++) {
				for (j = 1; j <=N; j++) {
					data[i][j] = sc.nextInt();
				}
			}
			dem=0;
			for (i = 1; i <=N; i++)
				for (j = 1; j <= N; j++)
					if (data[i][j] == 0) {
						dem++;
						max=0;
						expand(i, j);
						if(max>C) C=max;
					}

			// Print the answer to standard output(screen).
			System.out.println(dem + " " + C);
		}
	}

	private static void expand(int i, int j) {
		// TODO Auto-generated method stub
		if (data[i][j] == 0) {
			System.out.println(i + " " +j);
			max++;
			data[i][j] = 1;
			if (i > 1)
				expand(i - 1, j);
			if (j > 1)
				expand(i, j - 1);
			if (i < N)
				expand(i + 1, j);
			if (j < N)
				expand(i, j + 1);
		}
		return;
	}
}