package day_1;
import java.util.Random;
class Last5Innings{
	private int[][] runs;
	private int totalRuns;
	Last5Innings(){
		runs=new int[25][6];
		for (int i=0;i<=24;i++) {
			for (int j = 0; j <= 5; j++) {
				runs[i][j] =generateRandomNumber(); 
			}
		}
	}
	public int generateRandomNumber() {
		Random a = new Random();
		return a.nextInt(6);
	}
	void totalRunsScored() {
		for(int i=0;i<=24;i++) {
			for(int j=0;j<=5;j++) {
				totalRuns+=runs[i][j];
			}
		}
		System.out.println("Total Runs Scored by the Bats man in Last 5 Innings:"+totalRuns);
		System.out.println("Average runs scored for Last 5 Matches:"+(float)(totalRuns/5));
	}
	void numberOfRuns() {
		int zeroes = 0;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		for (int i = 0; i <= 24; i++) {
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
				else if (runs[i][j] == 5)
					fives += 1;
				else if (runs[i][j] == 6)
					sixes += 1;
			}
		}
		System.out.println("Number Of 0's:" + zeroes + "\n" + "Number Of 1's:" + ones + "\n" + "Number Of 2's:" + twos
				+ "\n" + "Number Of 3's:" + threes + "\n" + "Number Of 4's:" + fours + "\n" + "Number Of 6's:" + sixes+"\n"+"Number of 5's:"+fives);
	}

	void strikeRate() {
		float strikeRate = (float)totalRuns/(float)150;
		System.out.println("Average Runs scored by the Batsmen per ball :" + strikeRate);
	}
}
public class Assignment3 {
    public static void main(String[] args) {
		Last5Innings li=new Last5Innings();
    	li.totalRunsScored();
    	li.numberOfRuns();
    	li.strikeRate();
    }
}
