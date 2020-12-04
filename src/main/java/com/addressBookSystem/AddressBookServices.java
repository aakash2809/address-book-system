package com.addressBookSystem;

import java.util.*;

public class AddressBookServices {
	private Scanner scanner = new Scanner(System.in);
	Map<String, Map> addressBook;
	Map<String, Person> contactList;
	String contactListKey;
	String addressBookKey;

	public AddressBookServices() {
		addressBook = new HashMap<String, Map>();
		contactList = new HashMap<String, Person>();
	}

	// START APPLICATION
	public void initiateAppication() {
		System.out.println("            Welcome to Address Book          ");
		System.out.println("---------------------------------------------");
	}

	public void addressBookMenu() {
		String firstName, lastName;

		while (true) {
			System.out.println("Select an action..");
			System.out.println("1. Add address");
			System.out.println("2. Select Address Book");
			System.out.println("3. Delete Address Book");
			System.out.println("4. show  Address book");
			System.out.println("5. Quit");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				Map<String, Person> contactList1 = new HashMap<String, Person>();
				System.out.println("Enter address book name");
				addressBook.put(scanner.next(), contactList1);
				break;
			case 2:
				System.out.println("Enter address book name");
				this.addressBookKey = scanner.next();
				System.out.println(addressBookKey + " selected");
				this.contactList = addressBook.get(this.addressBookKey);
				contactListMenu();
				break;
			case 3:
				deleteAddressBook();
				break;
			case 4:
				showAddressBooks();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Enter a valid option");
				break;
			}
		}
	}

	// DELETE THE ADDRESS BOOK
	public void deleteAddressBook() {
		System.out.print("enter name which you want to delete ");
		this.addressBook.remove(scanner.next());
	}

	// SHOW ALL ADDRESS BOOKS AVAILBALE
	public void showAddressBooks() {
		if (this.addressBook.isEmpty()) {
			System.out.println("there is no address book you have ");
		} else {
			for (Map.Entry<String, Map> entry : this.addressBook.entrySet()) {
				System.out.println(entry.getKey());
			}
		}

	}

	// MAIN MENU
	public void contactListMenu() {
		String firstName, lastName;
		while (true) {
			System.out.println("Select an action..");
			System.out.println("1. Add a person");
			System.out.println("2. Edit information");
			System.out.println("3. Delete a person");
			System.out.println("4. show the address book");
			System.out.println("5. got to adress book menu");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				addContact();
				System.out.println("\n");
				break;
			case 2:
				System.out.print("Enter first name and last name of the person to edit the contact: ");
				firstName = scanner.next();
				lastName = scanner.next();
				editContact(firstName, lastName);
				System.out.println("\n");
				break;
			case 3:
				System.out.print("Enter first and last name of the person to delete the contact: ");
				firstName = scanner.next();
				lastName = scanner.next();
				deleteContactDetail(firstName, lastName);
				System.out.println("\n");
				break;
			case 4:
				showContactList();
				break;
			case 5:
				addressBookMenu();
			default:
				System.out.println("Enter a valid option");
				break;
			}
		}
	}

	// TO ADD NEW CONTACT
	public void addContact() {
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

		this.contactList.put(key, person);
		this.addressBook.put(this.addressBookKey, contactList);
		System.out.println("Contact added successfully\n");

	}

	// EDIT CONTACT DETAIL BY PERSON NAME
	public void editContact(String firstName, String lastName) {
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
				person = (Person) contactList.get(firstName + " " + lastName);
				person.setAddress(scanner.next());
				this.contactList.put(firstName + " " + lastName, person);
				this.addressBook.put(this.addressBookKey, contactList);
				System.out.println("\n");
				break;

			case 2:
				System.out.print("Enter city: ");
				person = (Person) contactList.get(firstName + " " + lastName);
				person.setCity(scanner.next());
				this.contactList.put(firstName + " " + lastName, person);
				this.addressBook.put(this.addressBookKey, contactList);
				System.out.println("\n");
				break;

			case 3:
				System.out.println("Enter ZIP: ");
				person = (Person) contactList.get(firstName + " " + lastName);
				person.setZip(scanner.next());
				this.contactList.put(firstName + " " + lastName, person);
				this.addressBook.put(this.addressBookKey, contactList);
				System.out.println("\n");
				break;
			case 4:
				System.out.println("Enter phone number: ");
				person = (Person) contactList.get(firstName + " " + lastName);
				person.setPhoneNumber(scanner.next());
				this.contactList.put(firstName + " " + lastName, person);
				this.addressBook.put(this.addressBookKey, contactList);
				break;
			case 5:
				System.out.println("Enter email id: ");
				person = (Person) contactList.get(firstName + " " + lastName);
				person.setEmail(scanner.next());
				this.contactList.put(firstName + " " + lastName, person);
				this.addressBook.put(this.addressBookKey, contactList);
				System.out.println("\n");
				break;
			case 6:
				contactListMenu();
			default:
				System.out.println("Enter a valid option");
				break;
			}
		}
	}

	// DELETE CONTACT DETAIL BY PERSON NAME
	public void deleteContactDetail(String firstName, String lastName) {
		if (contactList.get(firstName + " " + lastName) != null) {
			contactList.remove(firstName + " " + lastName);
			this.addressBook.put(contactListKey, contactList);
			System.out.println("Entry has been deleted and address book updated");
		} else {
			System.out.println("name not found");
		}
	}

	// TO SHOW ALL THE ENTRIES FROM ADDRESS BOOK
	public void showContactList() {

		if (contactList.isEmpty()) {
			System.out.println("address book is empity");
		} else {
			for (Map.Entry<String, Person> entry : contactList.entrySet()) {
				System.out.println(entry.getValue());
			}

		}
	}

}
