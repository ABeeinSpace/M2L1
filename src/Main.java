public class Main {

    public static void main(String[] args) {

        System.out.println("Converting 874 from decimal to binary");
        int num = 874;

        String binaryNum = "";

        while (num > 0) {
            num = num / 2;
            binaryNum =  num % 2 + binaryNum;
            System.out.println(num);
            System.out.println(binaryNum);
        }

    }
}
