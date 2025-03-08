package week02.operator;

public class W09 {
    public static void main(String[] args) {

        // 두 피연산자 타입 중 저장공간 크기가 더 큰 타입으로 일치 시킴

        short x = 10;
        int y = 20;

        int z = x + y;

        long lx = 30L;
        long lz = z + lx;

        float fx = x;
        float fy = y;
        float fz = z;

        System.out.println(lz);
        System.out.println(fx);
        System.out.println(fy);
        System.out.println(fz);
    }
}
