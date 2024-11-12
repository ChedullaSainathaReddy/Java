package constructors;

public class Student {
	String Name;
	int age;
	Student(){
		this("Rahul",23);
		System.out.println("No args constructor");
		
	}
	Student(String Name,int age){
		this.Name=Name;
		this.age=age;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		System.out.println("Name of the student is:"+s.Name);
		System.out.println("age of the student is:"+s.age);

	}

}
