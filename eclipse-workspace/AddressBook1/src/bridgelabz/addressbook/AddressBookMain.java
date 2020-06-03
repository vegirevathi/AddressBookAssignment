package bridgelabz.addressbook;

import java.util.Scanner;
public class AddressBookMain {
	public static void main(String[] args) throws Exception {
		
		AddressBookManager addressBookManager = new AddressBookManager();
		AddressBook addressBook = new AddressBook();
		//String existingAddressBook = "";
		int i = 0;
		
		while (i ==0 ) {
			System.out.println("Welcome to Address Book\n"
					+ "\t\t\t1.Create New Address Book\n"
					+ "\t\t\t2.Open existing Address Book\n"
					+ "\t\t\t3.Save Address Book\n"
					+ "\t\t\t4.Save as Address Book\n"
					+ "\t\t\t5.Close Address Book\n");
			System.out.println("enter ur choice");
			Scanner user_input = new Scanner(System.in);
	         int choice = user_input.nextInt();

			switch(choice) {
			case 1:
				System.out.println("creating new Address Book");
				addressBookManager.create();
				break;
			case 2:
				System.out.println("Opening new Address Book");
				addressBookManager.open();
				break;
			/*case 3:
				addressBookManager.save();
				System.out.println("address book is saved");
				break;
			case 4:
				addressBookManager.saveas();
				System.out.println("address book is saved as");
				break;
			case 5:
				addressBookManager.close();
				System.out.println("address book is closed");
				break;*/
			default:
				System.out.println("Try again");
				break;
			}
		
		}
	}
}
