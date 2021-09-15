public class BinaryToDecimal {
	//Number of Instructions: 54/44
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
		System.out.println(Integer.parseInt(num1,2));
		System.out.println(Integer.parseInt(num2,2));
		System.out.println(Integer.parseInt(num3,2));
		System.out.println(Integer.parseInt(num4,2));
		System.out.println(Integer.parseInt(num5,2));
		System.out.println(Integer.parseInt(num6,2));
		System.out.println(Integer.parseInt(num7,2));
		System.out.println(Integer.parseInt(num8,2));
		System.out.println(Integer.parseInt(num9,2));
		System.out.println(Integer.parseInt(num10,2));
		 */

		System.out.println(binToDec(num1));
		System.out.println(binToDec(num2));
		System.out.println(binToDec(num3));
		System.out.println(binToDec(num4));
		System.out.println(binToDec(num5));
		System.out.println(binToDec(num6));
		System.out.println(binToDec(num7));
		System.out.println(binToDec(num8));
		System.out.println(binToDec(num9));
		System.out.println(binToDec(num10));

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
}
