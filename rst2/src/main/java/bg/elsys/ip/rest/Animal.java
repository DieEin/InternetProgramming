package bg.elsys.ip.rest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Animal {
	
	@ApiModelProperty(required = true, value = "The age of the animal(an integer value).", example = "4")
	private int age;
	@ApiModelProperty(required = false, value = "The name of the animal if it has one.", example = "pesho")
	private String name;
	@ApiModelProperty(required = true, value = "The type of the animal.", example = "dog")
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
