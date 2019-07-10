
public class HWQ13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Use a method to show that if you are over 20 years old and you have bills to pay or less than 40 dollars in wallet
//then it will print true to cook at home Question: Are you going to cook at home today?
		int age = 30;
		boolean billsToPay = true;
		double moneyInWallet = 30.00;
		System.out.println(willCookAtHome(age,billsToPay,moneyInWallet));
	}
	
		public static boolean willCookAtHome(int age, boolean billsToPay, double moneyInWallet) {
			return (age > 20 && (billsToPay || moneyInWallet < 40.00));
		}
	}


