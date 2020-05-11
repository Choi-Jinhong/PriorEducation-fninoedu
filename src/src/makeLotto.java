package src;

public class makeLotto {
    public static void main(String[] args) {
        int lotto[] = new int[6];
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int)(Math.random() * 45 + 1);
            for(int j = 0; j < i; j++){ // 중복 체크 후 변경
                if(lotto[i] == lotto[j]){
                    lotto[i] = (int)(Math.random() * 45 + 1);
                    j = -1; // 처음부터 다시 확인
                }
            }
        }
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}