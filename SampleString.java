package ArrayList;

import java.util.ArrayList;

public class SampleString {
	public static void main(String[] args) {
		ArrayList <String> names=new ArrayList <>();
		names.add("S.VijayaLakshmi");
		names.add("Sowmiya");
		names.add("Lakshmipathy");
		names.add("Sindhuja");
		names.add("Balaji");
		names.add("Arul");
		names.add("Arun");
		names.add("Gopi");
		names.remove(5);
		names.set(2,"Divya");
			names.forEach(x-> System.out.println(x.toUpperCase()));
		}
	}

