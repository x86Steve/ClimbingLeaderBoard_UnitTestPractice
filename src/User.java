import java.util.ArrayList;

public class User implements Comparable<User>
{
	private ArrayList<Integer> scores;
	private String username = "Alice";

	public User(ArrayList<Integer> scores)
	{
		this.scores = scores;
	}

	public String getUsername()
	{
		return username;
	}

	public ArrayList<Integer> getScores()
	{
		return scores;
	}

	public void addScore(Integer score)
	{
		this.scores.add(score);
	}

	@Override
	public int compareTo(User U)
	{
		return this.username.compareToIgnoreCase(U.username);
	}
}
