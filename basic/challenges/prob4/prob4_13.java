package basic.challenges.prob4;

public class prob4_13 {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 10) + 1;
        final int THRESHOLD = 5;
        if (randomNum >= THRESHOLD)
        {
            for(int i = 0; i < randomNum; i++)
            {
                System.out.print("*");
            }
        }
        else
        {
            System.out.println("randomNum = " + randomNum);
        }

    }   
}
