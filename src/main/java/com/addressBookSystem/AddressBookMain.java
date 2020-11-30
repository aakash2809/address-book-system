package com.addressBookSystem;

import java.util.Scanner;

public class AddressBookMain {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		AddressBookServices addressBookServices = new AddressBookServices();
		System.out.println("            Welcome to Address Book          ");
		System.out.println("---------------------------------------------");
		addressBookServices.addContact();
	}
}
