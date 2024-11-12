package constructors;

public class Superclass {
	String name;
	int age;
	int id;
	Superclass(String name,int age){
		this.name=name;
		this.age=age;
	
	}


	
}
class Subclass extends Superclass{
	int id;
	
	Subclass(int id){
		super("Rahul",23);
		this.id=id;
		System.out.println("subclass from the class");
	}

	
		
	
	public static void main(String[] args) {
		Subclass s1=new Subclass(234);
		
		s1.display();
	}
	void display() {
		System.out.println("Name of the student is:"+name);
		System.out.println("age of the student is:"+age);
		System.out.println("id of the student is:"+id);
		
	}
}
