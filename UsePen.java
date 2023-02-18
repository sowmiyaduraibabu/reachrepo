package ArrayList;

import java.util.ArrayList;

public class UsePen {
	public static void main(String[] args) {
		Pen p1=new Pen("Cello");
		Pen p2=new Pen("Pello");
		Pen p3=new Pen("camlin");
		Pen p4=new Pen("dell");
		Pen p5=new Pen("hp");
		ArrayList<Pen> brands=new ArrayList<>();
		brands.add(p1);
		brands.add(p2);
		brands.add(p3);
		brands.add(p4);
		brands.add(p5);
		String temp=" ";
		for(int i=0;i<brands.size();i++) {
		temp=temp+brands.get(i);
		}
		System.out.println(temp);
	}
}

class Pen {
	private String brand;
	public Pen(String brand) {
		this.brand=brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public String toString() {
		return brand;
	}
}
