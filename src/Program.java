import java.util.Scanner;

public class Program {
	public static Person person;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String myName = input.nextLine();
		//System.out.println("Welcome " + myName);
		
		System.out.println("Enter your gender:");
		String myGender = input.nextLine();
		
		System.out.println("Enter your age:");
		int myAge = input.nextInt();
		//System.out.println("Your age is " + myAge);
		// TODO Auto-generated method stub
		System.out.println("Program started...");
		person = new Person(46);
		person.setGender("Male");
		person.setName("Alan");
		
		System.out.println(person.getName());
		
		person.runs();
		
		System.out.printf("%s is %s who is %s years old", myName, myGender, myAge);
	}
}
