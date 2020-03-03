package com.dateapi;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import static java.time.temporal.TemporalAdjusters.*;
public class Assignment8 {
	public static void main(String args[])
	{
		LocalDate currentLocalDate=LocalDate.now();
		
		currentLocalDate=LocalDate.parse("2019-01-01");
		int year=currentLocalDate.getYear();
		while(year==currentLocalDate.getYear()) {
		int count=0;
		long month=currentLocalDate.getLong(ChronoField.MONTH_OF_YEAR);
		while(month==currentLocalDate.getLong(ChronoField.MONTH_OF_YEAR))
		{
		LocalDate nextSunday = currentLocalDate.with(next(DayOfWeek.SUNDAY));
		currentLocalDate=nextSunday;
		count++;
		}
		if(count==5)
		{
			System.out.println(month);
		}
	}
		
	}

}
