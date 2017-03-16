
public class Program {
	public static Person person;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program started...");
		person = new Person(46);
		person.setGender("Male");
		person.setName("Alan");
		
		System.out.println(person.getName());
		
		person.runs();
		//System.out.printf(format, args)
	}
}
