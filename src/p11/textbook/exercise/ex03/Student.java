package p11.textbook.exercise.ex03;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student score = (Student) obj;
			if (this.studentNum == score.studentNum) {
				return true;
			}
		}
		return false;
	}
}
