package com.addressBookSystem;

import java.util.List;
import java.util.Scanner;

public class AddressBookServices {
	static Scanner scanner = new Scanner(System.in);

	// TO ADD NEW CONTACT
	public void addContact(List<Person> contactList) {
		Person person = new Person();
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

		// ADD CONTACT DETAIL TO arrayList
		contactList.add(person);
		System.out.println("Contact added successfully\n");

	}

	// EDIT CONTACT DETAIL BY PERSON NAME
	public void editContact(String firstName, String lastName, List<Person> contactList) {
		for (int index = 0; index < contactList.size(); index++) {
			Person person = (Person) contactList.get(index);
			if (firstName.equals(person.getFirstName()) && lastName.equals(person.getLastName())) {
				System.out.print("Enter address: ");
				person.setAddress(scanner.nextLine());
				System.out.print("Enter city: ");
				person.setCity(scanner.nextLine());
				System.out.println("Enter state: ");
				person.setState(scanner.nextLine());
				System.out.println("Enter ZIP: ");
				person.setZip(scanner.nextLine());
				System.out.println("Enter phone number: ");
				person.setPhoneNumber(scanner.nextLine());
				System.out.println("Enter email id: ");
				person.setEmail(scanner.nextLine());
				System.out.println("Contact updated successfully\n");
				contactList.add(person);
				break;
			}
		}
	}

	// DELETE CONTACT DETAIL BY PERSON NAME
	public void deleteContactDetail(String firstName, String lastName, List<Person> contactList) {
		for (Person p : contactList) {
			if (p.getFirstName().equals(firstName) && p.getLastName().equals(lastName)) {
				contactList.remove(p);
				System.out.println("Entry has been deleted and address book updated");
				break;
			} else {
				System.out.println("name not found");
			}
		}

	}

	// TO SHOW ALL THE ENTRIES FROM ADDRESS BOOK
	public void showContactList(List<Person> contactList) {
		if (contactList.isEmpty()) {
			System.out.println("address book is empity");
		} else {
			for (Person p : contactList) {
				System.out.println(p);
			}
		}

	}
}
