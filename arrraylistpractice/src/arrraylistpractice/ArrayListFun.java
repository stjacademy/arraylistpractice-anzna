package arrraylistpractice;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListFun
{
	public static void main(String[] args)
	{
		 Scanner keyboard = new Scanner(System.in);
		int number =  keyboard.nextInt();
		getListOfFactors(number);
		 System.out.println(getListOfFactors(number));
		 
	      keepOnlyCompositeNumbers(getListOfFactors(number));
		//System.out.print(keepOnlyCompositeNumbers(getListOfFactors(number)));
	}
  public static ArrayList <Integer> getListOfFactors(int number)
  {
	  ArrayList <Integer> array = new ArrayList <Integer>();
	  
	  int i=1;
	 while(i<=number)
	 {
		 if (number % i==0) 
		  {
			  array.add(i);
		  } 
		 i++;
	 }
	return array;                                                                        		
  }
 
  public static void keepOnlyCompositeNumbers(ArrayList<Integer> nums)
  {
	  //will remove all numbers from its ArrayList parameter 
	  //that are not composite numbers.  Composite numbers 
	  //are divisible by 1, itself, and must have at 
	  //least 1 other positive factor.  
	  //You will need to use % to determine if a number is a factor. 
	for(int i=0; i<nums.size();i++)
	{
		if ((getListOfFactors(nums.get(i))).size()<3)
	  	{
			nums.remove(i);
	  	}
		if (nums.get(i)==1)
		{
			nums.remove(i);
		}
		//i--;
	}
	System.out.println(nums);
}
}

