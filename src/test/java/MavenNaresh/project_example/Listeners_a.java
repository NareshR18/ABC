package MavenNaresh.project_example;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Listeners_a implements IRetryAnalyzer {
	int count = 1;
	int limit = 10;

	public boolean retry(ITestResult result) {

		if (count <= limit) {
			count++;
			return true;

		}
		return false;
	}

}
