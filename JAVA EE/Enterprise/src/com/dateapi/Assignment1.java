package com.dateapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;
import java.util.Locale;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Assignment 1
		LocalDate today=LocalDate.now();
		LocalDate dateAfter15Days=today.plusDays(15);
		System.out.println(dateAfter15Days.getDayOfMonth());
		
		//Assignment2
		LocalDateTime currentTime=LocalDateTime.now();
		LocalDateTime noonTime=LocalDateTime.parse("2020-03-02T12:00:00");
		if(currentTime.isAfter(noonTime))
		{
			noonTime=noonTime.plusHours(24);
		}
		System.out.println(currentTime.until(noonTime, ChronoUnit.HOURS));
		
		//Assignment3
		long year=today.getLong(ChronoField.YEAR);
		LocalDate temp=null,temp1=null;
		long checkYear=year;
		if(Year.isLeap(year))
		{	temp=LocalDate.parse(year+"-02-29");
			if(today.isAfter(temp))
			{	checkYear=checkYear+1;
			
				while(!(Year.isLeap(checkYear)))
				{
					checkYear=checkYear+1;
				}
				temp1=LocalDate.parse(checkYear+"-02-29");
				Period period=Period.between(today, temp1);
				System.out.println(period.getDays()+" "+period.getMonths()+" "+period.getYears());
			}
			else
			{
				Period period=Period.between(today, temp);
				System.out.println(period.getDays()+" "+period.getMonths()+" "+period.getYears());
			}
		}
		//Assignment 4
		ZoneId zone1=ZoneId.of("Europe/Rome");
		System.out.println("Time in Rome - "+LocalTime.now(zone1));
		ZoneId zone2=ZoneId.of("Africa/Cairo");
		System.out.println("Time in Cairo - "+LocalTime.now(zone2));
		
	//Assignment 5
	DateTimeFormatter format1=DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.FRENCH);
	LocalDate date=LocalDate.of(2020,9,13);
	String formattedDate=date.format(format1);
	System.out.println(formattedDate);
	
	//Assignment 6
	
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
	LocalDate date2=LocalDate.of(2020, 3, 10);
	LocalTime time=LocalTime.of(10, 15, 25);
	LocalDateTime date1=LocalDateTime.of(date2, time);
	String  formattedDate1= date1.format(dtf);
	System.out.println(formattedDate1);
	
	//Assignment 7
	
	
	
}

}
