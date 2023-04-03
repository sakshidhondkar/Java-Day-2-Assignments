/*
 * 5.	Create a class Car which contains members speed, noOfGear. The class has a method drive() which is responsible to provide starting speed and noOfGears to a Car.  Implement display() method which will display all attributes of Car class.

The class SportCar is derived from the class Car which adds new features AirBallonType. When this method is invoked, initial speed and gear status must be displayed on console.  Override the display method which display all attribute of the SportCar. Make use of super class display() method.

 */

package Quetion_5;

public class CarsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportCar car=new SportCar();
		car.drive();
		car.display();

	}

}
