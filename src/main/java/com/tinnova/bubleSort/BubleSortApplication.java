package com.tinnova.bubleSort;

import java.util.ArrayList;

public class BubleSortApplication {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(4);
		arrayList.add(7);
		arrayList.add(1);
		arrayList.add(0);
		arrayList.add(6);

		System.out.println("Unsorted list: " + arrayList);
		BubleSortService bubleSortService = new BubleSortService();
		System.out.println("Sorted list: " + bubleSortService.sort(arrayList));
	}

}
