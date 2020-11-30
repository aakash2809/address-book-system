package com.addressBookSystem;

import java.util.Scanner;

public class AddressBookMain {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		AddressBookServices addressBookServices = new AddressBookServices();
		String firstName,lastName;
		System.out.println("            Welcome to Address Book          ");
		System.out.println("---------------------------------------------");
		addressBookServices.addContact();

		System.out.print("Enter first name and last name of the person to edit the contact: ");
		 firstName = scanner.nextLine();
		 lastName = scanner.nextLine();
		addressBookServices.editContact(firstName, lastName);
		
		System.out.print("Enter first and last name of the person to delete the contact: ");
		 firstName = scanner.nextLine();
		 lastName = scanner.nextLine();
		addressBookServices.deleteContactDetail(firstName, lastName);
	}
}
