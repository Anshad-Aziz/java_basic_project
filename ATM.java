import java.util.*;
public class atm {
	public static void main(String []args) {
		int pin=1234;
		int balance=10000;
		
		int addamount=0;
		int takeamount=0;
		String name;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Pin Number:");
		int password=scanner.nextInt();
		if(password==pin) {
			System.out.println("Enter the Name:");
			name=scanner.next();
			System.out.println("Welcome "+name);
			while(true) {
				System.out.println("Press 1 to check balance:");
				System.out.println("Press 2 to add amount:");
				System.out.println("Press 3 to take amount:");
				System.out.println("Press 4 to take Resipt:");
				System.out.println("Press 5 to Exit:");
				int opt=scanner.nextInt();
				switch(opt) {
				case 1:
					System.out.println("Your current balance is"+balance);
					break;
				case 2:
					System.out.println("How much did you want to add to your account");
					addamount=scanner.nextInt();
					System.out.println("Successfully credited");
					balance=addamount+balance;
					System.out.println("");
					break;
				case 3:
					System.out.println("How much amount did you want to take:");
					takeamount=scanner.nextInt();
					if(takeamount>balance) {
						System.out.println("Your balance is insufficient:");
						System.out.println("try less than your available balance");
					}
					else {
						System.out.println("successfull taken");
						balance=balance-takeamount;
						
					}
					break;
				case 4:
					System.out.println("Welcome to All in one ATM");
					System.out.println("Available balance is "+balance);
					System.out.println("Amount Deposited "+addamount);
					System.out.println("Amount taken "+takeamount);
					System.out.println("Thank for coming");
					break;
					default:
						System.out.println("Press the number below 5");
						break;
						
				}
				if(opt==5) {
					System.out.println("Thank You");
					break;
				}
			}
			
		}
		else {
			System.out.println("Wrong Password,Please Enter the Correct Password:");
		}
	}

}
