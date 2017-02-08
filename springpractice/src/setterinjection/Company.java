package setterinjection;

public class Company {
	private int regno;
	private String cname;
	private Student student;
	
	Company()
	{}
	public void setStudent(Student student) {
		this.student = student;
	}
		public void setRegno(int regno) {
		this.regno = regno;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	Company(int regno, String cname)
	{
		this.regno=regno;
		this.cname=cname;
	}
	
	
	void display()
	{
		System.out.println(regno+" "+cname);
		System.out.println(student.getName());
	}
	
}
