
public class HWQ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] testScoresArray = new double[4];
		testScoresArray[0] = 91.0;
		testScoresArray[1] = 76.5;
		testScoresArray[2] = 80.0;
		testScoresArray[3] = 95.5;
		
		System.out.println(calculateAverage(testScoresArray));
	}
	public static double calculateAverage(double[] testScoresArray) {
		double sum = 0;
		for (double testScores : testScoresArray) {
			sum += testScores;
			
		}
		return sum / testScoresArray.length;
	}
	}
