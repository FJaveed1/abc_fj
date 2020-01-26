package test_fj;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class inu1 {
  @Test
  public void f() {
	  System.out.println("From the test method");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("From the beforeSuite method");
  }
  

  @AfterSuite
  public void afterSuite() {
	  System.out.println("From the afterSuite method");
  }

}
