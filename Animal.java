package constructors;

public class Animal {
	int age;
	int no;
	
	Animal(){
		System.out.println("No args constructors");
	}
	Animal(int a){
		System.out.println("one arg constructor from Animal");
	}
	Animal(int age ,int no){
		this.age=age;
		this.no=no;
		System.out.println("two args constructors from Animal");
	}
	void hello() {
		System.out.println("hello parent method ");
	}
	
	
	
		
	

	

}
class Dog extends Animal{
	//int age;
	
	Dog(){
		super(3,4);
		System.out.println("No args constructors from dog");
	}
	Dog(int a){
		System.out.println("one arg constructor from dog");
	}
	 void hello() {
		 super.hello();
			System.out.println("hello child method ");
		}

	public static void main(String[] args) {
		Dog d =new Dog();
		Dog d1=new Dog(5);
		d.hello();
	}
}


