import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InputConverterTest
{

	@Test
	void getLeaderBoardScore()
	{
		ArrayList<Integer> scores = new ArrayList<>();
		scores.add(100);
		scores.add(90);
		scores.add(90);
		scores.add(80);

		String input = "4\n100 90 90 80\n3\n70 80 105";

		InputConverter converter = new InputConverter(input);

		assertArrayEquals(scores.toArray(), converter.getLeaderBoardScore().toArray());
	}

	@Test
	void test_get_inserted_new_scores()
	{
		ArrayList<Integer> scores = new ArrayList<>();
		scores.add(70);
		scores.add(80);
		scores.add(105);

		String input = "4\n100 90 90 80\n3\n70 80 105";

		InputConverter converter = new InputConverter(input);

		assertArrayEquals(scores.toArray(), converter.getInsertedScores().toArray());
	}

	@Test
	void getSolutionOutput_case1()
	{
		String input = "6\n" +
				"100 90 90 80 75 60\n" +
				"5\n" +
				"50 65 77 90 102";

		InputConverter inputConverter = new InputConverter(input);

		String solution = "6\n" +
				"5\n" +
				"4\n" +
				"2\n" +
				"1\n";

		assertEquals(solution, inputConverter.getSolutionOutput());
	}

	@Test
	void getSolutionOutput_case2()
	{
		String input = "7\n" +
				"100 100 50 40 40 20 10\n" +
				"4\n" +
				"5 25 50 120";

		InputConverter inputConverter = new InputConverter(input);

		String solution = "6\n" +
				"4\n" +
				"2\n" +
				"1\n";

		assertEquals(solution, inputConverter.getSolutionOutput());
	}

}