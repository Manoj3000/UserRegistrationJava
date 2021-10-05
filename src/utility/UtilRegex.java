package utility;

public class UtilRegex {
	public static String name = "^[A-Z]{1}[a-z]{2,16}$";
	public static String email = "^[a-z0-9.]+@[a-z0-9.]+\\.[a-z]{2,6}$";
	public static String mobileNumber = "^([0-9]{1,3}[- .]?)[6789][0-9]{9}$";
	public static String password = "(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9]{8,}";
}
