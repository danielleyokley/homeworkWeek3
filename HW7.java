
public class HW7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Question 7	
		System.out.println(multipliedString("Ladybug", 5));
		}
		public static String multipliedString(String str, int num) {
			String result = " ";
			for (int i = 0; i < num; i++) {
				result += str;
		}
			return result;
		}

	}
