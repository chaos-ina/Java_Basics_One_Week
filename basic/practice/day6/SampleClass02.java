package day6;

public class SampleClass02 {
    // ==========================================================
    // 解説 (Explanation)
    // ==========================================================
    // クラスは「設計図」なので、1つの設計図から
    // 複数の「実体（インスタンス）」を作ることができます。

    // フィールド (Field)
    String name; // 名前
    int hp; // 体力
    int mp; // 魔力

    // コンストラクタ (Constructor)
    public SampleClass02(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    // パラメータを表示するメソッド
    public void showStatus() {
        System.out.println("名前: " + this.name);
        System.out.println(" HP : " + this.hp);
        System.out.println(" MP : " + this.mp);
        System.out.println("--------------------");
    }
}
