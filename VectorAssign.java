package Collection;

import java.util.Collections;
import java.util.Vector;

public class VectorAssign 
{
	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		v1.add("Pune");
		v1.add(52);
		v1.add('P');
		v1.add(null);
		v1.add(null);
		v1.add(52);
		v1.add(null);
		v1.add(5.22);
		v1.add("Pune");
	
		System.out.println(v1);
		
		Vector v2 = new Vector();
		v2.add(10);
		v2.add(45);
		v2.add(67);
		v2.add(12);
		System.out.println(v2);
		Collections.sort(v2);
		System.out.println(v2);
	}
}
