public class Main {
    //Number of Instructions: 32
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int num1 = 874, num2 = 222, num3 = 158, num4 = 555, num5 = 696, num6 = 1, num7 = 999, num8 = 888, num9 = 769, num10 = 399;

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

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Total elapsed time: " + elapsedTime + " nanoseconds.");
        long oneRunElapsed = elapsedTime / 10;
        System.out.println("Time for One Run: " + oneRunElapsed + " nanoseconds.");
    }

    public static void toBinary(int num){
        int[] binary = new int[40];
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
