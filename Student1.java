package Collections;

import java.util.ArrayList;

public class Student1 {
	public static void main(String[]args) {
		ArrayList<Integer> stdId=new ArrayList<>();
		
//		Add values
		stdId.add(1001);
		stdId.add(1002);
		stdId.add(1003);
		stdId.add(1004);
		
//		Set the values
		stdId.set(0,101);
		stdId.set(1,102);
		stdId.set(2,103);
		stdId.set(3,104);
		
//		Remove the value
		stdId.remove(2);
		
//		Normal for Loop
		for(int i=0;i<stdId.size();i++) {
			System.out.println(stdId.get(i));
		}
		
		for(int i=stdId.size()-1;i>=0;i--) {
			System.out.println(stdId.get(i));
		}
		
//		Enhanced for loop
		for(Integer s:stdId) {
			System.out.println(s);
		}
	}

}
