package jdk5andabove;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;
public class LocalDateTimeDemo {

	public static void main(String[] args) {
		
		double speed,distance,time;
        int count=0;
		Scanner sc=new Scanner(System.in);
	 
		System.out.println("enter speed in kmph ");
	 
		speed=sc.nextDouble();	
	 
		System.out.println("enter time in hours ");
		
		time=sc.nextDouble();	
	 
		distance=speed*time;
		
		System.out.println("Distance in kilometers= "+distance+"km");
	 
		System.out.println("Distance in meters= "+distance*1000+"m");
	
		

		LocalDate today=LocalDate.now();
	        LocalTime StartTime=LocalTime.parse("20:15");
	        LocalTime endTime=LocalTime.parse("5:50");
	        LocalDateTime startDateTime=today.atTime(StartTime);
	        LocalDateTime EndDateTime=today.atTime(endTime);
	        LocalDateTime lDT1 = LocalDateTime.now();  
	        System.out.println("LocalDateTime1 : " + lDT1);
	        
	        LocalDateTime DT2 = LocalDateTime.of(2016, Month.JANUARY, 1, 20, 15);
	        System.out.println("LocalDateTime5 : " + DT2);
	        LocalDateTime DT3 = LocalDateTime.of(2016, 1, 7,  5, 50);
	        System.out.println("LocalDateTime6 : " + DT3);
	       
	        
		LocalDate date=LocalDate.of(2016, 1,13 );
		
		LocalTime time1=LocalTime.of(14,30);
		LocalDateTimeDemo dt=LocalDateTimeDemo.of(date,time1);
		 LocalDate ld = LocalDate.now();
	        System.out.println("Today date:"+ld);
	        LocalTime lt = LocalTime.now();
		
		int month=date.getMonthValue();
		int day=date.getDayOfMonth();
		int Year=date.getDayOfYear();
		int hour=time1.getHour();
		int minute=time1.getMinute();
		getCurrentdatetime(month,day,Year,hour,minute);
		
	
	}
	

	private static void getCurrentdatetime(int month, int day, int year, int hour, int minute) {
		System.out.printf("The current date is:%d%d%d.\n",month,day,year);
		
	}

private static LocalDateTimeDemo of(LocalDate date, LocalTime time) {
		System.out.println();
		return null;
	}

}

