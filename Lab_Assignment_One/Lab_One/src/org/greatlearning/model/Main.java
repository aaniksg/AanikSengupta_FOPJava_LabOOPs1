package org.greatlearning.model;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee("Aanik", "Sengupta");
		CredentialService cs = new CredentialService();

		int choice;

		do {
			System.out.println();
			System.out.println("Please enter the department from the following");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			System.out.println("5. Exit");
			System.out.println();

			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				String fname = emp.getFirstName().toLowerCase();
				String lname = emp.getLastName().toLowerCase();
				String email = cs.generateEmailAddress(fname, lname, "tech");
				char[] password = cs.generatePassword();
				cs.showCredentials(emp.getFirstName(), email, password);
				break;
			}
			case 2: {
				String fname = emp.getFirstName().toLowerCase();
				String lname = emp.getLastName().toLowerCase();
				String email = cs.generateEmailAddress(fname, lname, "admin");
				char[] password = cs.generatePassword();
				cs.showCredentials(emp.getFirstName(), email, password);
				break;
			}
			case 3: {
				String fname = emp.getFirstName().toLowerCase();
				String lname = emp.getLastName().toLowerCase();
				String email = cs.generateEmailAddress(fname, lname, "hr");
				char[] password = cs.generatePassword();
				cs.showCredentials(emp.getFirstName(), email, password);
				break;
			}
			case 4: {
				String fname = emp.getFirstName().toLowerCase();
				String lname = emp.getLastName().toLowerCase();
				String email = cs.generateEmailAddress(fname, lname, "legal");
				char[] password = cs.generatePassword();
				cs.showCredentials(emp.getFirstName(), email, password);
				break;
			}
			case 5:
				System.out.println("You have exited!");
				break;

			default:
				System.out.println("Enter A Valid Input");
			}
		} while (choice != 5);
		sc.close();
	}
}