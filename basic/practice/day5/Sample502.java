package basic.practice.day5;

public class Sample502 {
    public static void main(String[] args) {
        // データ型[] 配列名 = new データ型[配列の大きさ];
        int[] d = new int[3];
        d[0] = 1;
        d[1] = 2;
        d[2] = 3;
        
        // 配列.lengthで配列の大きさを取得
        for(int i = 0; i < d.length; i++)
        {
            System.out.println("d[" + i + "] = " + d[i]);
        }
    }
}
