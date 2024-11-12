package constructors;

public class Vehicle {
	
	int milage;
	String Name;
	
	 Vehicle(){
		
		
		System.out.println("No args started");
		
	}
	Vehicle(int milage,String Name){
		//this(110,"Fz-5");
		this.milage=milage;
		this.Name=Name;
		System.out.println("two args constructors called");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Vehicle();
		Vehicle v1=new Vehicle(234,"shine");
		System.out.println("vehicle milage is:"+v1.milage);
		System.out.println("Name of the bike is:"+v1.Name);
		
		

	} 

}
 class car extends Vehicle{
	
	car(){
		super(123,"fz-s");
		System.out.println("calling from the car");
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Calling from the main method");
		car c =new car();
		System.out.println("vehicle milage of car is:"+c.milage);
		System.out.println("Name of the bike is:"+c.Name);

		car c1=new car();
				
		System.out.println("vehicle milage of car is:"+c1.milage);
		System.out.println("Name of the bike is:"+c1.Name);
		 
		
	}
}
