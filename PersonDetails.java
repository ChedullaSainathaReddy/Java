package constructors;

public class PersonDetails {
	int personid;
	String Name;
	int age;
	double salary;
	
	
	
	PersonDetails(){
		this(543);
		
	}
	
	PersonDetails(int personid){
		this(543,"Chinna");
		this.personid=personid;
		
	}
	PersonDetails(int personid,String Name){
		this(543,"Chinna",23);
		this.personid=personid;
		this.Name=Name;
	}
	
	
	

		
	

 

	public PersonDetails(int personid, String name, int age) {
		this(431,"Chinna",23,577.344);
		
		this.personid = personid;
		Name = name;
		this.age = age;
		
	}
	

	
	

	public PersonDetails(int personid, String name, int age, double salary) {
		super();
		this.personid = personid;
		Name = name;
		this.age = age;
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PersonDetails d1 =new PersonDetails();
		//System.out.println("personid is:"+d1.personid);
		//System.out.println(" ");
		
		
		//PersonDetails d2 =new PersonDetails(687,"Chinna");
		//System.out.println("personid is:"+d2.personid);
		//System.out.println("Name of the person is:"+d2.Name);
		//System.out.println(" ");
		

		//PersonDetails d3 =new PersonDetails();
		//System.out.println("personid is:"+d3.personid);
		//System.out.println("Name of the person is:"+d3.Name);
		//System.out.println("age of the person is:"+d3.age);
		//System.out.println(" ");
		
		
		PersonDetails d4 =new PersonDetails(234,"Rahul",34,4857.35);
		System.out.println("personid is:"+d4.personid);
		System.out.println("Name of the person is:"+d4.Name);
		System.out.println("age of the person is:"+d4.age);
		System.out.println("salary of the person is:"+d4.salary);
		
		
				 
		

	}

}
