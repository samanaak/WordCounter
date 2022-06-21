package WordCount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordCountTestCase {

	@Test
	void test() throws Exception{
		WordCount test= new WordCount();
		int output= test.Word_count("/Users/samana/Downloads/Words1.txt");
		assertEquals(4,output);
	}

}
