import java.util.ArrayList;

public class Example32 {

	public static void main(String[] args) {
		
		int n = 100;
		ArrayList<String> list = goldbach(n);
		System.out.println(list);	
	}
	
	static boolean isPrime(int num)
	{
		boolean isPrime = true;
		
		if(num<2)
			isPrime = false;
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}
	
	static ArrayList<String> goldbach (int n)
	{
		ArrayList<String> list = new ArrayList<String>();

		for(int i=1; i<n/2+1; i++)
		{
			if(isPrime(i) && isPrime(n-i))
			{
				list.add("("+i);
				list.add(n-i+")");
			}
		}
		
		return list;
	}
}
