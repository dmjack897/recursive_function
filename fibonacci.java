package fibonacci;

public class fibonacci {
/*
	public static int fibonacci(int number)
	{
		int one = 1;
		int two = 1;
		int result = -1;
		
		if(number == 1)
		{
			return one;
		}
		else if(number == 2)
		{
			return two;
		}
		else
		{
			for(int i=2;i<number;i++)
			{
				result = one + two;
				one = two;
				two = result;
			}
		}
		return result;
	}
	*/
	public static int fibonacci(int number)
	{
		int one = 1;
		int two = 1;
		int result = -1;
		if(number == 1)
		{
			result = one;
		}
		else if(number ==2)
		{
			result = two;
		}
		else
		{
			result = fibonacci(number-1)+fibonacci(number-2);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("値は : "+fibonacci(10));
	}

}
