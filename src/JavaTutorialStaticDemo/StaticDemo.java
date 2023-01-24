package JavaTutorialStaticDemo;

public class StaticDemo {

	public static void main (String [] args)
	{
		Student john = new Student("John",25,"23 East,California");
		
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getAddress());
	
		
		Student john2 = new Student("John",25,"23 East,California");
		Student john3= new Student("John",25,"23 East,California");
		Student john4 = new Student("John",25,"23 East,California");
		Student john5 = new Student("John",25,"23 East,California");

	}
}
