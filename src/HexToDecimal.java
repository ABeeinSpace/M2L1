public class HexToDecimal {
	public static void main(String[] args) {
		String hex1 = "36a";
		String hex2 = "de";
		String hex3 = "9e";
		String hex4 = "22b";
		String hex5 = "2b8";
		String hex6 = "1";
		String hex7 = "1708";
		String hex8 = "22b8";
		String hex9 = "12cb9";
		String hex10 = "75bcd15";

		int decimal1 = Integer.parseInt(hex1,16);
		int decimal2 = Integer.parseInt(hex2,16);
		int decimal3 = Integer.parseInt(hex3,16);
		int decimal4 = Integer.parseInt(hex4,16);
		int decimal5 = Integer.parseInt(hex5,16);
		int decimal6 = Integer.parseInt(hex6,16);
		int decimal7 = Integer.parseInt(hex7,16);
		int decimal8 = Integer.parseInt(hex8,16);
		int decimal9 = Integer.parseInt(hex9,16);
		int decimal10 = Integer.parseInt(hex10,16);

		System.out.println(decimal1);
		System.out.println(decimal2);
		System.out.println(decimal3);
		System.out.println(decimal4);
		System.out.println(decimal5);
		System.out.println(decimal6);
		System.out.println(decimal7);
		System.out.println(decimal8);
		System.out.println(decimal9);
		System.out.println(decimal10);
	}
}
