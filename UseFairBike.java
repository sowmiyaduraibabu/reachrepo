package ArrayList;

import java.util.ArrayList;

public class UseFairBike {
	public static void main(String[] args) {
		
		Bike b1=new Bike("Hero",50000,"red",false);
		Bike b2=new Bike("Honda",113400,"blue",false);
		Bike b3=new Bike("Bajai",40000,"black",true);
		Bike b4=new Bike("Java",100000,"red",false);
		Bike b5=new Bike("Havalan",100000,"red",false);
		ArrayList<Bike> bikes=new ArrayList<>();
		bikes.add(b1);
		bikes.add(b2);
		bikes.add(b3);
		bikes.add(b4);
		bikes.add(b5);
		int max=0;
		Bike temp=null;
		for(Bike b:bikes) {
			if(b.getColor().length()>=max) {
				max=b.getColor().length();
				temp=b;
			}
		}
		System.out.println(temp);
	}
}

			
		
	
	

