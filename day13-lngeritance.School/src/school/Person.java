package school;

public abstract class Person {
	
	//1. 맴버변수
	private String id;
	private String name;
	private int age;
	
	//2. 생성자
	public Person(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this. age = age;
	}
	
	//3. 메소드
	// 접근자 / 수정자
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	@Override
	public String toString() {
		return String.format("ID :%s , 이름:%s, 나이:%d", id, name, age);
	}
	
	
	
	
}
