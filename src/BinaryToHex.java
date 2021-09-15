public class BinaryToHex {
	//Number of Instructions: 68/88
	public static void main(String[] args) {

		long startTime = System.nanoTime();

		int num1 = 1101101010;
		int num2 = 11011110;
		int num3 = 10011110;
		int num4 = 1000101011;
		int num5 = 1010111000;
		int num6 = 1;
		int num7 = 1111100111;
		int num8 = 1101111000;
		int num9 = 1100000001;
		int num10 = 110001111;

		/*
		int decimal1 = (Integer.parseInt(num1,2));
		int decimal2 = (Integer.parseInt(num2,2));
		int decimal3 = (Integer.parseInt(num3,2));
		int decimal4 = (Integer.parseInt(num4,2));
		int decimal5 = (Integer.parseInt(num5,2));
		int decimal6 = (Integer.parseInt(num6,2));
		int decimal7 = (Integer.parseInt(num7,2));
		int decimal8 = (Integer.parseInt(num8,2));
		int decimal9 = (Integer.parseInt(num9,2));
		int decimal10 = (Integer.parseInt(num10,2));

		System.out.println(Integer.toHexString(decimal1));
		System.out.println(Integer.toHexString(decimal2));
		System.out.println(Integer.toHexString(decimal3));
		System.out.println(Integer.toHexString(decimal4));
		System.out.println(Integer.toHexString(decimal5));
		System.out.println(Integer.toHexString(decimal6));
		System.out.println(Integer.toHexString(decimal7));
		System.out.println(Integer.toHexString(decimal8));
		System.out.println(Integer.toHexString(decimal9));
		System.out.println(Integer.toHexString(decimal10));
		 */

		int decimal1 = binToDec(num1);
		int decimal2 = binToDec(num2);
		int decimal3 = binToDec(num3);
		int decimal4 = binToDec(num4);
		int decimal5 = binToDec(num5);
		int decimal6 = binToDec(num6);
		int decimal7 = binToDec(num7);
		int decimal8 = binToDec(num8);
		int decimal9 = binToDec(num9);
		int decimal10 = binToDec(num10);

		System.out.println(decToHex(decimal1));
		System.out.println(decToHex(decimal2));
		System.out.println(decToHex(decimal3));
		System.out.println(decToHex(decimal4));
		System.out.println(decToHex(decimal5));
		System.out.println(decToHex(decimal6));
		System.out.println(decToHex(decimal7));
		System.out.println(decToHex(decimal8));
		System.out.println(decToHex(decimal9));
		System.out.println(decToHex(decimal10));

		long endTime = System.nanoTime();
		long elapsedTime = endTime - startTime;
		System.out.println("Total elapsed time: " + elapsedTime + " nanoseconds.");
		long oneRunElapsed = elapsedTime / 10;
		System.out.println("Time for One Run: " + oneRunElapsed + " nanoseconds.");

	}

	public static int binToDec(int binary) {
		int decimal = 0;
		int n = 0;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				double temp = binary % 10;
				decimal += temp * Math.pow(2, n);
				binary = binary / 10;
				n++;
			}
		}
		return decimal;
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
