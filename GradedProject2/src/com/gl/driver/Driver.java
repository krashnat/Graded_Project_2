package com.gl.driver;

import java.util.Scanner;

import com.gl.buidling.CheckPrevElement;
import com.gl.search.FindIndex;

public class Driver {

	public static void main(String args[]) {

		int n;
		Scanner sc = new Scanner(System.in);
		CheckPrevElement prevEle = new CheckPrevElement();
		FindIndex findIdx = new FindIndex();

		System.out.println("Enter the total No. of floors in the building");
		n = sc.nextInt();

		int[] arr = new int[n];
		int day, currIndex = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the floor size given on day: " + (i + 1));
			arr[i] = sc.nextInt();
		}

		sc.close();

		System.out.println("The order of construction is as follows");

		for (day = 0; day < arr.length; day++) {

			if (arr[day] != n) {
				System.out.println("Day " + (day + 1));
				System.out.println();

			}

			else if (arr[day] == n) {
				System.out.println("Day " + (day + 1));
				System.out.print(arr[day]);
				System.out.print(" ");
				currIndex = findIdx.findIndex(arr, n);
				n--;
				if (currIndex != 0)
					n = prevEle.checkPrevElements(arr, currIndex, n);
				System.out.println("");
			}

		}

	}

}
