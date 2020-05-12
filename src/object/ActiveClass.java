package object;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Random;
import java.util.Scanner;

public class ActiveClass {
    public static void main(String[] args) throws IOException {
//        웹소켓 클래스 ServerSocket
        ServerSocket ss = new ServerSocket(8888);
        ss.accept();
        System.out.println("클라이언트 접속!!!!");
//        Scanner 사용법
//        1. import
//        2. ()안에 뭔가를 입력해야 함
//        Scanner에서 많이 사용하는 메소드는 "next().~"이다.
//        해당 값들은 변수로 받아서 사용하는 것이 일반적이고, 해당 자료형이 들어가도 되는 곳도 그냥 들어가도 된다.
//        주석처리 "Ctrl + /"
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("입력값은? " + input); // 이와 같이 해당내용을 확인하기 위해 중간중간 확인하는 것을 "로그를 남긴다"라고 한다.

        Random ran = new Random();
        int num = ran.nextInt(6);
        System.out.println("랜덤값은? " + num);

        TV t1 = new TV();
        TV t2 = new TV();

        t1.show();
        t2.show();

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1 == t2);
    }
}
