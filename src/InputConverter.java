import java.util.*;

public class InputConverter
{
	private String input;
	public InputConverter(String input)
	{
		this.input = input;
	}

	public ArrayList<Integer> getLeaderBoardScore()
	{
		ArrayList<Integer> solution = new ArrayList<>();

		String [] lines = input.split("\n");

		String [] scores = lines[1].split(" ");

		for (String item : scores)
		{
			solution.add(Integer.parseInt(item));
		}

		return solution;
	}

	public ArrayList<Integer> getInsertedScores()
	{
		ArrayList<Integer> solution = new ArrayList<>();

		String [] lines = input.split("\n");

		String [] scores = lines[3].split(" ");

		for (String item : scores)
		{
			solution.add(Integer.parseInt(item));
		}

		return solution;
	}

	public String getSolutionOutput()
	{
		StringBuilder Solution = new StringBuilder();

		TreeSet<Integer> treeSet = new TreeSet<>(this.getLeaderBoardScore());
		int index = 0;

		for (Integer currentScore : this.getInsertedScores())
		{
			int rank = 0;
			treeSet.add(getInsertedScores().get(index));
			NavigableSet<Integer> NS =  treeSet.descendingSet();

			for (Integer value : NS)
			{
				if (value.equals(currentScore))
				{
					Solution.append(rank + 1).append("\n");
				}
				rank++;
			}
			index++;
		}

		return Solution.toString();
	}
}
