public class Student{
	
	private int rollnumber;
	private String name;
	private String address;
	private int standard;
	private int age;
	
	public void show()
	{
		System.out.println("Roll Number: " + rollnumber); 
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Standard: " + standard);
		System.out.println("Age: " + age);
		System.out.println();
		
	}
	public Student() //default constructor
	{
		rollnumber = 140106009;
		name = "Anusua Sarkar";
		address = "Pittie Kourtyard";
		standard = 12;
		age = 22;
		
	
	}
	
	public Student(int r, String n, String add, int s, int a)//parameterised constructor 
	{
		rollnumber = r;
		name = n;
		address = add;
		standard = s;
		age = a;
		}
}
