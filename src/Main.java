public class Main {

    public static void main(String[] args) {

        System.out.println("Converting 874 from decimal to binary");
        int num = 420;

        String binaryNum = "";

         do {
            binaryNum =  num % 2 + binaryNum;
            num = num / 2;
            System.out.println(num);
            System.out.println(binaryNum);
        } while (num > 0);

    }
}
