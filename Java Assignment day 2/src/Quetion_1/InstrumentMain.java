/*
 * 
 *Create an abstract class Instrument which is having the abstract function play. 
Create three more sub classes from Instrument which is Piano, Flute, Guitar.
Override the play method inside all three classes printing a message 

“Piano is playing  tan tan tan tan  ”  for Piano class
“Flute is playing  toot toot toot toot”  for Flute class
“Guitar is playing  tin  tin  tin ”  for Guitar class 

You must not allow the user to declare an object of Instrument class.

Create an array of 10 Instruments.

Assign different type of instrument to Instrument reference.

Check for the polymorphic behavior of  play method.

Use the instanceof operator to print that which object stored at which index of instrument array.         
  

 */
package Quetion_1;
import java.util.Scanner;
public class InstrumentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch1;
		Instrument i=null;
		Instrument inst[]=new Instrument[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Data-");
		 for(int n=0;n<10;n++)
		 {
			 do
				{
					System.out.println("1. Piano\n2. Flute\n3. Guitar");
					System.out.println("Enter Choice:");
					int ch= sc.nextInt();
					switch(ch)
					{
					case 1:
						inst[n]= new Piano("tan tan tan");
						display(inst);	
						break;
						
					case 2:
						inst[n]= new Flute("toot tooot toot ");
						display(inst);	
						break;
					
					case 3:
						inst[n]= new Guitar("tin tin tin ");
						display(inst);	
						break;
					}
				System.out.println("Do u want to continue:press 1:");
				ch1=sc.nextInt();
			
				}
				while(ch1==1);
		 }
			
		/*do
		{
		System.out.println("1. Piano\n2. Flute\n3. Guitar");
		System.out.println("Enter Choice:");
		int ch= sc.nextInt();
		switch(ch)
		{
		case 1:
			i= new Piano("tan tan tan");
			display(i);	
			break;
			
		case 2:
			i= new Flute("toot tooot toot ");
			display(i);	
			break;
		
		case 3:
			i= new Guitar("tin tin tin ");
			display(i);	
			break;
		}
		System.out.println("Do u want to continue:press 1:");
		ch1=sc.nextInt();
		
		}
		while(ch1==1);*/
		for(int n=0;n<10;n++)
		{
			System.out.println(inst[n]);
		}
		
	}
public static void display(Instrument inst[])
{
	 for(Instrument in:inst)
	 {
		 if(in instanceof Piano)
		 {
			in.play();
		 }
		 if(in instanceof Flute)
		 {
			in.play();
		 }
		 if(in instanceof Guitar)
		 {
			in.play();
		 }
	 }
	
}
}
