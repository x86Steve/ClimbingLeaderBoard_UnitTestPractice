
/*
In conjunction with the following problem:
https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem

I have used this to practice creating unit tests.
 */
public class Driver
{
	public static void main (String[] args)
	{
		String input = "6\n" +
				"100 90 90 80 75 60\n" +
				"5\n" +
				"50 65 77 90 102";

		InputConverter inputConverter = new InputConverter(input);

		System.out.println(inputConverter.getSolutionOutput());
	}
}
