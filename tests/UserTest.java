import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserTest
{
	@Test
	public void test_params_are_equal()
	{
		ArrayList<Integer> testscores = new ArrayList<>();
		testscores.add(1);
		testscores.add(2);
		testscores.add(3);

		String Username = "Alice";

		User test = new User(testscores);

		assertEquals(test.getUsername(), Username);
	}

	@Test
	void getUsername()
	{
		ArrayList<Integer> testscores = new ArrayList<>();
		testscores.add(1);
		testscores.add(2);
		testscores.add(3);

		User test = new User(testscores);

		assertEquals(test.getUsername(), "Alice");
	}

	@Test
	void getScores()
	{
		ArrayList<Integer> testscores = new ArrayList<>();
		testscores.add(1);
		testscores.add(2);
		testscores.add(3);

		User test = new User(testscores);

		assertArrayEquals(testscores.toArray(), test.getScores().toArray());
	}

	@Test
	void addScore()
	{
		ArrayList<Integer> testscores = new ArrayList<>();
		testscores.add(1);
		testscores.add(2);
		testscores.add(3);
		User TestUser = new User(testscores);

		TestUser.addScore(4);

		ArrayList<Integer> testscores2 = new ArrayList<>();
		testscores2.add(1);
		testscores2.add(2);
		testscores2.add(3);
		testscores2.add(4);

		assertArrayEquals(TestUser.getScores().toArray(), testscores2.toArray());
	}

	@Test
	void compareTo()
	{
		ArrayList<Integer> testscores = new ArrayList<>();
		testscores.add(1);

		User User1 = new User(testscores);
		User User2 = new User(testscores);

		Assert.assertTrue(User1.compareTo(User2) == 0);
	}

	@Test
	void testCompareTo()
	{
		assert (true);
	}
}