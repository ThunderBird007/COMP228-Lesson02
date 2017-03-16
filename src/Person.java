
public class Person {
	private String _gender;
	private String _name;
	private int _age;
	
	// properties
	public String getGender() {
		return this._gender;
	}

	public void setGender(String gender) {
		this._gender = gender;
	}
	
	public String getName() {
		return this._name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public Person(int age) {
		this._age = age;
	}
	
	public void runs() {
		System.out.println(this._name + " Runs");
		System.out.printf("%s Runs", this._name);
	}

}
