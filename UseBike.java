package ArrayList;

import java.util.ArrayList;

public class UseBike {
	public static void main(String[] args) {
		ArrayList<Bike> bikes=new ArrayList<>();
		Bike b1=new Bike("Hero",50000,"red",false);
		Bike b2=new Bike("Honda",113400,"blue",false);
		Bike b3=new Bike("Bajai",40000,"black",true);
		Bike b4=new Bike("Java",100000,"red",false);
		Bike b5=new Bike("Havalan",100000,"red",false);
		bikes.add(b1);
		bikes.add(b2);
		bikes.add(b3);
		bikes.add(b4);
		bikes.add(b5);
		//for(Bike x:bikes) {
			//System.out.println(x);//to print all values
		//}
		bikes.forEach(x-> { if(x.getPrice()>50000) {
			System.out.println(x.getBrand()+" "+x.getPrice()+5/100);
		}
		});
	}
}


