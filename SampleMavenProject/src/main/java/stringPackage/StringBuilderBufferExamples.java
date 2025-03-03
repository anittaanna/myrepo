package stringPackage;

public class StringBuilderBufferExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		StringBuffer a=new StringBuffer("Anitta");
		System.out.println(a);
		StringBuilder a1=new StringBuilder("James");
		System.out.println(a1);
		
		//append- to add a string to another string 
		
		System.out.println(a.append(a1));
		System.out.println(a.append("ok"));
		
		//insert- to insert a value at specific index
		
		System.out.println(a.insert(0, "display"));
		
		//Replace- to replace a character 
		System.out.println(a1.replace(2, 4, "rate"));
		
		// reverse- to reverse the string
		System.out.println(a1.reverse());
		
		// delete- to delete from specific index
		
		System.out.println(a1.delete(2, 3));
		
		
		
		
		
		
		
		

	}

}
