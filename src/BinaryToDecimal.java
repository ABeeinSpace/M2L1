public class BinaryToDecimal {
	public static void main(String[] args) {
		int binaryNum = 1000101;
		int decimalNumber = 0;
		int i = 0;
		int temp = 0;
		while (true) {
			if (binaryNum == 0) {
				break;
			} else {
				temp = binaryNum % 10;
				decimalNumber += temp * Math.pow(2, i);
				binaryNum = binaryNum / 10;
				i++;

			}
		}
		System.out.println(decimalNumber);
	}
}
