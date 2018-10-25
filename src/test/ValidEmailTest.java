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
public class ValidEmailTest {
    private String email;

    public ValidEmailTest(String email) {
        this.email = email;
    }

    @Parameters
    public static List<String> validEmailList() {
        List<String> list = new ArrayList<String>();
        list.add(TestData.VALID_EMAIL_1);
        list.add(TestData.VALID_EMAIL_2);
        list.add(TestData.VALID_EMAIL_3);
        list.add(TestData.VALID_EMAIL_4);
        list.add(TestData.VALID_EMAIL_5);
        list.add(TestData.VALID_EMAIL_6);
        list.add(TestData.VALID_EMAIL_7);
        list.add(TestData.VALID_EMAIL_8);
        list.add(TestData.VALID_EMAIL_9);
        list.add(TestData.VALID_EMAIL_10);
        list.add(TestData.VALID_EMAIL_11);
        list.add(TestData.VALID_EMAIL_12);
        list.add(TestData.VALID_EMAIL_13);

        return list;
    }

    @Test
    public void isValidEmailAddress() {
        boolean actual;
        try {
            actual = Util.isValidEmailAddress(email);
            assertEquals(true, actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
