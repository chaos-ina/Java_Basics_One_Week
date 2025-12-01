package basic.challenges.prob3;

public class prob3_17 {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 100) + 1;
        System.out.println("randomNum = " + randomNum); 
        
        if (randomNum % 2 == 0 && randomNum <= 50)
        {
            System.out.println("randomNum is even and less than or equal to 50");
        }
        else if (randomNum <= 50)
        {
            System.out.println("randomNum is less than or equal to 50");
        }
        else if (randomNum % 2 == 0)
        {
            System.out.println("randomNum is even");
        };
    }   
}
