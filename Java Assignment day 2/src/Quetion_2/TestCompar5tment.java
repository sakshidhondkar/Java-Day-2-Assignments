/*
 * Create an abstract class Compartment to represent a rail coach.
 *  Provide a abstract function notice in this class.
 *   Derive FirstClass, Ladies, General, Luggage classes from the 
 *   compartment class. Override the notice function in each of them 
 *   to print notice suitable to the type of the compartment.

Create a class TestCompartment . Write main function to do 
the following:

Declare an array of Compartment pointers of size 10.

Create a compartment of a type as decided by a randomly
 generated integer in the range 1 to 4.

Check the polymorphic behavior of the notice method.

 */
package Quetion_2;
import java.util.random.*;
import java.util.Random;

public class TestCompar5tment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment compartments[]=new Compartment[10];
		Random random = new Random();
		
		 
		for(int i=0;i<10;i++)
		{
			int randomNum = random.nextInt((4 - 1) + 1) + 1;//randomGenerator.nextInt((maximum – minimum) + 1) + minimum
			
			if(randomNum==1)
				compartments[i]=new FirstClass();
			
			if(randomNum==2)
				compartments[i]=new General();
		
			if(randomNum==1)
				compartments[i]=new Ladies();
			
			if(randomNum==1)
				compartments[i]=new Luggage();
			
			System.out.println("Compartment - "+compartments[i].notice());
		}

	}

}
