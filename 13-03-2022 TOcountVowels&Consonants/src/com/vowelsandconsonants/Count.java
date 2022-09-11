package com.vowelsandconsonants;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		int vCount = 0, cCount = 0;
		System.out.println("Enter the Name:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vCount++;
			}

			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				cCount++;
			}
		}

		System.out.println("Number of Vowels:" + vCount);

		System.out.println("Number of Consonants:" + cCount);
	}
}