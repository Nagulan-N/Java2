package demo;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.setName(name);
        this.setAge(18); // Default age
    }

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void displayInfo() {
        System.out.println("Name: " + getName() + ", Age: " + getAge());
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
