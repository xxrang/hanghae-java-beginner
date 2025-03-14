package week03.constructor;

public class Car {

    static final String COMPANY = "GENESIS"; // 자동차 회사 : GENESIS
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear = 'P'; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태


    public Car(String modelName) {
        model = modelName;
        System.out.println("첫 번째");
    }

    public Car(String modelName, String colorName) {
        model = modelName;
        color = colorName;
        System.out.println("두 번째");
    }

    public Car(String modelName, String colorName, double priceValue) {
        model = modelName;
        color = colorName;
        price = priceValue;
        System.out.println("세 번째");
    }

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵빵");
    }
}
