package training;

public class Question8 {
	public static void main(String[] args) {
		int i = 0;
		int num = 0;
		for (i = 1; i <=100; i++)
		{
			int prime = 0;
			for (num = i; num >=1; num--)
			{
				if(i%num==0)
				{
					prime++;
				}
			}
			if (prime == 2)
			{
				System.out.println(i);
			}
		}

	}

}
