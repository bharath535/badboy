package Collections;

import java.util.ArrayList;

public class UseDesigner {
	public static void main(String[]args) {
		Designer d1=new Designer("Hr","name1",25000,"b1",true,"tcs");
		Designer d2=new Designer("Tl","name2",25000,"b2",true,"tcs");
		Designer d3=new Designer("Senior","name3",25000,"b3",true,"tcs");
		Designer d4=new Designer("Hr","name4",25000,"b4",true,"cts");
		Designer d5=new Designer("Tl","name5",25000,"b5",true,"cts");
		Designer d6=new Designer("Senior","name6",25000,"b6",true,"cts");
		Designer d7=new Designer("Hr","name7",25000,"b7",true,"hexaware");
		Designer d8=new Designer("Tl","name8",25000,"b8",true,"hexaware");
		Designer d9=new Designer("Senior","name9",25000,"b9",true,"hexaware");
		Designer d10=new Designer("Hr","name10",25000,"b10",true,"TheHive");
		Designer d11=new Designer("Tl","name11",25000,"b11",true,"TheHive");
		Designer d12=new Designer("Senior","name12",25000,"b12",true,"TheHive");
		
		ArrayList<Designer> d=new ArrayList<>();
		d.add(d1);
		d.add(d2);
		d.add(d3);
		d.add(d4);
		d.add(d5);
		d.add(d6);
		d.add(d7);
		d.add(d8);
		d.add(d9);
		d.add(d10);
		d.add(d11);
		d.add(d12);
		
		ArrayList<Designer> Hr=new ArrayList<>();
		ArrayList<Designer> Tl=new ArrayList<>();
		ArrayList<Designer> Senior=new ArrayList<>();
//		for(int i=0;i<d.size();i++) {
//			if(d.get(i).getDesignation().equals("Hr")) {
//				Hr.add(d.get(i));
//			}
//			else if(d.get(i).getDesignation().equals("Tl")) {
//				Tl.add(d.get(i));
//			}
//			else if(d.get(i).getDesignation().equals("Senior")) {
//				Senior.add(d.get(i));
//			}
//		}
		for(Designer a:d) {
			if(a.getDesignation().equals("Hr")) {
				Hr.add(a);
			}
			else if(a.getDesignation().equals("Tl")) {
				Tl.add(a);
			}
			else if(a.getDesignation().equals("Senior")) {
				Senior.add(a);
			}
		}
		
		Hr.forEach(x->System.out.println(x));
		Tl.forEach(x->System.out.println(x));
		Senior.forEach(x->System.out.println(x));
	}

}
