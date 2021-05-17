package section06;

import java.util.Arrays;

public class WildCardExample3 {
	public static void registerCourse(Course<? super Worker> course) {
		System.out.println(course.getName() + "������: " 
				+ Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> PersonCourse = new Course<Person>("{�Ϲ��ΰ���}", 5);
		PersonCourse.add(new Person("�Ϲ���"));
		registerCourse(PersonCourse);
		
		Course<Worker> WorkerCourse = new Course<Worker>("{�����ΰ���}", 5);
		// workerCourse.add(new Person("������"));
		WorkerCourse.add(new Worker("������"));
		registerCourse(WorkerCourse);
	}

}
