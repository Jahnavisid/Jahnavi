package iopack;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BusTravel {

	public static void main(String[] args) {
		 String now = "2016-11-09 10:30";
		
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

	        LocalDateTime formatDateTime = LocalDateTime.parse(now, formatter);
	        System.out.println("SundayDate : " + now);

	        System.out.println("SundayDateTime : " + formatDateTime);
	        int date,month,year,hour,minute;
	    	double distance,speed,time;
			Scanner s=new Scanner(System.in);
			 System.out.println("enter speed in kmph");
		        speed = s.nextDouble();
		        System.out.println("enter distance in km");
		        distance = s.nextDouble();
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
	    	System.out.println("enter the date:....");
	    	date=s.nextInt();
	    	System.out.println("enter the month:....");
	    	month=s.nextInt();
	    	System.out.println("enter the year:....");
	    	year=s.nextInt();
	    	
	    		
	    		LocalDate dfg=LocalDate.of(year, month, date);
	    		
	    		DayOfWeek sfg=dfg.getDayOfWeek();
	    		
	    		if(DayOfWeek.SUNDAY.equals(sfg)
	    				|| ((dfg.getMonthValue()==5)&&(dfg.getDayOfMonth()==2))
	    				||((dfg.getMonthValue()==2)&&(dfg.getDayOfMonth()==3))
	    				||((dfg.getMonthValue()==8)&&(dfg.getDayOfMonth()==12))
	    				) {
	    		
	    			System.out.println("Sunday is holiday");
	    		}
	    	
	    		else {
	    			System.out.println("enter the hour:...");
	    			hour=s.nextInt();
	    			System.out.println("enter the minute:...");
	    	        minute=s.nextInt();
	    	        LocalDateTime l=LocalDateTime.of(year, month, date, hour, minute);
	    			
	    			DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm a"); 
	    			System.out.println("enter speed in kmph");
			        speed = s.nextDouble();
			        System.out.println("enter distance in km");
			        distance = s.nextDouble();
			        time = distance / speed ;
			        System.out.println("time taken in hrs is :"+time);
			        
	    		}
	    	
					distance =speed*time;
					
					System.out.println("Distance in kilometers= "+distance+"km");
				 
					System.out.println("Distance in meters= "+distance*1000+"m");
					
					
					System.out.println("starting the time is..."+lt);
					
					
					System.out.println("ending the time is..."+lt);
	    	        
	    	}
	
	}



