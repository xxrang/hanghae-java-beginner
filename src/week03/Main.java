package week03;

public class Main {
    public static void main(String[] args) {
//        Car[] carArr = new Car[3];
//        Car car1 = new Car();
//        Car car2 = new Car();
//        Car car3 = new Car();
//
//        car1.changeGear('P');
//        carArr[0] = car1;
//
//        car2.changeGear('N');
//        carArr[1] = car2;
//
//        car3.changeGear('D');
//        carArr[2] = car3;
//
//        for (Car car: carArr) {
//            System.out.println("car.gear = " + car.gear);
//        }

        Car car = new Car();

//        System.out.println(car.lights);
//        System.out.println(car.model);
//        System.out.println(car.color);
//        System.out.println("---------");
//
//        car.color = "blue";
//        car.speed = 100;
//        car.lights = false;
//
//        System.out.println(car.color);
//        System.out.println(car.speed);
//        System.out.println(car.lights);
        double speed = car.gasPedal(100, 'D');
        System.out.println("speed = " + speed);

        boolean lights = car.onOffLight();
        System.out.println("lights = " + lights);

        System.out.println();
        System.out.println("car.gear = " + car.gear);

        System.out.println();
        car.carSpeed(100, 110, 120);
    }
}
