package test.data;

public class TestData {
	public static final String VALID_EMAIL_1 = "email@domain.com";
	public static final String VALID_EMAIL_2 = "firstname.lastname@domain.com";
	public static final String VALID_EMAIL_3 = "email@subdomain.domain.com";
	public static final String VALID_EMAIL_4 = "firstname+lastname@domain.com";
	public static final String VALID_EMAIL_5 = "email@123.123.123.123";
	public static final String VALID_EMAIL_6 = "email@[123.123.123.123]";
	public static final String VALID_EMAIL_7 = "\"email\"@domain.com";
	public static final String VALID_EMAIL_8 = "1234567890@domain.com";
	public static final String VALID_EMAIL_9 = "email@domain-one.com";
	public static final String VALID_EMAIL_10 = "_______@domain.com";
	public static final String VALID_EMAIL_11 = "email@domain.name";
	public static final String VALID_EMAIL_12 = "email@domain.co.jp";
	public static final String VALID_EMAIL_13 = "firstname-lastname@domain.com";

	public static final String INVALID_EMAIL_1 = "plainaddress";
	public static final String INVALID_EMAIL_2 = "#@%^%#$@#$@#.com";
	public static final String INVALID_EMAIL_3 = "@domain.com";
	public static final String INVALID_EMAIL_4 = "Joe Smith <email@domain.com>";
	public static final String INVALID_EMAIL_5 = "email.domain.com";
	public static final String INVALID_EMAIL_6 = "email@domain@domain.com";
	public static final String INVALID_EMAIL_7 = ".email@domain.com";
	public static final String INVALID_EMAIL_8 = "email.@domain.com";
	public static final String INVALID_EMAIL_9 = "email..email@domain.com";
	public static final String INVALID_EMAIL_10 = "あいうえお@domain.com";
	public static final String INVALID_EMAIL_11 = "email@domain.com (Joe Smith)";
	public static final String INVALID_EMAIL_12 = "email@domain";
	public static final String INVALID_EMAIL_13 = "email@-domain.com";
	public static final String INVALID_EMAIL_14 = "email@domain.web";
	public static final String INVALID_EMAIL_15 = "email@111.222.333.44444";
	public static final String INVALID_EMAIL_16 = "email@domain..com";
}
