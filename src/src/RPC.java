package src;

import java.util.Scanner;

public class RPC {
    public static void main(String[] args) {
        int user, com;
        System.out.println("가위(0), 바위(1), 보(2) 중 하나를 입력해 주세요.:");
        user = new Scanner(System.in).nextInt();
        com = (int)(Math.random()*3);
        System.out.printf("컴퓨터가 선택한 것은 %s 입니다.", com);
        int result = user - com;
        if(result == 1 || result == -2)
            System.out.println("유저 승리");
        else if(result == 0)
            System.out.println("무승부");
        else // if((user + 1) % 3 == com), %연산을 이용하면 다양한 코드를 작성 할 수 있음
            System.out.println("유저 패배");
    }
}