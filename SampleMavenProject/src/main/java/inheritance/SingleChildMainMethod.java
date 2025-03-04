package inheritance;

public class SingleChildMainMethod extends SingleParent {
	public void child()
	{
		System.out.println("This is child class ");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleChildMainMethod obj=new SingleChildMainMethod ();
		obj.child();
		obj.display();
		
		SingleParent obj1=new SingleParent();
		obj1.display();
		// parent cl

	}

}
