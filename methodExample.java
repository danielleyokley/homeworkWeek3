
public class methodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = "Danielle";
		String lastName = "Yokley";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Ariel", lastName);
		
	System.out.println(fullName);
	System.out.println(fullName2);
	}
	public static String createFullName(String x, String y) {
		String fullName = x + " " + y;
		return fullName;
		
	}
}


