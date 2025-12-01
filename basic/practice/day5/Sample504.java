package day5;

public class Sample504 {
    public static void main(String[] args) {
        int mn[][] = new int[2][3];
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                mn[i][j] = i * 3 + j + 1;
            }
        }
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("mn[" + i + "][" + j + "] = " + mn[i][j] + " ");
            }
            System.out.println();
        }
    }
}
