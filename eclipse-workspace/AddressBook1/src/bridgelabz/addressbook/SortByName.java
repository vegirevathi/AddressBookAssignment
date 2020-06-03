package bridgelabz.addressbook;

import java.util.Comparator;

public class SortByName implements Comparator<Person> {
	
	public int compare(Person firstPerson, Person secondPerson) {
		if (firstPerson.getLastName().contentEquals(secondPerson.getLastName()))
			return 0;
		else {
			if (firstPerson.getLastName().compareTo(secondPerson.getLastName())>0) {
				return 1;
			}
			else {
				return -1;
			}
		}
	}
}
