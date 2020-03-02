package com.dateapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalField;

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
		}

}
