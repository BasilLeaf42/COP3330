/* Christopher Cao
   Homework 1
   1/13/2020 */

//The output of the unmodified program is "The object's position after 10.0 seconds is 0.0 m."

//start of GravityCalculator class
class GravityCalculator {
	public static void main(String[] arguments) {
		
		//variable declaration
		double gravity = -9.81; //Earth's gravity in m/s^2
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		
		//calculation for finalPosition
		finalPosition = 0.5 * (gravity * Math.pow(fallingTime, 2)) + (initialVelocity * fallingTime) + initialPosition;
		
		//final output
		System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
	}
}