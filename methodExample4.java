
public class methodExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//takes a string & an int & returns the string concatenated with itself int number of times
	System.out.println(multipliedString("Sunshine", 4));
	}
	public static String multipliedString(String str, int num) {
		String result = " ";
		for (int i = 0; i < num; i++) {
			result += str;
	}
		return result;
	}

}
