package Collections;

public class Designer {
	private String designation;
	private String name;
	private int salary;
	private String software;
	private boolean isMale;
	private String company;
	
	public String getDesignation() {
		return this.designation;
	}
	public String getName() {
		return this.name;
	}
	public int getSalary() {
		return this.salary;
	}
	public String getSoftware() {
		return this.software;
	}
	public boolean getIsMale() {
		return this.isMale;
	}
	public String getCompany() {
		return this.company;
	}
	public Designer(String designation,String name,int salary,String software,boolean isMale,String company) {
		this.designation=designation;
		this.name=name;
		this.salary=salary;
		this.software=software;
		this.isMale=isMale;
		this.company=company;
	}
	public String toString() {
		return designation+" "+name+" "+salary+" "+software+" "+isMale+" "+company;
	}

}
