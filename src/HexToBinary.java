public class HexToBinary {
	public static void main(String[] args) {
		String hex1 = "36a";
		String hex2 = "de";
		String hex3 = "9e";
		String hex4 = "22b";
		String hex5 = "2b8";
		String hex6 = "1";
		String hex7 = "3e7";
		String hex8 = "378";
		String hex9 = "301";
		String hex10 = "18f";

		int decimal1 = getDecimal(hex1);
		int decimal2 = getDecimal(hex2);
		int decimal3 = getDecimal(hex3);
		int decimal4 = getDecimal(hex4);
		int decimal5 = getDecimal(hex5);
		int decimal6 = getDecimal(hex6);
		int decimal7 = getDecimal(hex7);
		int decimal8 = getDecimal(hex8);
		int decimal9 = getDecimal(hex9);
		int decimal10 = getDecimal(hex10);

		toBinary(decimal1);
		toBinary(decimal2);
		toBinary(decimal3);
		toBinary(decimal4);
		toBinary(decimal5);
		toBinary(decimal6);
		toBinary(decimal7);
		toBinary(decimal8);
		toBinary(decimal9);
		toBinary(decimal10);

	}

	public static void toBinary(int num){
		int binary[] = new int[40];
		int index = 0;
		while(num > 0){
			binary[index++] = num%2;
			num = num/2;
		}
		for(int i = index-1;i >= 0;i--){
			System.out.print(binary[i]);
		}
		System.out.println();//new line
	}

	public static int getDecimal(String hex){
		String digits = "0123456789ABCDEF";
		hex = hex.toUpperCase();
		int val = 0;
		for (int i = 0; i < hex.length(); i++){
			char c = hex.charAt(i);
			int d = digits.indexOf(c);
			val = 16 * val + d;
		}
		return val;
	}
}
