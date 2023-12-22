package Collection;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQueue 
{
	
	//Priority Queue does not follow indexing, not accepting heterogeneous value and null 
	//accepts duplicates, dynamic in nature
	//Does not sort data using collections
	
	public static void main(String[] args) 
	{
		PriorityQueue p1 = new PriorityQueue();
		p1.add("abc");
		p1.add("Mumbai");
		p1.add("Amravati");
		p1.add("Nagpur");
		p1.add("Akola");
		p1.add("Kalyan");
		p1.add("Hinjewadi");
		p1.add("Hinjewadi");
		p1.add("Hinjewadi");
		p1.add("Nagpur");
	
	//	p1.add(null);
	//	p1.add(null);
//		p1.add(3.4);

	//	p1.add('W');
	//	p1.add('s');
	//	p1.add('A');
	
		//p1.add(78);
	//	p1.add(null);
	//	p1.add(null);
		
		System.out.println(p1);
	//	Collections.sort(p1);
	//	System.out.println(p1);
	}
}
