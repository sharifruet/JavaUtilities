package com.bandhanhara.misc;

/**
 * 
 * Example of variable argument
 * 
 * @author Sharif Uddin
 *
 */
public class VarArg {

	public static void main(String[] args) {
		System.out.println("1.2 + 2.2 + 3.3 + 4.4 = " + sum(1.2,2.2,3.3,4.4));
		System.out.println("1 + 2 + 3 = " + sum(1,2,3));
	}
	
	/**
	 * This method demonstrates a simple example of using variable arguments<br/>
	 * 
	 * The method returns the summation of all the arguments passed to it.
	 * 
	 * @param numbers
	 * @return sum of numbers
	 */
	private static double sum(double ... numbers){
		double sum = 0.0;
		for(double num:numbers){
			sum += num;
 		}
		
		return sum;
	}

}
