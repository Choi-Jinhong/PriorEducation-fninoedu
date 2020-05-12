package src;

public class Minimum {
    public static void main(String[] args) {
        int[] values = {3, 7, 33, 92, 9};
        int temp = Integer.MAX_VALUE; // 임시 저장 변수, Integer.MAX_VALUE; >> INT값중 제일 큰 값이 나옴
        for(int i = 0; i < values.length; i++){
            if(temp > values[i])
                temp = values[i];
        }
        System.out.println(temp);
    }
}
