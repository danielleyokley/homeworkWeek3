
public class methodExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[3];
		myArray[0] = 7;
		myArray[1] = 10;
		myArray[2] = 8;
//if you're only gonna use it once, you can use just System.out.println(sumArray));
		int sum = sumArray(myArray);
			System.out.println(sum);
	}
//takes an array of ints & returns the sum of all the ints
		
	public static int sumArray(int[] numbers) {
			int sum = 0; 
			for (int number : numbers) {
				sum += number;
			}
			return sum;
		}
	
}
