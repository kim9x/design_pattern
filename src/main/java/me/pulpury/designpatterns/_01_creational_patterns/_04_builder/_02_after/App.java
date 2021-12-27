package me.pulpury.designpatterns._01_creational_patterns._04_builder._02_after;

import java.time.LocalDate;

import me.pulpury.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

public class App {
	
	public static void main(String[] args) {
		TourDirector director = new TourDirector(new DefaultTourBuilder());
		TourPlan tourPlan = director.cancunTrip();
		TourPlan longBeachTrip = director.longBeachTrip();
	}

}
