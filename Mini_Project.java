package project;
import java.util.Scanner;
public class Mini_Project {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int myNumber = (int)(Math.random()*1000);
	int userNumber = 0 ;
	do {
		System.out.println("Guess My Number : ");
		 userNumber = sc.nextInt();
		if(userNumber == myNumber) {
			System.out.println("Whooh.... You are slected right!!");
			break;
		}
		else if(userNumber > myNumber) {
			System.out.println("OOPS! You entered a larger one!");
		}
		else {
			System.out.println("OOPS! You entered a smaller one!");
		}
	}while(userNumber>=0);
}
}
