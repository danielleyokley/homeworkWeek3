import java.util.Scanner;

public class menuExample {
	static Scanner s = new Scanner(System.in);
	static int addingIndex = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] movies = new String[5];
		
		int decision = 0;
		
		while(decision != -1) {
			showMenu();
			decision = s.nextInt();
			
			if (decision < -1 || decision > 5) {
				System.out.println("Please choose a valid option.");
				
			} else if (decision == 1) {
				showMovies(movies);
			} else if (decision == 2) {
				showMovieOption(movies);
			} else if (decision == 3) {
				addMovie(movies);
			} else if (decision == 4) {
				removeMovie(movies);
			} else {
				removeAllMovies(movies);
			}
		}
	}
	public static void removeAllMovies(String[] movies) {
		for (int i = 0; i < movies.length; i++) {
			movies[i] = null;
		}
	}	
		public static void removeMovie(String[] movies) {
			System.out.print("Please enter movie name you want to remove: ");
			int movieToRemove = s.nextInt();
			if (isValid(movieToRemove)) {
				movies[movieToRemove] = null;
			}
		}
		private static void showMovies(String[] movies) {
			System.out.println("Movies: ");
			for (int i = 0; i < movies.length; i++) {
				System.out.println(i + ": " + movies[i]);
		}
}
		public static void showMovieOption(String[] movies) {
			System.out.print("Which movie number do you want to view? ");
			int movieNumber = s.nextInt();
			if (isValid(movieNumber)) {
				System.out.println(movieNumber + ": " + movies[movieNumber]);
			
				
		}
	}		
		public static void addMovie(String[] movies) {
			System.out.print("Enter new movie name please: ");
			String newMovie = s.next();
			if (isValid(addingIndex)) {
			movies[addingIndex++] = newMovie;
			}	
		}
	
		public static boolean isValid(int input) {
			if (input >= 0 && input < 5) {	
				return true;
			} else {
				System.out.println("Invalid entry.");
				return false;
			}
		}
		public static void showMenu() {
			System.out.println("Please pick an option or enter -1 to exit.");
			System.out.println("1) Show movies");
			System.out.println("2) Show movie option");
			System.out.println("3) Add movie");
			System.out.println("4) Remove movie");
		}
}
