public class TestMyClass 
{
	public static void main(String[] args) 
	{
		MyClass m = new MyClass();
		m.display();
		
		//MyClass m;
		m= new MyClass(12,89.89f, "abc", 45.7389d,true);
		m.display();		
	}

}
