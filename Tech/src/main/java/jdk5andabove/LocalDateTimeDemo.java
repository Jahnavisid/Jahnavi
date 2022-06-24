package jdk5andabove;

import java.util.*;
import java.util.List;
import java.util.Scanner;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LocalDateTimeDemo {

	

	

	public static void main(String[] args) {
		Date january = new Date(); 
		Instant current = january.toInstant(); 
		LocalDateTime ldt = LocalDateTime.ofInstant(current, ZoneId.systemDefault());
		System.out.println("Date: " + january);
		System.out.println(" LocalDateTime: " + ldt); 
		ZonedDateTime zdt = ldt.atZone(ZoneId.systemDefault()); 
		double speed,distance,time;
		int date,month,year,hour,minute;
        int count=0;
        
		Scanner s=new Scanner(System.in);
		System.out.println("enter speed in kmph");
		System.out.println("enter Date........");
		date=s.nextInt();
		System.out.println("Enter Month........");
	    month=s.nextInt();
	    System.out.println("Enter year.......");
	    year=s.nextInt();
	    System.out.println("Enter Time........");
	    hour=s.nextInt();
	    System.out.println("Enter Minutes..............");
	    minute=s.nextInt();
	    
	    LocalDateTime l=LocalDateTime.of(year, month, date, hour, minute);
	    DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm a");
	   
		String ss=l.format(f);
		System.out.println("starting the time is..."+ss);
		
		
		System.out.println("ending the time is..."+ss);
	
		distance=s.nextDouble();
	     System.out.println("Distance is..........."+distance);
		speed=s.nextDouble();
		System.out.println("enter the speed..."+speed);
		time=s.nextDouble();
	
		time=s.nextDouble();	
	 
		distance=speed*time;
		
		System.out.println("Distance in kilometers= "+distance+"km");
	 
		System.out.println("Distance in meters= "+distance*1000+"m");
	 
		 
		  
		  
		  
		 
	}
}
	


	

	

