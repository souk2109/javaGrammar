package object;

public class StudentObj {
	private String name;
	private int age;
	private int grade;
	
	public StudentObj() {
	}
	
	public StudentObj(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "StudentObj [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	
}
