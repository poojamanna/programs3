package collection1;
import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionExample {
	public void hastsetExample()
	{
		HashSet<String> hset = new HashSet<String>();
		hset.add("apple");
		hset.add("banana");
		hset.add("mango");
		hset.add("orange");
		//addition of duplicate values
		hset.add("apple");
		hset.add(null);
		hset.add(null);
		System.out.println(hset);
		
	}
	 public void treesetExample()
			 {
				 TreeSet<String> al = new TreeSet<String>();
				 al.add("ravi");
				 al.add("vijay");
				 al.add("ravi");
				 al.add("ajay");
				 //traversing elements
				 Iterator<String> itr=al.iterator();
				 while(itr.hasNext())
				 {
					 System.out.println(itr.next());
				 }
				 
			 }
	 public void listExample()
	 {
		 List<String> al= new ArrayList<String>();
		 al.add("amit");
		 al.add("vijay");
		 al.add("kumar");
		 al.add("sachin");
		 System.out.println("an element at 2nd position: "+al.get(2));
		 for(String s:al)
		 {
			 System.out.println(s);
		 }
	 }
	 public void queueExample()
	 {
		 Queue<String> queue = new PriorityQueue<String>();
		 queue.add("amit");
		 queue.add("vijay");
		 queue.add("karan");
		 queue.add("upasana");
		 queue.add("rahul");
		 System.out.println("head:"+queue.element());
		 System.out.println("head:"+queue.peek());
		 System.out.println("iterating the queue element:");
		 Iterator itr=queue.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 queue.remove();
		 queue.poll();
		 System.out.println("after removing two elements");
		 Iterator<String> itr2 = queue.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr2.next());
		 }

		 
	 }
	 public void linkedlistExample()
	 {
		 LinkedList<String> ls=new LinkedList<String>();
		 ls.add("ravi");
		 ls.add("vijay");
		 ls.add("ravi");
		 ls.add("ajay");
		 Iterator<String> itr= ls.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
	 }
	 public void vectorExample()
	 {
		 Vector<String> v = new Vector<String>();
		 v.add("ayush");
		 v.add("amit");
		 v.add("ashish");
		 v.add("garima");
		 Iterator<String> itr = v.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }

	 }
	 public void stackExample()
	 {
		 Stack<String> stack = new Stack<String>();
		 stack.add("ayush");
		 stack.add("garvit");
		 stack.add("amit");
		 stack.add("ashish");
		 stack.add("garima");
		 Iterator<String> itr = stack.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
	 }
	 public void mapExample()
	 {
		 Map<Integer,String> m=new HashMap<Integer,String>();
		 m.put(101,"amit");
		 m.put(102,"vijay");
		 m.put(103,"rahul");
		 for(Map.Entry ma:m.entrySet())
		 {
			 System.out.println(ma.getKey()+" "+ma.getValue());
		 }
	 }
	 public static void main(String[] args) {
		 CollectionExample ce = new CollectionExample();
		 ce.hastsetExample();
		 ce.treesetExample();
		 ce.listExample();
		 ce.linkedlistExample();
		 ce.queueExample();
		 ce.stackExample();
		ce.vectorExample();
		ce.mapExample();
	}

}
