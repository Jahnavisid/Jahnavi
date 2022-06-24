package jdk5andabove;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Travel {

	public static void main(String[] args) {
		
		Date now = new Date(); 
		Instant current = now.toInstant(); 
		LocalDateTime ldt = LocalDateTime.ofInstant(current, ZoneId.systemDefault());
		System.out.println("Date: " + now);
		System.out.println(" LocalDateTime: " + ldt); 
		ZonedDateTime zdt = ldt.atZone(ZoneId.systemDefault()); 
		System.out.println(ldt);  
		ZonedDateTime Zdt=ZonedDateTime.of(ldt, ZoneId.of("Asia/Calcutta"));
	       System.out.println(Zdt);
		double speed,distance,time;
		int date,month,year,hour,minute;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter speed in kmph");
        speed = sc.nextDouble();
        System.out.println("enter distance in km");
        distance = sc.nextDouble();
        time = distance / speed ;
        System.out.println("time taken in hrs is :"+time);
        LocalDate ld = LocalDate.now();
        System.out.println("Today date:"+ld);
        LocalTime lt = LocalTime.now();
        
		 
		distance =speed*time;
		
		System.out.println("Distance in kilometers= "+distance+"km");
	 
		System.out.println("Distance in meters= "+distance*1000+"m");
		
		
		System.out.println("starting the time is..."+lt);
		
		
		System.out.println("ending the time is..."+lt);
		Bus b=new Bus();
		b.Bus(time,zdt);
		
		
	}
}
class Bus{
	
	public void Bus(double time, ZonedDateTime zdt) {
	
	}
}
		
		
			
			 