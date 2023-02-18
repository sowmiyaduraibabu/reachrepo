package ArrayList;

import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
		ArrayList<Integer> ages= new ArrayList<>();
		ages.add(28);
		ages.add(27);
		ages.add(27);
		ages.add(29);
		ages.add(22);
		ages.add(25);
		ages.add(25);
		ages.add(26);
		ages.add(24);
		ages.add(26);
		ages.remove(5);//it is used remove the index position
		ages.set(6, 50);//in that index position it is used set the new value
		for(int i=0;i<ages.size();i++) {
			System.out.println(ages.get(i));
		}
	}

}
