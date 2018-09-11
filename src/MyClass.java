public class MyClass {
	
	private int age;
	private float percentage;
	private String name;
	private double salary;
	private boolean isEmployed;
	
	public void display()
	{
		System.out.println("age: " + age + " " + name);
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isEmployed() {
		return isEmployed;
	}
	public void setEmployed(boolean isEmployed) {
		this.isEmployed = isEmployed;
	}
	public MyClass() //default constructor
	{
		age = 22;
		percentage = 99.87f;
		name = "Anusua";
		salary = 10000.99d;
		isEmployed = true;
			}
	
	public MyClass (int age, float p, String n, double s, boolean i)//parameterised constructor 
	{
		this.age = age;
		this.percentage = p;
		this.name = n;
		this.salary = s;
		this.isEmployed = i;		
	}
}
