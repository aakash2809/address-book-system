package com.addressBookSystem;

import java.util.HashMap;

public class AddressBookMain {

	public static void main(String[] args) {
		HashMap<String, Person> contactList = new HashMap<String, Person>();
		AddressBookServices addressBookServices = new AddressBookServices();
		addressBookServices.initiateAppication();
		addressBookServices.chooseOptionFromMainMenu(contactList);
	}
}
