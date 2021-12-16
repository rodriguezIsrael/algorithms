package com.algorithms.search.binary;

public class BinarySearchMain {

	public static void main(String... args) {
		BinarySearch binarySearch = new BinarySearch();
		int[] list = new int[15];
		list[0] = 1;
		list[1] = 2;
		list[2] = 3;
		list[3] = 4;
		list[4] = 5;
		list[5] = 6;
		list[6] = 7;
		list[7] = 8;
		list[8] = 9;
		list[9] = 10;
		list[10] = 11;
		list[11] = 12;
		list[12] = 13;
		list[13] = 14;
		list[14] = 15;

		int result = binarySearch.search(list, 13);
		System.out.println("El resultado es : " + result);
	}
}
