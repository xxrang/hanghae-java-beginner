package week02.operator;

public class W12 {
    public static void main(String[] args) {
        // 중첩 if문
        boolean flag = true;
        int number = 2;

        if (flag) {
            System.out.println("flag true");
            if (number == 1) {
                System.out.println("flag true, number 1");
            } else if (number == 2) {
                System.out.println("flag true, number 2");
            } else {
                System.out.println("flag true, number dont know");
            }
        } else {
            System.out.println("flag false");
            if (number == 1) {
                System.out.println("flag flase, number 1");
            } else if (number == 2) {
                System.out.println("flag false, number 2");
            } else {
                System.out.println("flag false, number dont know");
            }
        }
    }
}
