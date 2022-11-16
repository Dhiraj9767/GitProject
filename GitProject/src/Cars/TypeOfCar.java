package Cars;

import java.util.Scanner;

public class TypeOfCar {
	public static void main(String[] args) {
		System.out.println("program started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Car Name");
		String namesofcar = sc.next();
		
		if(namesofcar=="ertiga") {
			
			System.out.println("type of car is suzuki");
			
		}else {
			System.out.println("type of car is nexa");
		}
		
		System.out.println("end the program");
		
		System.out.println("end ");
	}
}
