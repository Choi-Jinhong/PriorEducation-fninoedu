package src;

public class Method {
    static double getAverage(int sum, double ea){
        return sum/ea; // 연산시 최대 범위의 자료형을 따라가게 됨
    }

    static int getTotal(int a){
        int total = 0;
        for(int i = 1; i <= a; i++){
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        int a = 100;
        System.out.println((long)Math.pow(2, 38)); // 제곱계산, 2.74877906944E11(E11: 10의 11제곱)
        System.out.println(getTotal(a));
        System.out.printf("합: %s, 평균: %s", getTotal(a), getAverage(getTotal(a), a));
    }
}
