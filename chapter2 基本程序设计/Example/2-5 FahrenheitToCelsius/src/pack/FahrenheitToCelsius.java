/*
Name:Strcpy
Date:2014/11/7
Function:�������¶�ת��Ϊ�����¶�
 */

package pack;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Fahrenheit: ");
		
		double fahrenheit = input.nextDouble();
		double celsius = (5.0 / 9) * (fahrenheit - 32); //��java�У��������������Ϊ������
		
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
	}
}
