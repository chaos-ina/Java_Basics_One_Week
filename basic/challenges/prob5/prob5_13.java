package basic.challenges.prob5;

public class prob5_13 {
    public static void main(String[] args) {
        int d[][] = new int[3][3];
        int maxNum = 0;
        // 多次元配列では、配列の長さを取得する方法が異なる
        // d.lengthは行数を取得する
        // d[i].lengthは列数を取得する

        // 2次元配列の初期化と最大値計算
        for(int i = 0; i < d.length; i++)
        {
            for(int j = 0; j < d[i].length; j++)
            {
                d[i][j] = (int)(Math.random() * 9) + 1;
                if(d[i][j] > maxNum)
                {
                    maxNum = d[i][j];
                }
            }
        }  

        // 2次元配列の表示
        for(int i = 0; i < d.length; i++)
        {
            for(int j = 0; j < d[i].length; j++)
            {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("maxNum = " + maxNum);
    }
}
