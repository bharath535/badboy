package Collections;

public class Employee {
	private String empName;
	private int empId;
	private int empAge;
	private int empSalary;
	private boolean empIsMale;
	
	public void setName(String empName) {
		this.empName=empName;
	}
	public String getName() {
		return this.empName;
	}
	public void setId(int empId) {
		this.empId=empId;
	}
	public int getId() {
		return this.empId;
	}
	public void setAge(int empAge) {
		this.empAge=empAge;
	}
	public int getAge() {
		return this.empAge;
	}
	public void setSalary(int empSalary) {
		this.empSalary=empSalary;
	}
	public int getSalary() {
		return this.empSalary;
	}
	public void setIsMale(boolean empIsMale) {
		this.empIsMale=empIsMale;
	}
	public boolean getIsMale() {
		return this.empIsMale;
	}
	public Employee(String empName,int empId,int empAge,int empSalary,boolean empIsMale) {
		this.empName=empName;
		this.empId=empId;
		this.empAge=empAge;
		this.empSalary=empSalary;
		this.empIsMale=empIsMale;
	}
	public String toString() {
		return empName+" "+empId+" "+empAge+" "+empSalary+" "+empIsMale;
	}

}
