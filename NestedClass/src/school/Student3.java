/*
 * [�л�����]
 * 1. �л�(student)
 */
package school;

public class Student3 {
	String name;
	String tel;
	int age;
	
	Student3() {
		System.out.println("class Student() ������");
	}
	
	Student3(String n, String t, int a) {
		System.out.printf("Student(...) ������ : name(%s), tel(%s), age(%d)\n", n, t, a);
		this.name = n;
		this.tel = t;
		this.age = a;
	}
	
	void information() {
		System.out.printf("Student:name(%s), tel(%s), age(%d)\n", this.name, this.tel, this.age);
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	int getAge() {
		return this.age;
	}
	
	int total(int kor, int eng, int math) {
		class Score {
		int kor, eng, math;
		Score(int kor, int eng, int math) {
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		int total() {
			return this.kor + this.eng + this.math;
		}
		
	}
		
		Score score = new Score(kor, eng, math);
		int tot = score.total();
		
		return tot;
	}
}