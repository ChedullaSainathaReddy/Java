package constructors;



class Parent{
	Parent(){
		this(5);
		System.out.println("parent constructor ");
	}
	Parent(int c){
		System.out.println("parent one arg constructor ");
	}
	Parent(int d,int e){
		System.out.println("parent two args constructor");
	}
	
	void hello() {
		System.out.println("hello parent method ");
	}
	void hii(int a,int b) {
		int c=a+b;
		System.out.println("hi method from parent class");
	}
}

public class Child extends Parent{
	 Child(){
	//	 super(5);
		 System.out.println("child class constructor");
	 }
	 Child(int z){
		 super(4,6);
		 System.out.println("child ONE ARG constructor"); 
	 }
	 void hello() {
		 super.hello();
			System.out.println("hello child method ");
		}

	public static void main(String[] args) {
		Child c=new Child(5);
		Child c1=new Child();
		c.hello();
		c.hii(4, 6);
	}

}
