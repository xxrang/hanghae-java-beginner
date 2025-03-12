package week03.sample;

public class Main {
    public static void main(String[] args) {
        // public week02.homework.Main () {} 기본 생성자 포함되어 있음
        Main main = new Main();

        System.out.println(main.getNum());

    }

    public int getNum() {
        int number = 1;
        number += 1;
        return number;
    }
}
