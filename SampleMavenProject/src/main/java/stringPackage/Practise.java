package stringPackage;

public class Practise {

	public static void main(String[] args) {
		
		
		char a[]= { 'u','b','c'};
		
		String s1=new String (a);
		System.out.println(s1);
		
		String s2="Selenium";
		System.out.println(s2.length());
		
		String s3="selenium";
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		String s4="automation";
		System.out.println(s3.concat(s4));
		
		System.out.println(s2.toUpperCase());
		
		String s5="MAN";
		System.out.println(s5.toLowerCase());
		
		int num=3456;
		System.out.println(String.valueOf(num));
		
		System.out.println(s5.isEmpty());
		
		
		
		StringBuffer s6=new StringBuffer("Anitta");
		
		StringBuilder s7=new StringBuilder("James");
System.out.println(s6.append("OK"));
System.out.println(s6.append(s7));
System.out.println(s6.insert(2, "may"));
System.out.println(s6.replace(2, 6, "anna"));
System.out.println(s6.reverse());
		
		
		
		
		
		

	}

}
