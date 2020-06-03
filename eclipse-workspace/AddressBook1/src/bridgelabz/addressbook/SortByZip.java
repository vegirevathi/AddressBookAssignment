package bridgelabz.addressbook;

import java.util.Comparator;

public class SortByZip implements Comparator<Address> {
	
	public int compare(Address firstPerson, Address secondPerson) {
		if (firstPerson.getZip().contentEquals(secondPerson.getZip()))
			return 0;
		else {
			if (firstPerson.getZip().compareTo(secondPerson.getZip())>0) {
				return 1;
			}
			else {
				return -1;
			}
		}
	}
}
