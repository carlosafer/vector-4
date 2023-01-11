package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Rent[] vector = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1));
			input.nextLine();
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Email: ");
			String email = input.nextLine();
			System.out.print("Room number: ");
			int roomNumber = input.nextInt();

			vector[roomNumber] = new Rent(name, email);
		}

		System.out.println();
		System.out.println("Rented rooms:");
		for (int i = 0; i < 10; i++) {
			if (vector[i] != null) {
				System.out.println(i + ", " + vector[i]);
			}
		}

		input.close();

	}

}
