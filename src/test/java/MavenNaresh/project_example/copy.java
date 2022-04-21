package MavenNaresh.project_example;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class copy {

@Test
@Parameters({"p1","p2"})
public  void parameter(String s, int i) {
	  System.out.println("Name:"+s);
	  System.out.println("Age:"+i);
	  
  }
}
