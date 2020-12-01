package com.addressBookSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		AddressBookServices addressBookServices = new AddressBookServices();
		ArrayList<Person> contactList = new ArrayList<Person>();
		String firstName, lastName;
		System.out.println("            Welcome to Address Book          ");
		System.out.println("---------------------------------------------");

		while (true) {
			
			System.out.println("Select an action..");
			System.out.println("1. Add a person");
			System.out.println("2. Edit information");
			System.out.println("3. Delete a person");
			System.out.println("4. show the address book");
			System.out.println("5. Quit");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				addressBookServices.addContact(contactList);
				System.out.println("\n");
				break;
			case 2:
				System.out.print("Enter first name and last name of the person to edit the contact: ");
				firstName = scanner.next();
				lastName = scanner.next();
				addressBookServices.editContact(firstName, lastName, contactList);
				System.out.println("\n");
				break;
			case 3:
				System.out.print("Enter first and last name of the person to delete the contact: ");
				firstName = scanner.next();
				lastName = scanner.next();
				addressBookServices.deleteContactDetail(firstName, lastName, contactList);
				System.out.println("\n");
				break;
			case 4:
				addressBookServices.showContactList(contactList);
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Enter a valid option");
				break;
			}
		}
	}
}
