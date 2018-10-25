package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import test.data.TestData;
import com.cuongvo.util.Util;

@RunWith(Parameterized.class)
public class InvalidEmailTest {

	private String email;

	public InvalidEmailTest(String email) {
		this.email = email;
	}
	
	@Parameters
	public static List<String> validEmailList() {
		List<String> list = new ArrayList<String>();
		list.add(TestData.INVALID_EMAIL_1);
		list.add(TestData.INVALID_EMAIL_2);
		list.add(TestData.INVALID_EMAIL_3);
		list.add(TestData.INVALID_EMAIL_4);
		list.add(TestData.INVALID_EMAIL_5);
		list.add(TestData.INVALID_EMAIL_6);
		list.add(TestData.INVALID_EMAIL_7);
		list.add(TestData.INVALID_EMAIL_8);
		list.add(TestData.INVALID_EMAIL_9);
		list.add(TestData.INVALID_EMAIL_10);
		list.add(TestData.INVALID_EMAIL_11);
		list.add(TestData.INVALID_EMAIL_12);
		list.add(TestData.INVALID_EMAIL_13);
		list.add(TestData.INVALID_EMAIL_14);
		list.add(TestData.INVALID_EMAIL_15);
		list.add(TestData.INVALID_EMAIL_16);
		
		return list;
	}
	
	@Test
	public void isValidEmailAddress() {
		boolean actual;
		try {
			actual = Util.isValidEmailAddress(email);
			assertEquals(false, actual);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
