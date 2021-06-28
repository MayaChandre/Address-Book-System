package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	 static Scanner scanner = new Scanner(System.in);
	    static ArrayList<Contact> contactArrayList = new ArrayList<Contact>();

	        public static void main(String[] args) {
	        	Contact contact = new Contact();

	            // adding contact to the address book
	            addContact(contact, contactArrayList);

	        }
	        public static void addContact(Contact contact, ArrayList<Contact> contactArrayList) {
	        	
	        	
	        
	            System.out.print("Enter first name: ");
	            String firstName = scanner.next();
	            contact.setfirstName(firstName);
	           
	            System.out.print("Enter last name: ");
	            String lastName = scanner.next();
	            contact.setlastName(lastName);
	            
	            System.out.print("Enter address: ");
	            String address = scanner.next();
	            contact.setaddress(address);
	            
	            System.out.print("Enter city: ");
	            String city = scanner.next();
	            contact.setcity(city);
	            
	            System.out.print("Enter state: ");
	            String state = scanner.next();
	            contact.setstate(state);
	            
	            System.out.print("Enter zip: ");
	            long zip = scanner.nextLong();
	            contact.setzip(zip);
	            
	            System.out.print("Enter phone no: ");
	            long phNumber = scanner.nextLong();
	            contact.setphNumber(phNumber);
	            
	            System.out.print("Enter email: ");
	            String email = scanner.next();
	            contact.setemail(email);

	            contactArrayList.add(contact);

	            for (Contact c: contactArrayList) {
	                System.out.println(c.getFirstName() + " " + c.getLastName() + " " + c.getAddress() + " " + c.getCity() + " " + c.getState() + " "  + c.getZipCode()
	                        + " " + c.getPhoneNumber() + " " + c.getEmail());
	            }
	        }
	    }
	  