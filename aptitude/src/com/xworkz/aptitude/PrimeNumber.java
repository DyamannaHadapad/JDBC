package com.xworkz.aptitude;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = scanner.nextInt();
			int i;
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.println("This is not prime number  : " + num);
					break;
				}
				if (num == 0) {
					System.out.println("This is prime number   : " + num);
				}
			}

		}

	}

}
