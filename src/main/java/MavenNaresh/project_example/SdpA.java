package MavenNaresh.project_example;

public class SdpA {
	
	private static SdpA nares ;
	private SdpA() {

	System.out.println("Singleton Design Pattern");
	
	}

	public void sdp() {
		System.out.println("Plain Old Java Object");
	}
	
	public void pojosdp() {
	
		System.out.println("Framework");

	}
	public static SdpA getinstance() {
		if (nares== null) {
			nares = new SdpA();
		}
		
		
		
		return nares;
		// TODO Auto-generated method stub

	}
	
	
}
