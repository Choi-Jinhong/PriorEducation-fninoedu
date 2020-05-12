package src;

public class Array {
    public static void main(String[] args) {
        int array[][] = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j <3; j++)
                array[i][j] = (int)(Math.random()*26);
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j <3; j++)
                System.out.print(array[i][j]);
            System.out.println("");
        }

        int[] score1 = new int[3];
        score1[2] = 70;
        int[] score2 = {100, 90, 80};
        for(int i = 0; i < 3; i++){
            System.out.printf("score1: %s, score2: %s \n", score1[i], score2[i]);
        }
    }
}
