package day_1;

import java.util.Random;

/**
 * 
 * @author vasav
 *
 */

class InningsStatics {
	private int[][] runs;
	private int totalRuns;

	InningsStatics() {
		runs = new int[5][6];
	for (int i=0;i<=4;i++) {
		for (int j = 0; j <= 5; j++) {
			runs[i][j] =generateRandomNumber(); 
		}
	}
	}

	/**
	 * This is a utility method used to generate random numbers between 0 and 6;
	 * @return This returns a random value between 0 and 6
	 * 
	 * TODO: This method can be enhanced to generate the random numbers between the given range.
	 */
	public int generateRandomNumber() {
		Random a = new Random();
		return a.nextInt(6);
	}

	void totalRunsScored() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 5; j++) {
				totalRuns += runs[i][j];
			}
		}
		System.out.println("Total Runs Scored by the Batsmen in 30 balls : " + totalRuns);
	}

	void strikeRate() {
		float strikeRate = (float)totalRuns/(float)30;
		System.out.println("Runs scored by the Batsmen per ball :" + strikeRate);
	}

	void numberOfRuns() {
		int zeroes = 0;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int sixes = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 5; j++) {
				if (runs[i][j] == 0)
					zeroes += 1;
				else if (runs[i][j] == 1)
					ones += 1;
				else if (runs[i][j] == 2)
					twos += 1;
				else if (runs[i][j] == 3)
					threes += 1;
				else if (runs[i][j] == 4)
					fours += 1;
				else if (runs[i][j] == 6)
					sixes += 1;
			}
		}
		System.out.println("Number Of 0's:" + zeroes + "\n" + "Number Of 1's:" + ones + "\n" + "Number Of 2's:" + twos
				+ "\n" + "Number Of 3's:" + threes + "\n" + "Number Of 4's:" + fours + "\n" + "Number Of 6's:" + sixes);
	}

}

public class Assignment2 {
	public static void main(String[] args) {
		InningsStatics in = new InningsStatics();
		in.totalRunsScored();
		in.strikeRate();
		in.numberOfRuns();
	}
}
