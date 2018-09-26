package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.Bird;
import com.Communicate;
import com.Fly;
import com.Move;
import com.Sing;

public class BirdTest extends Assert   {
	
	public Move fly;
	public Communicate sing;
	public Bird bird; 
	
	@Before
	public void setUp() throws Exception {
		fly = new Fly();
		sing = new Sing();
		bird = new Bird(fly, sing);
	}
	
	@Test
	public void flyTest() throws Exception {
		
		Assert.assertEquals("Sing Sing", bird.movement());
		
	}

	@Test
	public void singTest() throws Exception {
		Assert.assertEquals("I am Flying", bird.communication());	
		
	}


}
