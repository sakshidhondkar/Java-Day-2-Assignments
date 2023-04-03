/*
 * Create a class Medicine to represent a drug manufactured
 by a pharmaceutical company. Provide a function displayLabel() in this class to print Name and address of the company. 

Derive Tablet, Syrup and Ointment classes from the Medicine class. Override the displayLabel() function in each of these classes to print additional information suitable to the type of medicine. For example, in case of tablets, it could be “store in a cool dry place”, in case of ointments it could be “for external use only” etc.

Create a class TestMedicine . Write main function to do the following:
Declare an array of Medicine references of size 10
Create a medicine object of the type as decided by a randomly generated integer in the range 1 to 3. 

Refer Java API Documentation to find out random generation feature. 

Check the polymorphic behavior of the displayLabel() method.

 */
package Question_3;
import java.util.Random;
import java.util.random.*;

import Quetion_2.Compartment;
import Quetion_2.FirstClass;
import Quetion_2.General;
import Quetion_2.Ladies;
import Quetion_2.Luggage;
public class TestMedicine{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Medicine m1[]=new Medicine[10];
		 
		Random random = new Random();
		
		 
		for(int i=0;i<10;i++)
		{
			int randomNum = random.nextInt((4 - 1) + 1) + 1;//randomGenerator.nextInt((maximum – minimum) + 1) + minimum
			
			 if(randomNum==1)
				m1[i]= new Tablets("SunPharma","Ahamadnagar",30,"Manufacturare");
			
			if(randomNum==2)
				m1[i]= new Syrup("SunPharma","Satara",50);
		
			if(randomNum==1)
				m1[i]=new Ointments("SunPharma","Pune",20,"Manufacturare");
			
		 System.out.println(i);
 			//System.out.println("Medicine Type:"+m1[i].displayLabel());
			m1[i].displayLabel();
		}
		//System.out.println("medicine-"+m1[num].displayLabel());
	}

}
