package com.dateapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import static java.time.temporal.TemporalAdjusters.*;
public class Assignment7{
	public static void main(String[] args) {
		LocalDate currentLocalDate=LocalDate.now();
		int year=currentLocalDate.getYear();
		currentLocalDate=LocalDate.parse(year+"-01-01");
		int count=0;
		while(year==currentLocalDate.getYear()) {
		LocalDate nextSunday = currentLocalDate.with(next(DayOfWeek.SUNDAY));
		currentLocalDate=nextSunday;
		count++;
		}
		count=count-1;
		System.out.println(count);
	}

}
