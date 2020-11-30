package com.addressBookSystem;

import java.util.Scanner;

public class AddressBookMain {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		AddressBookServices addressBookServices = new AddressBookServices();
		System.out.println("            Welcome to Address Book          ");
		System.out.println("---------------------------------------------");
		addressBookServices.addContact();
		
		System.out.print("Enter first name and last name of the person to edit the contact: ");
		String firstName=scanner.nextLine();
		String lastName=scanner.nextLine();
		addressBookServices.editContact(firstName,lastName);
	}
}
