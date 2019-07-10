
public class HWQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName = "Benjamin";
		String lastName = "Franklin";
		String fullName = createFullName(firstName, lastName); 
	System.out.println(fullName);
	}
	public static String createFullName(String x, String y) {
		String fullName = x + " " + y;
		return fullName;
		
	}
}