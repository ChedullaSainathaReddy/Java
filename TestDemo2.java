package constructors;

public class TestDemo2 {
	int personid;
	String Name;
	float height;
	//salary double;
	
	TestDemo2(){
		this(345);
		System.out.println("no args constructor");
	}
	TestDemo2(int personid){
		this(234,"Sainath");
		this.personid=personid;
		System.out.println("personid is:"+personid);
		
	}
	TestDemo2(int personid,String Name){
		this(567,"Rahul",4.4f);
		this.personid=personid;
		this.Name=Name;
		System.out.println("personid is:"+personid);
		System.out.println("Name of the person is:"+Name);
	}
	TestDemo2(int personid,String Name,float height){
		this.personid=personid;
		this.Name=Name;
		this.height=height;
		System.out.println("personid is:"+personid);
		System.out.println("Name of the person is:"+Name);
		System.out.println("person of the height is:"+height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo2 t2=new TestDemo2();
		
		
		
		
		
		
	

	}

}
