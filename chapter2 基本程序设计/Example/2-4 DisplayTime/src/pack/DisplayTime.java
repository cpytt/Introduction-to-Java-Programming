/*
Name:Strcpy
Date:2014/11/7
Function:����һ������Ϊ��λ��ʱ�����������ķ�������ʣ������
 */

package pack;

import java.util.Scanner;

public class DisplayTime {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
	}
}
