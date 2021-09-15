public class HexToBinary {
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
}
