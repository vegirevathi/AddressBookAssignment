package bridgelabz.addressbook;

import java.io.File;
import java.lang.NullPointerException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class AddressBookManager {
	Scanner user_input = new Scanner(System.in);
	AddressBook addressBook = new AddressBook();
	//public String[] list();
	//public String[] list(FilenameFilter f);
	
	public void create() {
		try {
		System.out.println("enter the name of address book");
		String NewAddressBookName = user_input.next();
		File file = new File(NewAddressBookName + ".csv");
	
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("File is created as" +NewAddressBookName + ".csv");
		}
		else {
			System.out.println("File already exists");		
		}
	} catch (IOException e) {
		System.out.println("An error occured.");
		e.printStackTrace();
	}
	}
		/*public void save() {
			try {
			AddressBook addressBook = new AddressBook();
			File file = new File(addressBook + ".csv");
			addressBook.save(file
					);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}*/
		
	
	public void open() {
		try {
			
			  
            // Get all the names of the files present 
            // in the given directory 
			File f = new File("C:");
            String[] files = f.list(); 
            System.out.println("Files are:"); 
  
            // Display the names of the files 
            for (int i = 0; i < files.length; i++) { 
                System.out.println(files[i]); 
            } 
		System.out.println("Enter the name of the address book which you want to open");
		String OpenAddressBookName = user_input.next();
		File openFile = new File( OpenAddressBookName+ ".csv");
		
		if(openFile.exists()) {
			System.out.println("File exists");
			RandomAccessFile raf = new RandomAccessFile(openFile, "rw");
			int i = 0;
			while (i == 0) {
				System.out.println( "1. Add\n"
						+ "2. Edit\n"
						+ "3. Remove\n"
						+ "4. Sort by Name\n"
						+ "5. Sort by Zip\n"
						+ "6. Print all contacts\n"
						+ "7. Back to menu");
				int option = user_input.nextInt();
				switch(option) {
				case 1:
					addressBook.add();
					System.out.println("contact is added");
					break;
				case 2:
					addressBook.edit();
					System.out.println("contact is edited");
					break;
				case 3:
					addressBook.remove();
					System.out.println("contact is removed");
					break;
				case 4:
					addressBook.sortByName();
					System.out.println("contacts are sorted by name");
					break;
				case 5:
					addressBook.sortByZip();
					System.out.println("contacts are sorted by zip");
					break;
				case 6:
					addressBook.printAll();
					break;
				case 7:
					i ++;
					break;
				default:
					System.out.println("Select anything before you proceed");
					break;
				}
			}
			boolean found = false;
			raf.close();
			while (i == 0) {
				System.out.println(
						  "1. Save the changes\n"
						+ "2. Dont save the changes\n");
				int choice = user_input.nextInt();
				switch(choice) {
				case 1:
					System.out.println("last changes have been saved");
				break;
				case 2:
					System.out.println("last changes are not saved");
				break;
				default:
					System.out.println("Something went wrong");
				break;
				}
			}
		}
		else {
			System.out.println("File name does not exists");
		}
		}
		catch (Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
	
	
	
	/*public void close() {
		int i = 0;
		while (i == 0) {
			System.out.println(
					  "1. Save the changes\n"
					+ "2. Dont save the changes\n");
			int choice = user_input.nextInt();
			switch(choice) {
			case 1:
				System.out.println("last changes have been saved");
			break;
			case 2:
				System.out.println("last changes are not saved");
			break;
			default:
				System.out.println("Something went wrong");
			break;
			}
		}
	}*/
}

