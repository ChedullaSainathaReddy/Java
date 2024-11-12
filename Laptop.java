package constructors;

public class Laptop {

	String brand;
	String model;
	int price;
	
	Laptop(){
		this("Unknown","Basic",0);
	}
	Laptop(String brand){
		this.brand=brand;
		
	}
	Laptop(String brand,String model){
		this.brand=brand;
		this.model=model;
		
	}
	
	Laptop(String brand,String model,int price){
		this.brand=brand;
		this.model=model;
		this.price=price;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l=new Laptop();
		System.out.println("Name of the brand is:"+l.brand );
		System.out.println("Name of the model is:"+l.model);
		System.out.println("rate of the price is:"+l.price);

	}

}
