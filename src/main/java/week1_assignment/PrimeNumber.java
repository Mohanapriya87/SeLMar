package week1_assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int count = 30;
		int a = 1;
		
		int number = 3;
		System.out.println(2);
		for (int i=2;i<=count;)
		{
			for (int j=2; j<= (number/2);j++)
			{
				if (number % j ==0)
				{
					a = 0;
					break;
				}
			}
			if (a != 0)
			{
				System.out.println(number);
				i++;
			}
			a = 1;
			number++;
		}
	}
}
	
	

