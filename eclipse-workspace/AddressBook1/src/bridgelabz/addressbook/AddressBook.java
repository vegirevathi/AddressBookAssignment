package bridgelabz.addressbook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	Scanner utility = new Scanner(System.in);
	SortByZip sortByZip = new SortByZip();
	SortByName sortByName = new SortByName();
	public static List<Person> list = new ArrayList<Person>();
	//private static File file = new File(".csv");
	//ObjectMapper mapper = new ObjectMapper();
	
	public List<Person> add() {
		list.add(addUser());
		for (Person P : list) {
			System.out.println(P.toString());
		}
		return list;
	}
	
	public void edit() {
		System.out.println("Enter first name");
		String firstName = utility.next();
		Address address = new Address();
		int count = 0;
		
		for (Person P : list) {
			if (firstName.equals(P.getFirstName())) {
				count++;
				System.out.println("Data found\n");
				System.out.println("1.To edit Address\n"
									+ "2.To edit Phone Number\n" 
									+ "3.To edit City\n"
									+ "4.To edit State\n"
									+ "5.To edit Zip");
				int editChoice = utility.nextInt();
				switch(editChoice) {
				case 1:
					P.setAddress(address);
					break;
				case 2:
					P.setPhoneNumber(utility.next());
					break;
				case 3:
					address.setCity(utility.next());
					break;
				case 4:
					address.setState(utility.next());
					break;
				case 5:
					address.setZip(utility.next());
					break;
				default:
					System.out.println("No Changes are made\n");
					break;
				}
			}
		}
		if (count==0)
			System.out.println("Data not found");
	}
	
	public void remove() throws Exception {
		System.out.println("Enter first name whose data is to be removed");
		String firstName = utility.next();
		int count = 0;
		List<Person> listRemove = new ArrayList<>();
		for (Person P : list) {
			if (firstName.contentEquals(P.getFirstName())) {
				count++;
				listRemove.remove(P);
				System.out.println("Data removed");
			}
		}
		if (count == 0)
			System.out.println("No such data found");
	}
	
	public void sortByName() {
		Collections.sort(list, new SortByName());
		System.out.println("Sorted by name");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void sortByZip() {
		Collections.sort(list, new SortByName());
		System.out.println("Sorted by zip");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void printAll() {
		for (Person P : list) {
			System.out.println(P.toString());
		}
	}
	
	private Person addUser() {
		Person person = new Person();
		Address address = new Address();
		System.out.println("Enter First Name: ");
		person.setFirstName(utility.next());
		System.out.println(person.getFirstName());
		System.out.println("Enter Last Name: ");
		person.setLastName(utility.next());
		System.out.println("Enter city");
		address.setCity(utility.next());
		System.out.println("Enter state");
		address.setState(utility.next());
		System.out.println("Enter zip code");
		address.setZip(utility.next());
		System.out.println("Enter phone number");
		person.setPhoneNumber(utility.next());
		person.setAddress(address);
		return person;
		//addToFile(person);
	}
	
	/*public static void addToFile(Person person) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(person.getFirstName()+"\r\n" + person.getLastName() + "\r\n" + person.getPhoneNumber() + "\r\n");
        } catch(IOException e) {
            System.out.println(e);
        }
	}
	
	 private static boolean readPeopleFromFile() throws IOException {
	        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
	            String name = null;
	            while((name = reader.readLine()) != null) {
	                Person person = new Person(name, reader.readLine(), reader.readLine(), reader.readLine(), reader.readLine());
	                list.add(addUser());        //adds person to the list
	                reader.readLine();                                 
	            }
	            return true;
	        }
	        catch ( IOException e) {
	            System.out.println(e);
	        }
	        return false;
	    }*/
}












