package com.bhanu.dp;

public class RodCuttingProblem {

	public static void main(String[] args) {
		System.out.println("Rod Cutting problem");
		int price[] = { 0, 1, 5, 8, 9, 10, 17, 17, 20 };
		System.out.println(getMaxPrice(price));
	}

	public static int getMaxPrice(int price[]) {
		int maxPriceSellingPrice[] = new int[price.length + 1];

		maxPriceSellingPrice[0] = 0;
		System.out.println("price length " + price.length);
		for (int i = 1; i <=price.length; i++) {
			for (int k = 0; k < i; k++) {

				maxPriceSellingPrice[i] = max(maxPriceSellingPrice[i], price[k]
						+ maxPriceSellingPrice[i - k]);
			}
		}

		return maxPriceSellingPrice[price.length];
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

}
