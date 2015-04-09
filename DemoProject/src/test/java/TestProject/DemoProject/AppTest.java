package TestProject.DemoProject;

import junit.framework.Assert;

import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
	
	@Test
	public void test1(){
		
		Assert.assertEquals("abc", "abc");
	}
	
	@Test
	public void test2(){
		
		Assert.assertEquals("abc", "abc1");
	}
	
	@Test
	public void test3(){
		
		Assert.assertEquals("abc1", "abc");
	}
}
