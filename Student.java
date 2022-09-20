package Collections;

public class Student {
	private String name;
	private int age;
	private int rollNo;
	private boolean isMale;
	int year;
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
	public void setRollNo( int rollNo) {
		this.rollNo=rollNo;
	}
	public int getRollNo() {
		return this.rollNo;
	}
	public void setIsMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getIsMale() {
		return this.isMale;
	}
	public Student(String name,int age,int rollNo,boolean isMale) {
		this.name=name;
		this.age=age;
		this.rollNo=rollNo;
		this.isMale=isMale;
	}
	public String toString() {
		return name+" "+age+" "+rollNo+" "+isMale;
	}

}
