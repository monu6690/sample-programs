import java.util.*;
class ArrayListDemo1 {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Initial size of al:"+al.size());
	al.add("C");
	al.add("A");
	al.add("F");
	al.add("D");
	al.add("E");
	al.add(1,"A2");
	System.out.println(al);
	System.out.println("Initial size  addition al:"+al.size());
	System.out.println("Initial size  addition al:"+al);
	Iterator<String> itr=al.iterator();
	while(itr.hasNext())
	{
		String element = itr.next();
		System.out.println(element+" ");
	}
	System.out.println("modified content");
ListIterator<String> litr=al.listIterator();
while(litr.hasNext())
{
	String element = litr.next();
		System.out.print(element+" ");
}
System.out.println("previous element");
while(litr.hasPrevious())
{
	String element = litr.previous();
		System.out.print(element+" ");
}
}
}

