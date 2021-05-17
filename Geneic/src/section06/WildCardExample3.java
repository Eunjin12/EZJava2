package section06;

import java.util.Arrays;

public class WildCardExample3 {
	public static void registerCourse(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생: " 
				+ Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> PersonCourse = new Course<Person>("{일반인과정}", 5);
		PersonCourse.add(new Person("일반인"));
		registerCourse(PersonCourse);
		
		Course<Worker> WorkerCourse = new Course<Worker>("{직장인과정}", 5);
		// workerCourse.add(new Person("직장인"));
		WorkerCourse.add(new Worker("직장인"));
		registerCourse(WorkerCourse);
	}

}
