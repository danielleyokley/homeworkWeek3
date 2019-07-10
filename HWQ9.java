
public class HWQ9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] classSize = new int[5]; 
	classSize[0] = 33;
	classSize[1] = 55;
	classSize[2] = 180;
	classSize[3] = 80;
	classSize[3] = 6;
	boolean sum = ifTotalSumGreaterThan100(classSize);
	System.out.println(sum);
	}	
	public static boolean ifTotalSumGreaterThan100(int[] classSize) {
	int sum = 0;

	for (int i = 0; i < classSize.length; i++) {
	    sum += classSize[i];
		System.out.println("Sum is " + sum);
	}
    if (sum > 100) {
        return true;
    }    
    return false;
}
	}
		