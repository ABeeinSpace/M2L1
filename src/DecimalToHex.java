public class DecimalToHex {

	public static void main(String[] args) {
		int num1 = 874, num2 = 222, num3 = 158, num4 = 555, num5 = 696, num6 = 1, num7 = 5896, num8 = 8888, num9 = 76985, num10 = 123456789;

		/*
		System.out.println(Integer.toHexString(num1));
		System.out.println(Integer.toHexString(num2));
		System.out.println(Integer.toHexString(num3));
		System.out.println(Integer.toHexString(num4));
		System.out.println(Integer.toHexString(num5));
		System.out.println(Integer.toHexString(num6));
		System.out.println(Integer.toHexString(num7));
		System.out.println(Integer.toHexString(num8));
		System.out.println(Integer.toHexString(num9));
		System.out.println(Integer.toHexString(num10));
		*/

		System.out.println(decToHex(num1));
		System.out.println(decToHex(num2));
		System.out.println(decToHex(num3));
		System.out.println(decToHex(num4));
		System.out.println(decToHex(num5));
		System.out.println(decToHex(num6));
		System.out.println(decToHex(num7));
		System.out.println(decToHex(num8));
		System.out.println(decToHex(num9));
		System.out.println(decToHex(num10));


	}

	public static String decToHex(int decimal){
		int remainder;
		String hex="";
		char hexChars[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		while(decimal>0)
		{
			remainder = decimal % 16;
			hex=hexChars[remainder] + hex;
			decimal=decimal / 16;
		}
		return hex;
	}
}
