package mixer;

public strictfp final class AddressUtils {
	
	private AddressUtils() {
		
		super();
	}
	
	public static String addressStringToNumericString(String addressString) {
		
		addressString = leftPad(addressString, "0", 34);
		
		String result = "";
		
		for (int i = 0; i < addressString.length(); i++) {
			
			result += leftPad(new Integer(addressString.charAt(i)).toString(), "0", 3);
		}
		
		return result;
	}
	
	public static String numericStringToAddressString(String numericString) {
		
		numericString = repeat("0", numericString.length() % 2) + numericString;
		
		if (numericString.length() != 102) {
			
			throw new IllegalArgumentException("Numeric addresses must be 102 characters long! ");
		}
		
		String result = "";
		
		for (int i = 0; i < numericString.length() / 3; i++) {
			
			result += (char) Integer.parseInt(numericString.substring(i * 3, (i + 1) * 3));
		}
		
		return result;
	}
	
	public static String leftPad(String s, String p, int n) {
		
		String r = s;
		
		while (r.length() < n) {
			
			r = p + r;
		}
		
		return r;
	}
	
	public static String[] splitString(String s, int n) {
		
		if (s.length() % n != 0) {
			
			throw new IllegalArgumentException("String is not divisible by the number of parts! ");
		}
		
		String[] r = new String[n];
		
		int l = s.length() / n;
		
		for (int i = 0; i < n; i++) {
			
			r[i] = s.substring(i * l, (i + 1) * l);
		}
		
		return r;
	}
	
	public static String repeat(String s, int n) {
		
		String result = "";
		
		for (int i = 0; i < n; i++) {
			
			result += s;
		}
		
		return result;
	}
}