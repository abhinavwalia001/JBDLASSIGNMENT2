package Comp;

public class Person  implements Comparable<Person>{
	
	private int id;
	private String name;
	private double salary;
	private int age;
	
	public Person(int id, String name,double salary, int age) {
		this.id = id;
		this.name=name;
		this.salary = salary;
		this.age =age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person other) {
		
		int nameComp =this.name.compareTo(other.name);
		if (nameComp !=0) {
			
			return nameComp;
		}
		// TODO Auto-generated method stub
		return Double.compare(salary, other.salary);
	}
	
	

}
