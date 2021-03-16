package app;

public class StringUtil {
	
	public static Boolean isInvalid(String s) {
		Boolean invalid = Boolean.FALSE;
		
		if(s == null || s.trim().isEmpty()){
			invalid = Boolean.TRUE;
		}
		return invalid;
	}
	
	public static String reverseString(String s) {
		if(isInvalid(s) == Boolean.TRUE) {
			return null;
		}
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		return sb.toString();
	}
}
