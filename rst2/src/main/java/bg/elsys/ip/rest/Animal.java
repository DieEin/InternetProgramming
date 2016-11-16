package bg.elsys.ip.rest;

public class Animal {
	private int age;
	private String name;
	private String type;
	
	public Animal() {
		
	}
	
	public Animal(int age, String name, String type) {
		super();
		this.age = age;
		this.name = name;
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
