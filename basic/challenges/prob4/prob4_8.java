package basic.challenges.prob4;

public class prob4_8 {
    public static void main(String[] args) {
        while(true)
        {
            int randomNum = (int)(Math.random() * 10) + 1;
            System.out.println("randomNum = " + randomNum);
            if(randomNum == 10)
            {
                System.out.println("END");
                break;
            }
        }
    }
}
