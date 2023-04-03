package Quetion_5;

public class SportCar extends Cars {
	private String s= "Air Bolloon Type";
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("Special Feature:"+s);
	}
	

}
