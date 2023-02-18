package ArrayList;

import java.util.ArrayList;

public class CharArray {
	public static void main(String[] args) {
		String[] a=args[0].split(",");
		ArrayList<String> names=new ArrayList<>();
		names.add(a[0]);
		names.add(a[1]);
		names.add(a[2]);
		names.add(a[3]);
		names.add(a[4]);
		for(int i=0;i<names.size();i++) {
			System.out.println(a[i].toCharArray());
		}
		
	}

}
