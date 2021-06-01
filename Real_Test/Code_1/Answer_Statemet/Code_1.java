class Code_1{

static int getSum(int n)
{
	int sum = 0;
	while (n != 0)
	{
		sum = sum + n % 10;
		n = n / 10;
	}
	return sum;
}

static void smallestNumber(int N)
{
	int i = 1;
	while (1 != 0)
	{
		if (getSum(i) == N)
		{
			System.out.print(i);
			break;
		}
		i++;
	}
}

public static void main(String[] args)
{
	int N = 10;
	smallestNumber(N);
}
}

