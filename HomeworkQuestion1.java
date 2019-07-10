
public class HomeworkQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//question 1
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int first1 = ages[0];
		int last1 = ages[ages.length-1];
			System.out.println(last1 - first1);
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 101};
		int first2 = ages2[0];
		int last2 = ages2[ages2.length-1];		  
			System.out.println(last2 - first2);		  
			
		double sum = 0;
		for (int i = 0; i < ages2.length; i++) {
			sum = sum + ages2[i];
		}
			double average = sum / ages2.length;
		
		System.out.println("Average is:" + " " + average);
		
		}
	}	



