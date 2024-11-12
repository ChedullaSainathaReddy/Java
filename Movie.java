package constructors;

public class Movie {
	String Name;
	String hero;
	String heroin;
	String director;
	
	Movie(String Name,String hero,String heroin){
			this.Name=Name;
			this.hero=hero;
			this.heroin=heroin;
		
		
	}
	Movie(Movie m,String director){
		this.Name=m.Name;
		this.hero=m.hero;
		this.heroin=m.heroin;
		this.director=director;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started from movie");
		Movie m =new Movie("salar","prabhas","disha");
		System.out.println("Name of the movie is:"+m.Name);
		System.out.println("hero of the movie is:"+m.hero);
		System.out.println("heroin of the movie is:"+m.heroin);
		System.out.println("Object2 is created **************");
		Movie m1 =new Movie(m,"koratala siva");
		//System.out.println("Name of the movie is:"+m1.Name);
		//System.out.println("hero of the movie is:"+m1.hero);
		//System.out.println("heroin of the movie is:"+m1.heroin);
		System.out.println("director of the movie is:"+m1.director);
		

	}

}
