
public class HomeworkQuestion2and5and6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Homework Question 2
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double sum = 0;
		
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		System.out.println(sum / names.length);
		
		for (String name: names) {
		    System.out.print(name + " ");
		
//Homework Questions 5 and 6
		int[] nameLengths = new int[names.length];
		for (int j = 0; j < nameLengths.length; j++) {
			nameLengths[j] = names[j].length();
				System.out.println(names[j].length() + " ");
		}
		System.out.println(" ");
	}
}}