package basic.challenges.prob3;

public class prob3_16 {
    public static void main(String[] args) {
        // int randomNum = (int)(Math.random() * 100) + 1;
        int randomNum = 12;
        System.out.println("randomNum = " + randomNum); 
        if (randomNum % 6 == 0)
        {
            System.out.println("/6");
        }
        else if(randomNum % 3 == 0)
        {
            System.out.println("/3");
        }
        else if(randomNum % 2 == 0)
        {
            System.out.println("/2");
        }

    }   
}
