import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


public class WCTest {
	@Test
	public void countCharacters_1(){
		String s = "hello, this is a good day.";
		WC wc_obj = new WC();
		int result = wc_obj.countLength(s);
		assertEquals(result,26);
	}

	@Test
	public void countCharacters_2(){
		String s = "hello, this is a good day.\r\n";
		WC wc_obj = new WC();
		int result = wc_obj.countLength(s);
		assertEquals(result,28);
	}

	@Test
	public void countCharacters_3(){
		String s = "hello, this is a good day.\r\nWhat do you think?\r\n";
		WC wc_obj = new WC();
		int result = wc_obj.countLength(s);
		assertEquals(result,48);
	}		

}