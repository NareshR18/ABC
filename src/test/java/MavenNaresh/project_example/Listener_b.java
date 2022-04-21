package MavenNaresh.project_example;

import java.lang.reflect.Constructor;
import java.lang.annotation.Annotation;


import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;


public class Listener_b implements IAnnotationTransformer{
	


	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {


		annotation.setRetryAnalyzer(Listeners_a.class);
	
	}
	
	
	

	
	

	
	
	
	
	
	
}
		
