package basic.challenges.prob3;

public class prob3_18 {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 45) - 10;
        final int VERYHOT_THRESHOLD = 30;
        final int HOT_THRESHOLD = 25;
        final int COLD_THRESHOLD = 0;

        System.out.println("randomNum = " + randomNum);

        if (randomNum >= VERYHOT_THRESHOLD) {
            System.out.println("VERY HOT");
        } else if (randomNum >= HOT_THRESHOLD) {
            System.out.println("HOT");
        } else if (randomNum < COLD_THRESHOLD) {
            System.out.println("COLD");
        } else
        {
            System.out.println("NORMAL");
        }
    }
}
