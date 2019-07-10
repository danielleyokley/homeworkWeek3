
public class HWQ11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] testScoresArray2 = new double[4];
		testScoresArray2[0] = 70.0;
		testScoresArray2[1] = 75.0;
		testScoresArray2[2] = 84.5;
		testScoresArray2[3] = 97.0;
		
		double[] testScoresArray = new double[4];
		testScoresArray[0] = 91.0;
		testScoresArray[1] = 76.5;
		testScoresArray[2] = 80.0;
		testScoresArray[3] = 95.5;
		
		System.out.println(isFirstAverageGreater(testScoresArray,testScoresArray2));
		System.out.println(calculateAverage(testScoresArray));
		System.out.println(calculateAverage(testScoresArray2));
	}
		public static double calculateAverage(double[] testScoresArray) {
			double sum = 0;
			for (double testScores : testScoresArray) {
				sum += testScores;
				
			}
			return sum / testScoresArray.length;

		}
		public static boolean isFirstAverageGreater(double[] x, double[] y) {
			
			if (calculateAverage(x) > calculateAverage(y)) {
				return true;
			}
            return false;
	}
}
