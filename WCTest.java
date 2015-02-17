import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


public class WCTest {
	@Test
	public void countCharacters_1(){
		String s = "hello, this is a good day.";
		WC wc_obj = new WC();
		int result = wc_obj.countCharacters(s);
		assertEquals(result,26);
	}

	@Test
	public void countCharacters_2(){
		String s = "hello, this is a good day.\r\n";
		WC wc_obj = new WC();
		int result = wc_obj.countCharacters(s);
		assertEquals(result,28);
	}

	@Test
	public void countCharacters_3(){
		String s = "hello, this is a good day.\r\nWhat do you think?\r\n";
		WC wc_obj = new WC();
		int result = wc_obj.countCharacters(s);
		assertEquals(result,48);
	}		

	@Test
	public void countWords_1(){
		String s = "hello, this is a good day.";
		WC wc_obj = new WC();
		int result = wc_obj.countWords(s);
		assertEquals(result,6);
	}

	@Test
	public void countWords_2(){
		String s = "hello, this is a good day.\r\n";
		WC wc_obj = new WC();
		int result = wc_obj.countWords(s);
		assertEquals(result,6);
	}

	@Test
	public void countWords_3(){
		String s = "hello, this is a good day.\r\nWhat do you think?\r\n";
		WC wc_obj = new WC();
		int result = wc_obj.countWords(s);
		assertEquals(result,10);
	}

	@Test
	public void countLines_1(){
		String s = "hello, this is a good day.";
		WC wc_obj = new WC();
		int result = wc_obj.countLines(s);
		assertEquals(result,0);
	}

	@Test
	public void countLines_2(){
		String s = "hello, this is a good day.\r\n";
		WC wc_obj = new WC();
		int result = wc_obj.countLines(s);
		assertEquals(result,1);
	}

	@Test
	public void countLines_3(){
		String s = "hello, this is a good day.\r\nWhat do you think?\r\n";
		WC wc_obj = new WC();
		int result = wc_obj.countLines(s);
		assertEquals(result,2);
	}

	@Test
	public void countLines_4(){
		String s = "hello, this is a good day.\r\nWhat do you think?";
		WC wc_obj = new WC();
		int result = wc_obj.countLines(s);
		assertEquals(result,2);
	}

	@Test
	public void asWC_1(){
		String s = "hello, this is a good day.\r\nWhat do you think?\r\n";
		WC wc_obj = new WC();
		String result = wc_obj.actual_WC(s);
		assertEquals(result,"2\t10\t48");
	}
}