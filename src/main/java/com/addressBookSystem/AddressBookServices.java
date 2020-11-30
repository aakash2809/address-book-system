package com.addressBookSystem;

import java.util.Scanner;

public class AddressBookServices {
	static Scanner scanner = new Scanner(System.in);
	Person person = new Person();

	// TO ADD NEW CONTACT
	public void addContact() {
		System.out.println("Enter FirstName : ");
		person.setFirstName(scanner.nextLine());
		System.out.println("Enter LastName : ");
		person.setLastName(scanner.nextLine());
		System.out.println("Enter address : ");
		person.setAddress(scanner.nextLine());
		System.out.println("Enter City  : ");
		person.setCity(scanner.nextLine());
		System.out.println("Enter state  : ");
		person.setState(scanner.nextLine());
		System.out.println("Enter Zip  : ");
		person.setZip(scanner.nextLine());
		System.out.println("Enter Mobile Number  : ");
		person.setPhoneNumber(scanner.nextLine());
		System.out.println("Enter Email Id : ");
		person.setEmail(scanner.nextLine());

		System.out.println(person);
	}
}
