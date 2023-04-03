/*
 * Write a program that accepts two numbers and a operator like (+,-,*, /) as command line arguments and perform the appropriate operation indicated by operator. 

If the user enters any other character the appropriate message will be displayed. The output of the program should be displayed to the user.


 */

package Quetion_4;
import java.util.Scanner;
public class Number_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Scanner sc=new Scanner(System.in);
	 int n1= Integer.parseInt(args[0]);
	 int n2= Integer.parseInt(args[1]);
	 
	 System.out.println(n1+"and"+n2);
	 System.out.println("1. Addition\n2. Substraction\n3. Mulatiplication\n4. Division");
	 System.out.println("Enter Choice:");
	 int ch=sc.nextInt();
	 switch(ch)
	 {
	 case 1://addition
		 int add=n1+n2;
		 System.out.println("Addition is -"+add);
		 break;
		 
	 case 2:
		 int sub=n1-n2;
		 System.out.println("Substraction is -"+sub);
		 break;
		
	 case 3:
		 int mul=n1*n2;
		 System.out.println("Multiplication is -"+mul);
		 break;
		
	 case 4:
		 int div=n1/n2;
		 System.out.println("Division is -"+div);
		 break;
		 
		 
			 
	 }


	}

}
