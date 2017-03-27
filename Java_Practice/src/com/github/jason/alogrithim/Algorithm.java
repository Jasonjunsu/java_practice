package com.github.jason.alogrithim;
/*

In Practice, You should use the statndard input/output
in order to receive a score properly.
Do not use file input and output. Please be very careful. 

*/

import java.util.Scanner;
import java.io.FileInputStream;

class Algorithm {

	static int[][] skyMatrix;
	static int[][] visitedMatrix;
	static int matLen;

	static int stars = 0;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		// sc = new Scanner(new FileInputStream("input.txt"));
		int testCases = sc.nextInt();

		for (int i = 0; i < testCases; i++) {
			matLen = sc.nextInt();

			skyMatrix = new int[matLen][matLen];
			visitedMatrix = new int[matLen][matLen];

			for (int j = 0; j < matLen; j++) {
				for (int k = 0; k < matLen; k++) {
					skyMatrix[j][k] = sc.nextInt();
					visitedMatrix[j][k] = 0;
				}
			}

			int mapId = 1;
			int maxStars = 0;
			stars = 0;
			for (int j = 0; j < matLen; j++) {
				for (int k = 0; k < matLen; k++) {
					if (visitedMatrix[j][k] == 0 && skyMatrix[j][k] == 0) {

						findMap(j, k, mapId);
						mapId++;
						if (stars > maxStars) {
							maxStars = stars;
						}
						stars = 0;

					}
				}
			}

			System.out.println(mapId - 1 + " " + maxStars);

		}
	}

	private static void findMap(int i, int j, int id) {

		visitedMatrix[i][j] = 1;
		stars++;
		//System.out.println(i + " " +j);
		if (i - 1 >= 0 && visitedMatrix[i - 1][j] == 0 && skyMatrix[i - 1][j] == 0) {
			findMap(i - 1, j, id);
		}
		if (i + 1 < matLen && visitedMatrix[i + 1][j] == 0 && skyMatrix[i + 1][j] == 0) {
			findMap(i + 1, j, id);
		}
		if (j - 1 >= 0 && visitedMatrix[i][j - 1] == 0 && skyMatrix[i][j - 1] == 0) {
			findMap(i, j - 1, id);
		}
		if (j + 1 < matLen && visitedMatrix[i][j + 1] == 0 && skyMatrix[i][j + 1] == 0) {
			findMap(i, j + 1, id);
		}

	}
}