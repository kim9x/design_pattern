package me.pulpury.designpatterns._01_creational_patterns._04_builder._02_after;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import me.pulpury.designpatterns._01_creational_patterns._04_builder._01_before.DetailPlan;
import me.pulpury.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

public class DefaultTourBuilder implements TourPlanBuilder {
	
	private String title;

    private int nights;

    private int days;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetailPlan> plans;
    
    // 아래처럼 사용하는 방법도 있다.
    // 아래처럼 사용하게되면 위처럼 변수들을 일일히 명시하지 않다도 된다.
    // 그러나 아래의 메서드 들에선
    // 'this.tourPlan.setTitle(title);' 처럼 사용해줘야한다.
    private TourPlan tourPlan;
    public TourPlanBuilder newInstance() {
    	this.tourPlan = new TourPlan();
		return this;
	}

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        this.nights = nights;
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
//        this.tourPlan.setTitle(title);
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
        return this;
    }
    
	@Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if (this.plans == null) {
            this.plans = new ArrayList<>();
        }

        this.plans.add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return new TourPlan(title, nights, days, startDate, whereToStay, plans);
    }

}
