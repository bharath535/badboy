package Collections;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[]args) {
		Employee emp1=new Employee("bharath",101,25,25000,true);
		Employee emp2=new Employee("sivas",102,26,24000,true);
		Employee emp3=new Employee("banuPriya",103,23,26000,false);
		Employee emp4=new Employee("priya",104,24,25000,false);
		Employee emp5=new Employee("bala",105,25,25500,true);
		Employee emp6=new Employee("kaviya",106,24,26000,false);
		
		ArrayList<Employee> emp=new ArrayList<>();
	    emp.add(emp1);
	    emp.add(emp2);
	    emp.add(emp3);
	    emp.add(emp4);
	    emp.add(emp5);
	    emp.add(emp6);
	    
//	    int min=emp.get(0).getName().length();
//	    String name="";
//	    for(int i=0;i<emp.size();i++) {
//	    	if(emp.get(i).getName().length()<min) {
//	    		min=emp.get(i).getName().length();
//	    		name=emp.get(i).getName();
//	    	}
//	    if(emp.get(i).getSalary()>25000) {
//	    	System.out.println(emp.get(i).getName());
//	    }
//	    	System.out.println(emp.get(i).getName());
//	    }
//	    System.out.println(name);
	    
//	    for each lamda
//	    emp.forEach(e->System.out.println(e.getName()));
//	    for each lamda +if condition
//	    emp.forEach(e->{
//	    	if(e.getAge()>=18) {
//	    		System.out.println(e.getName());
//	    	}
//	    });
//	    
//	    emp.forEach(e-> {
//	    	if(e.getName().startsWith("b")) {
//	    		System.out.println(e.getName());
//	    	}
//	    });
	    emp.forEach(e-> {
	    	if(e.getIsMale()==false) {
	    		System.out.println(e.getName());
	    	}
	    });
	
	
	}

}
