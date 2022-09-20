package Collections;

import java.util.ArrayList;

public class Pencil {
	public static void main(String[]args) {
		ArrayList<String> brand=new ArrayList<>();
		brand.add("Natraj");
		brand.add("Apsara");
		brand.add("FaberCastle");
		brand.add("Camlin");
		brand.add("PenPencil");
		
//		int max=0;
		String name="";
		for(int i=0;i<brand.size();i++) {
			name=name+brand.get(i);
			
//			if(brand.get(i).length()>max) {
//				max=brand.get(i).length();
//				name=brand.get(i);
//			}
//			System.out.println(brand.get(i).charAt(0));
//			System.out.println(brand.get(i).charAt(brand.get(i).length()-1));
		}
		System.out.println(name);
//		System.out.println(name);
//		
//		for(int i=brand.size()-1;i>=0;i--) {
//			System.out.println(brand.get(i));
//		}
//		
//		for(String b:brand) {
//			System.out.println(b);
//		}
		
//		for each lamda
//		brand.forEach(b->System.out.println(b));
		
	}

}
