package stringPackage;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s= "Hello";
	int u=s.length();
	System.out.println(u);
	
	// Length method- to print leght of s  
	// charAt - to take specific character form string
	
	char v=s.charAt(4);
	System.out.println(v);
	
	char a[]= {'a','b'};
	String s2= new String(a);
	System.out.println(s2);
	System.out.println(s);
	
	String s1=new String("Hello World");
	System.out.println(s1);
	
	
	String m ="Java";
	String n = "java";
	String o = "Selenium";
	
	// equals - 2 check 2 string 
	System.out.println(m.equals(n));
	System.out.println(n.equals(o));
	
	
	// Equal ignore case
	System.out.println(m.equalsIgnoreCase(n));

	
	//concat- to combine 2 strings
	System.out.println(n.concat(o));
	System.out.println(n.contains(o));
	
	
	// to upper case - to change lower casse string to upper case
	
	System.out.println(n.toUpperCase());
	
	// to lower case
	
	String u1= "SELENIUM";
	System.out.println(u1.toLowerCase());
	
	
	
	//value of - for type casting- to convert from any type to string 
	
	int y= 6;
	String u2=String.valueOf(y);
	System.out.println(u2);
	
	// is empty- to check string is empty or not (space will consider as a value
	
	System.out.println(u1.isEmpty());
	String u4= " ";
	System.out.println(u4.isEmpty());
	
	
	
	
	
	
	
	char r= m.charAt(1);
		System.out.println(r);
		
		
		
		String p = "My name is Anitta";
		// contains method- to check specific word in string
		
		System.out.println(p.contains("name"));
		System.out.println(p.contains("ok"));

		String u6="Marks";
		String u7="Marks";
		System.out.println(u6==u7);
		
		String u8=new String("Marks");
		System.out.println(u7==u8);
		
		
		System.out.println(p.contains("Anitta"));
		
		System.out.println(p.contains("Anittaret"));

		
		
		
		
		
		
		
		
		
		
		
	}

}
