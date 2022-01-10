package me.pulpury.designpatterns._03_behavioral_patterns._20_state._02_after;

public class Client {
	
	public static void main(String[] args) {
		OnlineCourse onlineCourse = new OnlineCourse();
		Student student = new Student("pulpury");
		Student taeju = new Student("taeju");
		taeju.addPrivate(onlineCourse);
		
		onlineCourse.addStudent(student);
		
		onlineCourse.changeState(new Private(onlineCourse));
		
		onlineCourse.addReview("hello", student);
		
		onlineCourse.addStudent(taeju); 
		
		System.out.println(onlineCourse.getReviews());
		System.out.println(onlineCourse.getState());
		System.out.println(onlineCourse.getStudents());
		
		
	}

}
