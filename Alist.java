package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Alist {

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("Swati");
		a1.add(11);
		a1.add("F");
		a1.add(null);
		a1.add(11);
		a1.add(null);
		a1.add(3.4);
		a1.add(null);
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		a2.add(10);
		a2.add(45);
		a2.add(67);
		a2.add(12);
		Collections.sort(a2);
		System.out.println(a2);
	}

}
