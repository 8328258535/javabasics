package com.assesment;

public class Course {
	
	String course_Name;
	int course_Id;
	String course_teacher;
	String course_duration;
	int course_fee;
	
	public Course(String course_Name, int course_Id, String course_teacher, String course_duration,
			int course_fee) {
		super();
		this.course_Name = course_Name;
		this.course_Id = course_Id;
		this.course_teacher = course_teacher;
		this.course_duration = course_duration;
		this.course_fee = course_fee;
	}
	

	public String getCourse_Name() {
		return course_Name;
	}


	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}


	public int getCourse_Id() {
		return course_Id;
	}


	public void setCourse_Id(int course_Id) {
		this.course_Id = course_Id;
	}


	public String getCourse_teacher() {
		return course_teacher;
	}


	public void setCourse_teacher(String course_teacher) {
		this.course_teacher = course_teacher;
	}


	public String getCourse_duration() {
		return course_duration;
	}


	public void setCourse_duration(String course_duration) {
		this.course_duration = course_duration;
	}


	public int getCourse_fee() {
		return course_fee;
	}


	public void setCourse_fee(int course_fee) {
		this.course_fee = course_fee;
	}


	@Override
	public String toString() {
		return "Course [course_Name=" + course_Name + ", course_Id=" + course_Id + ", course_teacher=" + course_teacher
				+ ", course_duration=" + course_duration + ", course_fee=" + course_fee + "]";
	}
	

}
