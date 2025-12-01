package basic.challenges.prob3;

public class prob3_15 {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100) + 1;
        final int A_THRESHOLD = 80;
        final int B_THRESHOLD = 60;
        final int C_THRESHOLD = 40;
        System.out.println("randomNum = " + randomNum); 
        if (randomNum >= A_THRESHOLD) 
        {
            System.out.println("A");
        } 
        else if (A_THRESHOLD > randomNum && randomNum >= B_THRESHOLD) 
        {
            System.out.println("B");
        } 
        else if (B_THRESHOLD > randomNum && randomNum >= C_THRESHOLD) 
        {
            System.out.println("C");
        } 
        else 
        {
            System.out.println("D");
        }
    }
}
