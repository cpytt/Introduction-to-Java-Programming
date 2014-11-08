/*
Name:Strcpy
Date:2014/11/8
Function:显示当前时间
*/

package pack;

public class ShowCurrentTime {
	public static void main(String[] args){
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 60;
		
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
		
		long currentHour_BeiJing = currentHour + 8;
		
		System.out.println("Current time is " + currentHour_BeiJing + ":" + currentMinute + ":" + currentSecond + " BeiJing");
	}
}
