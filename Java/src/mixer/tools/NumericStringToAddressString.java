package mixer.tools;

import java.io.UnsupportedEncodingException;

import mixer.AddressUtils;

public strictfp final class NumericStringToAddressString {
	
	private NumericStringToAddressString() {
		
		super();
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		if (args.length == 1) {
			
			String numericString = new String(args[0].getBytes("UTF-8"), "UTF-8");
			
			String addressString = AddressUtils.numericStringToAddressString(numericString);
			
			System.out.println(addressString);
		}
		else {
			
			System.out.println("Tool for converting numeric form BTC addresses into regular form");
			System.out.println("Usage: ");
			System.out.println("0 - Numeric String");
		}
	}
}
