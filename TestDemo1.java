package constructors;

public class TestDemo1 {
	  float height;

	{
		System.out.println("Instance block1");
	}
	TestDemo1(){
		this(56.7f);

		System.out.println("No args constructor");
	}
	{
		System.out.println("Instance block2");
	}
	TestDemo1(float height){
		this.height=height;
		System.out.println("args"); 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo1 t1 =new TestDemo1();
		TestDemo1 t2=new TestDemo1(4.5f);
		System.out.println("height of the person is:"+t2.height);

	}

}
