package constructorinjection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	//private int sid;
	//private String name;
	//private Address address;
	private List<Address> adress;
	private Set<String> options;
	private Map<Integer, String> answres;
	//private Map<Integer, Address> mapaddress;
	
	
	Student(List<Address> adress)
	{
		this.adress = adress;
	}
	Student(Set<String> options)
	{
		this.options = options;
	}
	Student(Map<Integer, String> answres)
	{
		this.answres = answres;
	}
	/*Student(Map<Integer, Address> mapaddress)
	{
		this.mapaddress = mapaddress;
	}*/

	

	Student(int sid, String name)
	
	{
		System.out.println("Id: "+sid+" Name: "+name);
	}
	
	
	void display()
	{
		//System.out.println("Id: "+sid+" \n name: "+name);
		Iterator<Address> it = adress.iterator();
		while(it.hasNext())
		{
			Address ad = (Address)it.next();
			ad.display();
		}
		System.out.println("Answers:");
		
	}
	/*void m()
	{
		Iterator<String> it = options.iterator();
		System.out.println("Options:");
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
	}*/
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
	

	

	
	
}
