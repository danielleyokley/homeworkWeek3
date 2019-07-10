
public class methodExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] grades = new double[5];
		grades[0] = 88.7;
		grades[1] = 92.5;
		grades[2] = 100;
		grades[3] = 67.3;
		grades[4] = 78.9;
		
		System.out.println(calculateAverage(grades));	
	}
//takes an array of double & returns the average of all elements in the array
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
			
		}
		return sum / numbers.length;
	}
	}
