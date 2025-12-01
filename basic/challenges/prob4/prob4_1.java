package basic.challenges.prob4;

public class prob4_1 {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 10) + 1;
        System.out.println("randomNum = " + randomNum);
        for(int i = 0; i < randomNum; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }   
}
