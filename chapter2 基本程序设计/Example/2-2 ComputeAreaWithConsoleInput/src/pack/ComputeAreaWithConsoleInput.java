/* 
Name:Strcpy
Date:2014/11/6
Function:��֪Բ�İ뾶����Բ�����
*/

package pack;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number for radius:");
		double radius = input.nextDouble();
		
		double area = radius * radius * 3.14159;
		
		System.out.println("The area for the circle of radius " + radius + " is " + area );
	}
}
