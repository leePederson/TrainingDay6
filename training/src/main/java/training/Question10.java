package training;

public class Question10 {
	public static void main(String[] args) {
		for (int i = 50; i <= 100; i++)
		{
			if (i%2 == 0 && i < 75)
			{
				System.out.println(i);
			}
			if (i >= 75)
			{
				break;
			}
		}

	}

}
