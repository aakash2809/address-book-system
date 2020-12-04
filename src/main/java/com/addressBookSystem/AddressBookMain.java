package com.addressBookSystem;

import java.util.HashMap;

public class AddressBookMain {

	public static void main(String[] args) {
		HashMap<String, Person> contactList = new HashMap<String, Person>();
		HashMap<String, HashMap> addressBook = new HashMap<String,HashMap>();
		AddressBookServices addressBookServices = new AddressBookServices();
		addressBookServices.addressBookMenu() ;
		
	}
}
