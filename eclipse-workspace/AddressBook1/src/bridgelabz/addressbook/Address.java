package bridgelabz.addressbook;

public class Address {
	String city;
	String state;
	String zip;
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZip() {
		return zip;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return "\n\t\t\tAddress \n\t\t\tCity :" + city + "\n\t\t\tState :" + state + "\n\t\t\tZip :" + zip + "\n\t";
	}
}
