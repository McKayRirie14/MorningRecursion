package ctec.model;

public class RecursionTool
/**
 * @author mrir2917 
 * @version 0.x Feb 11, 2016
 */
public class RecursionTool
{
	
	public double getFibNumber(double position)
	{
		//Defensive code against user evilness
		if(position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		//Base Case
		if(position == 0 || position == 1)
		{
			return 1;
		}
		else // Recursive case - We must keep calling the method.
		{
			return getFibNumber(position - 1) + getfibNumber(position - 2);
		}
	}
	
	public int getFacorialNumber(double position)
	{
		//Defensive code against user evilness
		if(position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		if(position == 0)
		{
			return 1;
		}
		else
		{
			return position * getFactorialNumber(position - 1);
		}
		
	
	}
	
}