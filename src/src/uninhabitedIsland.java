package src;

public class uninhabitedIsland {
    public static void main(String[] args) {
        boolean checker = false;
        while(checker == false){
            int dice1 = (int)((Math.random())*6+1);
            int dice2 = (int)((Math.random())*6+1);
            System.out.printf("dice1: %s, dice2: %s \n", dice1, dice2);
            if(dice1 == dice2)
                checker = true;
        }
        System.out.println("무인도를 탈출하였습니다.");
    }
}