package ArrayList;

import java.util.ArrayList;

public class UseCollege {
	public static void main(String[] args) {
		College c1=new College("Sowmiya","Computer",20,false);
		College c2=new College("Karthik","Informaation",20,true);
		College c3=new College("Devi","Computer",20,false);
		College c4=new College("riya","Science",20,false);
		College c5=new College("miya","Physical Science",20,false);
		College c6=new College("Suriya","Science",20,true);
		
		ArrayList<College> colleges=new ArrayList<>();
		colleges.add(c1);
		colleges.add(c2);
		colleges.add(c3);
		colleges.add(c4);
		colleges.add(c5);
		colleges.add(c6);
		//ArrayList<College> maleList=new ArrayList<>();
		ArrayList<College> SubjectList=new ArrayList<>();
		for(College c:colleges) {
			//if(c.getIsMale()==true) {
				//maleList.add(c);
			//}
		//}
		//maleList.forEach(x->System.out.println(x));
		
		if(c.getSubject().equalsIgnoreCase("computer")) {
		SubjectList.add(c);
		}
		}
		SubjectList.forEach(c->System.out.println(c));
	}
}


	
