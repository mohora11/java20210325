package p07.textbook.s070301;

public class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //첫줄에 작성해야함
		this.studentNo = studentNo;
	}
}
