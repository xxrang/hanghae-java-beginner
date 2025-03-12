package week03;

public class Car {
    /*
    1. 설계도 선언(클래스 선언)
    2. 속성(필드)를 정의
    3. 생성 방식 정의 (생성자)
    4. 행위(메서드)를 정의
    * */

    // <필드 영역>

    // 고유데이터 영역
    String company;
    String model = "GV80";
    String color;
    double price;

    // 상태 데이터 영역
    double speed;
    char gear;
    boolean lights = true;

    // 객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;

    // <생성자> : 처음 객체가 생성될 때(인스턴스) 어떤 로직을 수행하고, 어떤값이 필수로 들어와야 하는지 정의
    public Car () {
        // 기본생성자 (로직, 매개변수 없음, 생략 가능
        System.out.println("생성자 호출");
    }

    // <메서드> 정의

    // gasPedal
    // input: kmh
    // output: speed
    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    // brakePedal
    // input: x
    // output: speed
    double brakePedal() {
        speed = 0;
        return speed;
    }

    // changeGear
    // input: gear(P,R,N,D char type)
    // output: gear
    char changeGear(char type) {
        gear = type;
        return gear;
    }

    // onOffLight
    // input: x
    // output: boolean type (On/Off)
    boolean onOffLight() {
        lights = !lights;
        return lights;
    }

    // horn
    // input: x
    // output: x
    void horn() {
        System.out.println("경적빵빵~!");
    }

    void carSpeed(double ...speeds) {
        for (double v : speeds) {
            System.out.println("v = " + v);
        }
    }
}
