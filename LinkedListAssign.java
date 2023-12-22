package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListAssign 
{
	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList();
		l1.add("Amravati");
		l1.add(52);
		l1.add('P');
		l1.add(null);
		l1.add(null);
		l1.add(52);
		l1.add(null);
		l1.add(5.22);
		l1.add("Amravati");
		l1.add("Amravati");
		
		System.out.println(l1);
		
		LinkedList l2 = new LinkedList();
		l2.add(10);
		l2.add(45);
		l2.add(67);
		l2.add(12);
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2);
	}
}
