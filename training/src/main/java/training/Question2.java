package training;

public class Question2 {
	public static void main(String[] args) {
		int var = Integer.parseInt(args[0]);
		if (var%2 == 0)
		{
			System.out.println("The input is even");
		}
		if (var%2 == 1)
		{
			System.out.println("The input is odd.");;
		}
	}
}
