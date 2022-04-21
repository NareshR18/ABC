package MavenNaresh.project_example;

public class PojoB {
	
	/*private PojoB(String a, long l) {
		System.out.println("Student Name:"+a);
		System.out.println("Student Id no. :"+l);
		
	}

	public PojoB(char c, float f) {
		
		System.out.println("Grade:"+c);
		System.out.println("Percentage:"+f);
		
	}*/
	
	public static void main(String[] args) {
		
	//	PojoB b=new PojoB("Naresh",12345698 );
//		PojoB b1=new PojoB('A',72.8f);
		
		PojoC c=new PojoC();
		PojoA ab=new PojoA();
		c.setS(12);
		c.setS(25);
		ab.setB((byte) 22);
		System.out.println(c.getS());
		System.out.println(ab.getB());
		
	}

}
