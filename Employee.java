package constructors;

public class Employee {
	int a;
	String b; 
	float c;
	long d;
	
	
	
	Employee(){
		System.out.println("no args constructors started:");
	}
	Employee(float c,String b){
		this.c=c;
		this.b=b;
	}
	Employee (float c,long d){
		
		this.c=c;
		this.d=d;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee e =new Employee();
		//e.a=189;
		//e.b="Sainath";
		//System.out.println("employee of the id is:"+e.a);
		//System.out.println("Name of the employee is:"+e.b);
		
		Employee e1 =new Employee(23.78f,"Rahul");
		System.out.println("employee id is:"+e1.c);
		System.out.println("Name of the employee is:"+e1.b);
		
		Employee e2 =new Employee(23.5f,8341810181l);
		System.out.println("employee id is:"+e2.c);
		System.out.println("employee mobile number is:"+e2.d );

	}

}
