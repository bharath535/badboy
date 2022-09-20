package Collections;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[]args) {
		Student s1=new Student("bharath",16,25,true);
		Student s2=new Student("bala",15,14,true);
		Student s3=new Student("kaviya",20,35,false);
		Student s4=new Student("priya",20,10,false);
		
		ArrayList<Student> s=new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		
//		for(int i=0;i<s.size();i++) {
//			System.out.println(s.get(i));
//		}
//		for(Student a:s) {
//			System.out.println(a);
//		}
//		s.forEach(a->System.out.println(a));
//		ArrayList<Student> femaleList=new ArrayList<>();
//		ArrayList<Student> maleList=new ArrayList<>();
//		for(Student a:s) {
//			if(a.getIsMale()==false) {
//				femaleList.add(a);
//			}
//			if(a.getIsMale()==true) {
//				maleList.add(a);
//			}
//		}
//		femaleList.forEach(x->System.out.println(x));
//		maleList.forEach(y->System.out.println(y));
//		ArrayList<Student> b=new ArrayList<>();
//		for(int i=0;i<s.size();i++) {
//			if(s.get(i).getRollNo()>1&&s.get(i).getRollNo()<20) {
//				b.add(s.get(i));
//			}
//		}
//		b.forEach(x->System.out.println(x));
//		ArrayList<Student> m=new ArrayList<>();
//		for(int i=0;i<s.size();i++) {
//			if(s.get(i).getName().length()>5) {
//				m.add(s.get(i));
//				}
//		}
//		m.forEach(x->System.out.println(x));
//		ArrayList<Student> a=new ArrayList<>();
//		for(int i=0;i<s.size();i++) {
//			if(s.get(i).getAge()>10&&s.get(i).getAge()<20) {
//				a.add(s.get(i));
//			}
//		}
//		a.forEach(x->System.out.println(x));
		ArrayList<Student> a=new ArrayList<>();
		for(int i=0;i<s.size();i++) {
			if(s.get(i).getName().length()%2!=0) {
				a.add(s.get(i));
			}
		}
		a.forEach(x->System.out.println(x));
	}

}
