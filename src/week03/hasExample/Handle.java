package week03.hasExample;

public class Handle {
    String company;
    String type;

    public Handle(String company, String type) {
        this.company = company;
        this.type = type;
    }

    public void turnHandle(String direction) {
        System.out.println(direction + " 방향으로 돌립니다.");
    }
}
