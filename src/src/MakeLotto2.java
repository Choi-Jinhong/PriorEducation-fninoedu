package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MakeLotto2 {
    public static void main(String[] args) {
        Lotto_Start();
    }

    public static void Lotto_Start() {
        Random ran = new Random();
        ArrayList<Integer> n = new ArrayList<Integer>();

        while((int)n.size() < 6) {
            int x = ran.nextInt(45) + 1;
            n.add(x);
            for(int i = 0; i < ((int)n.size()-1); i++) {
                if(x == n.get(i)){
                    n.remove(i);
                }
            }
        }

        Collections.sort(n);

        for(int i = 0 ; i < n.size() ; i++) {
            System.out.print(n.get(i) + " ");
        }
    }
}