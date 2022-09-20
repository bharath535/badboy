package Collections;

import java.util.ArrayList;

public class UseWatch {
	public static void main(String[]args) {
		Watch w1=new Watch("Rolex",5000,true,true,"White");
		Watch w2=new Watch("Tata",2500,false,true,"Black");
		Watch w3=new Watch("Sonata",1500,false,true,"Blue");
		Watch w4=new Watch("Dolphin",600,true,true,"Red");
		Watch w5=new Watch("Benito",550,true,true,"Green");
		Watch w6=new Watch("Watch1",500,false,true,"Grey");
		Watch w7=new Watch("Watch2",1000,true,true,"Metallic");
		Watch w8=new Watch("Watch3",3000,true,true,"purple");
		Watch w9=new Watch("Watch4",2000,false,true,"Orange");
		Watch w10=new Watch("Watch5",4000,true,true,"peach");
		Watch w11=new Watch("Watch6",6000,true,true,"Pink");
		Watch w12=new Watch("Watch7",7000,true,true,"Maroon");
		
		ArrayList<Watch> w=new ArrayList<>();
		w.add(w1);
		w.add(w2);
		w.add(w3);
		w.add(w4);
		w.add(w5);
		w.add(w6);
		w.add(w7);
		w.add(w8);
		w.add(w9);
		w.add(w10);
		w.add(w11);
		w.add(w12);
		
		ArrayList<Watch> hw=new ArrayList<>();
//		Normal for
//		for(int i=0;i<w.size();i++) {
//			if(w.get(i).getPrice()>3000) {
//				hw.add(w.get(i));
//			}	
//		}
//		Enhanced for
		for(Watch b:w) {
			if(b.getPrice()>3000) {
				hw.add(b);
			}
		}
//		FOr each lamda
		hw.forEach(a->System.out.println(a));
	}

}
