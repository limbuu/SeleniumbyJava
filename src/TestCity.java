
public class TestCity {
	public static void main(String[] args)
	{
		City city1=new City();
		city1.name="Kathmandu";
		
		City city2= new City();
		city2.name="Pokhara";
		
		City city3=new City();
		city3.name="Biratnagar";
		
		System.out.println(city1.name);
		System.out.println(city2.name);
		System.out.println(city3.name);
		
	    city1=city2;

		System.out.println(city1.name);
		System.out.println(city2.name);
		System.out.println(city3.name);
	    
		
		
		
		
	}

}
