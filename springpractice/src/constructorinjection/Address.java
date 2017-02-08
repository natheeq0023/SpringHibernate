package constructorinjection;

public class Address {
	private String city;
	private String state;
	private Integer pincode;
	
	Address(String city, String state, Integer pincode)
	{
		this.city=city;
		this.state= state;
		this.pincode = pincode;
	}
	void display()
	{
		System.out.println(city+" "+state+" "+pincode);
	}
	
	

}
