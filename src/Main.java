public class Main {

    public static void main(String[] args) {

        int num1 = 874, num2 = 222, num3 = 158, num4 = 555, num5 = 696, num6 = 1, num7 = 5896, num8 = 8888, num9 = 76985, num10 = 123456789;
        toBinary(num1);
        toBinary(num2);
        toBinary(num3);
        toBinary(num4);
        toBinary(num5);
        toBinary(num6);
        toBinary(num7);
        toBinary(num8);
        toBinary(num9);
        toBinary(num10);

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
