package basic.challenges.prob4;

public class prob4_11 {
    public static void main(String[] args) {
        int maxNum = 0;
        for(int i = 0; i < 10; i++)
        {
            int randomNum = (int)(Math.random() * 10) + 1;
            System.out.println("randomNum = " + randomNum);
            if(randomNum > maxNum)
            {
                maxNum = randomNum;
            }   
        }
        System.out.println("maxNum = " + maxNum);
    }   
}
