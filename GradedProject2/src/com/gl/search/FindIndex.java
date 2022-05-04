package com.gl.search;

public class FindIndex {

	public static int findIndex(int arr[], int t) {

		if (arr == null) {
			return -1;
		}

		int len = arr.length;
		int i = 0;

		while (i < len) {

			if (arr[i] == t) {
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;
	}

}
