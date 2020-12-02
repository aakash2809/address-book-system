package com.addressBookSystem;

import java.util.*;

public class AddressBookServices {
	private Scanner scanner = new Scanner(System.in);

	// START APPLICATION
	public void initiateAppication() {
		System.out.println("            Welcome to Address Book          ");
		System.out.println("---------------------------------------------");
	}

	// MAIN MENU
	public void chooseOptionFromMainMenu(Map<String, Person> contactList) {
		String firstName, lastName;
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
				addContact(contactList);
				System.out.println("\n");
				break;
			case 2:
				System.out.print("Enter first name and last name of the person to edit the contact: ");
				firstName = scanner.next();
				lastName = scanner.next();
				editContact(firstName, lastName, contactList);
				System.out.println("\n");
				break;
			case 3:
				System.out.print("Enter first and last name of the person to delete the contact: ");
				firstName = scanner.next();
				lastName = scanner.next();
				deleteContactDetail(firstName, lastName, contactList);
				System.out.println("\n");
				break;
			case 4:
				showContactList(contactList);
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Enter a valid option");
				break;
			}
		}
	}

	// TO ADD NEW CONTACT
	public void addContact(Map<String, Person> contactList) {
		Person person = new Person();
		System.out.println("Enter FirstName : ");
		person.setFirstName(scanner.next());
		System.out.println("Enter LastName : ");
		person.setLastName(scanner.next());
		System.out.println("Enter address : ");
		person.setAddress(scanner.next());
		System.out.println("Enter City  : ");
		person.setCity(scanner.next());
		System.out.println("Enter state  : ");
		person.setState(scanner.next());
		System.out.println("Enter Zip  : ");
		person.setZip(scanner.next());
		System.out.println("Enter Mobile Number  : ");
		person.setPhoneNumber(scanner.next());
		System.out.println("Enter Email Id : ");
		person.setEmail(scanner.next());
		String key = person.getFirstName() + " " + person.getLastName();
		// ADD CONTACT DETAIL TO arrayList
		contactList.put(key, person);
		System.out.println("Contact added successfully\n");

	}

	// EDIT CONTACT DETAIL BY PERSON NAME
	public void editContact(String firstName, String lastName, Map<String, Person> contactList) {
		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);

		while (true) {
			System.out.println("Select an action..");
			System.out.println("1. Update address");
			System.out.println("2. Update city");
			System.out.println("3. Update Zip");
			System.out.println("4. Update phone");
			System.out.println("5. Update email ");
			System.out.println("6. Go to main menu");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter address: ");
				contactList.get(firstName + " " + lastName).setAddress(scanner.next());
				System.out.println("\n");
				break;
			case 2:
				System.out.print("Enter city: ");
				contactList.get(firstName + " " + lastName).setCity(scanner.next());
				System.out.println("\n");
				break;

			case 3:
				System.out.println("Enter ZIP: ");
				contactList.get(firstName + " " + lastName).setZip(scanner.next());
				System.out.println("\n");
				break;
			case 4:
				System.out.println("Enter phone number: ");
				contactList.get(firstName + " " + lastName).setPhoneNumber(scanner.next());
				break;
			case 5:
				System.out.println("Enter email id: ");
				contactList.get(firstName + " " + lastName).setEmail(scanner.next());
				System.out.println("\n");
				break;
			case 6:
				chooseOptionFromMainMenu(contactList);
			default:
				System.out.println("Enter a valid option");
				break;
			}
		}
	}

	// DELETE CONTACT DETAIL BY PERSON NAME
	public void deleteContactDetail(String firstName, String lastName, Map<String, Person> contactList) {
		if (contactList.get(firstName + " " + lastName) != null) {
			contactList.remove(firstName + " " + lastName);
			System.out.println("Entry has been deleted and address book updated");
		} else {
			System.out.println("name not found");
		}
	}

	// TO SHOW ALL THE ENTRIES FROM ADDRESS BOOK
	public void showContactList(Map<String, Person> contactList) {

		if (contactList.isEmpty()) {
			System.out.println("address book is empity");
		} else {
			for (Map.Entry<String, Person> entry : contactList.entrySet()) {
				System.out.println(entry.getValue());
			}

		}
	}

}
