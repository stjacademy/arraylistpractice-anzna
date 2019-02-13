package arrraylistpractice;
import java.util.ArrayList;

public class Notes 
{
	public static void main(String[] args)
	{
		ArrayList <Integer> myList = new ArrayList<Integer>();
		myList.add(42);
		myList.add(507);
		myList.add(24);

		for (int i=0; i<myList.size(); i++)
		{
			System.out.println(myList.get(i)+" ");
		}
		System.out.println();
		
		for (Integer num: myList)
		{
		    System.out.println(num);
		}
		System.out.println(myList);
		//myList.set(index, number);
		//myList.add (index, number); - shows if able to add when printed
		//myList.get(index); - can be also printed
		//myList.remove(index); - can be also printed
		//never remove in a for-loop
			
	}
}
