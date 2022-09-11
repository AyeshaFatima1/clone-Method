package com.vowelsandconsonants;

import java.util.Scanner;

public class Count2 {

	public static void main(String[] args) {
		int vCount = 0, cCount = 0;
		System.out.println("Enter the Name:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u') {
				vCount++;
			}

			else if (ch >= 'a' && ch <= 'z') {
				cCount++;
			}
		}

		System.out.println("Number of Vowels:" + vCount);

		System.out.println("Number of Consonants:" + cCount);
	}
}