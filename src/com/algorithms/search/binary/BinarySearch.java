package com.algorithms.search.binary;

public class BinarySearch {

	public int search(int[] list, int item) {

		int low = 0;
		int high = list.length - 1;
		int counter = 0;

		while (low <= high) {
			int middleNumber = (low + high) / 2;
			int guess = list[middleNumber];
			if (guess == item) {
				System.out.println("Iteraciones de busqueda: " + counter);
				return middleNumber;
			}

			if (guess > item) {
				high = middleNumber - 1;
			} else {
				low = middleNumber + 1;
			}
			counter++;

		}

		return -1;
	}
}
