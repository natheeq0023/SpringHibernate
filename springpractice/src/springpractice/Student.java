package springpractice;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int sid;
	private String name;
	//private Address address;
	private List<Address> address;
	private Set<String> options;
	private Map<Integer, String> answres;
	
	public Set<String> getOptions() {
		return options;
	}

	public void setOptions(Set<String> options) {
		this.options = options;
	}

	public Map<Integer, String> getAnswres() {
		return answres;
	}

	public void setAnswres(Map<Integer, String> answres) {
		this.answres = answres;
	}

	Student(int sid, String name, Set<String> options)
	{
		this.options = options;
		System.out.println("Id: "+sid+" Name: "+name);
	}
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void display()
	{
		System.out.println("Id: "+sid+" \n name: "+name);
		Iterator<Address> it = address.iterator();
		System.out.println("Answers:");
		while(it.hasNext())
		{
			Address ads = (Address)it.next();
			System.out.println(ads.getCity()+" "+ads.getState()+" "+ads.getPincode());
		}
	}
	void m()
	{
		Iterator<String> it = options.iterator();
		System.out.println("Options:");
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
	}
	void map()
	{
		Set set =answres.entrySet();
				Iterator it = set.iterator();
				while(it.hasNext())
				{
					Map.Entry<Integer, String> e =(Map.Entry<Integer, String>) it.next();
					System.out.println(e.getKey()+" "+e.getValue());
				}
		 
	}
	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	

	
	
}
