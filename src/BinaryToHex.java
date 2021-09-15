public class BinaryToHex {
	public static void main(String[] args) {
		String num1 = "1101101010";
		String num2 = "11011110";
		String num3 = "10011110";
		String num4 = "1000101011";
		String num5 = "1010111000";
		String num6 = "1";
		String num7 = "1011100001000";
		String num8 = "10001010111000";
		String num9 = "10010110010111001";
		String num10 = "111010110111100110100010101";

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
	}
}
