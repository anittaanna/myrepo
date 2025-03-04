package inheritance;

public class HierClassB extends HierParent{
	
	public void hello()
	{
		System.out.println("I am child class B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HierClassB obj1=new HierClassB();
		obj1.hello();
		obj1.display();
		
		
	}

}
