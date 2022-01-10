package me.pulpury.designpatterns._03_behavioral_patterns._20_state._02_after;

public class Published implements State {
	
	private OnlineCourse onlineCourse;

	@Override
	public void addReview(String review, Student student) {
		this.onlineCourse.getReviews().add(review);
	}

	@Override
	public void addStudent(Student student) {
		this.onlineCourse.getStudents().add(student);
	}
	

}
