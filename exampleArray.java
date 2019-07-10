
public class exampleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String vacationOption1 = "Hawaii";
		String vacationOption2 = "Ireland";
		String vacationOption3 = "Scottland";
			System.out.println(vacationOption1);
			System.out.println(vacationOption2);
			System.out.println(vacationOption3);
		
		String[] vacationOptions = new String[3];
			vacationOptions[0] = "Hawaii";
			vacationOptions[1] = "Ireland";
			vacationOptions[2] = "Scottland";
			System.out.println(vacationOptions[0]);
			System.out.println(vacationOptions[1]);
			System.out.println(vacationOptions[2]);
			
		
		for (int i = 0; i < vacationOptions.length; i++) {
			System.out.println(vacationOptions[i]);
		
		for (String options : vacationOptions) {
			System.out.println(options);
		}	
		}
		
		int[] multiplesOf4 = new int[8];
		
		for (int i = 0; i < multiplesOf4.length; i++) {
			multiplesOf4[i] = (i + 1) * 2;
			System.out.println(multiplesOf4[i]);
		}
		
	}
}	


