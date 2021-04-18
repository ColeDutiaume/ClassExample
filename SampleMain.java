package example;
import java.util.Scanner;

public class SampleMain {

	public static void main(String[] args) {
		
		String breedName;
		String dogName;
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What breed is your Dog?");
		breedName = input.nextLine();
		System.out.println("What is your Dog's name?");
		dogName = input.nextLine();
		System.out.println("How old is your dog?");
		age = input.nextInt();
		input.close();
		
		Constructor obj1 = new Constructor(breedName, dogName, age);
		obj1.greeting();
		obj1.SpeciesType();
		obj1.Power();

	}

}
