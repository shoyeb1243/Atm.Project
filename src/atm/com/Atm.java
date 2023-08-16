package atm.com;
import java.util.Scanner;
public class Atm{
	public static void main(String[] args) {
		int balance = 2000, withdraw, deposit;

		Scanner sc = new Scanner(System.in);
		Scanner pin = new Scanner(System.in);
		System.out.println("Thankyou for Visiting in our ATM---");
		System.out.println("Please Enter Pin");
		int pin1 = sc.nextInt();
		if (pin1 == 1243) {
			System.out.println("Enter your Choice");

			while (true) {
				System.out.println("Automated Teller Machine");
				System.out.println("Choose 1 for Withdraw");
				System.out.println("Choose 2 for Deposit");
				System.out.println("Choose 3 for Check Balance");
				System.out.println("Choose 4 for EXIT");
				System.out.print("Choose the operation you want to perform:");

				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Enter money to be withdrawn:");

					withdraw = sc.nextInt();

					if (balance >= withdraw) {
						balance = balance - withdraw;
						System.out.println("Please collect your money");
					} else {
						System.out.println("Insufficient Balance");

					}
					System.out.println("");
					break;

				case 2:

					System.out.print("Enter money to be deposited:");

					deposit = sc.nextInt();

					balance = balance + deposit;
					System.out.println("Your Money has been successfully deposited");
					System.out.println("Total Amount: " + balance);
					System.out.println("");
					break;

				case 3:
					System.out.println("Balance : " + balance);
					System.out.println("");
					break;

				case 4:
					System.out.println("Bye Guy's");
					System.out.println("");
					System.exit(4);
					break;

				default:
					System.out.println("Wrong Choose number");
					System.out.println();
					break;

				}

			}
		} else {
			System.out.println("Wrong Pin...");
			System.out.println("Please Enter Correct Pin");

			if (pin1 != 1243);
				
			System.out.println("2 ateempt left");

			int pin11 = sc.nextInt();
			if (pin11 == 1243) {
				System.out.println("Enter your Choice");
				while (true) {
					System.out.println("Automated Teller Machine");
					System.out.println("Choose 1 for Withdraw");
					System.out.println("Choose 2 for Deposit");
					System.out.println("Choose 3 for Check Balance");
					System.out.println("Choose 4 for EXIT");
					System.out.print("Choose the operation you want to perform:");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.print("Enter money to be withdrawn:");

						withdraw = sc.nextInt();

						if (balance >= withdraw) {
							balance = balance - withdraw;
							System.out.println("Please collect your money");
						} else {
							System.out.println("Insufficient Balance");

						}
						System.out.println("");
						break;

					case 2:

						System.out.print("Enter money to be deposited:");

						deposit = sc.nextInt();

						balance = balance + deposit;
						System.out.println("Your Money has been successfully deposited");
						System.out.println("Total Amount: " + balance);
						System.out.println("");
						break;

					case 3:
						System.out.println("Balance : " + balance);
						System.out.println("");
						break;

					default:
						System.out.println("Wrong Choose number");
						System.out.println();
						break;

					}
				}
			} else {
				System.out.println("Warning-: 1 ateempt left");

				int pin14 = sc.nextInt();
				if (pin14 != 1243) {
					System.out.println("Your card block after 24 hours..");
				} else {
					System.out.println("Enter your Choice");
					while (true) {
						System.out.println("Automated Teller Machine");
						System.out.println("Choose 1 for Withdraw");
						System.out.println("Choose 2 for Deposit");
						System.out.println("Choose 3 for Check Balance");
						System.out.println("Choose 4 for EXIT");
						System.out.print("Choose the operation you want to perform:");
						int choice = sc.nextInt();
						switch (choice) {
						case 1:
							System.out.print("Enter money to be withdrawn:");

							withdraw = sc.nextInt();

							if (balance >= withdraw) {
								balance = balance - withdraw;
								System.out.println("Please collect your money");
							} else {
								System.out.println("Insufficient Balance");

							}
							System.out.println("");
							break;

						case 2:

							System.out.print("Enter money to be deposited:");

							deposit = sc.nextInt();

							balance = balance + deposit;
							System.out.println("Your Money has been successfully deposited");
							System.out.println("Total Amount: " + balance);
							System.out.println("");
							break;

						case 3:
							System.out.println("Balance : " + balance);
							System.out.println("");
							break;

						default:
							System.out.println("Wrong Choose number");
							System.out.println();
							break;

						}

					}

				}
			}
		}
	}
}
