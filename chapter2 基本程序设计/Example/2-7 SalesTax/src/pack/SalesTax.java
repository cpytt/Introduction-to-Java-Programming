/*
Name:Strcpy
Date:2014/11/9
Function:��������Ӫҵ˰С�������λ�ĳ���
*/

package pack;

import java.util.Scanner;

public class SalesTax {
	public static void main(String[] atgs){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter purchase amount: ");
		double purchaseAmount = input.nextDouble();
		
		double tax = purchaseAmount * 0.06;
		System.out.println("Sales tax is " + (int)(tax *100) / 100.0);		
	}
}
