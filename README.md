# recursive_function

recursive_function
Time complexity = 2^n

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
