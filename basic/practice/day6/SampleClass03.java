package basic.practice.day6;

public class SampleClass03 {
    // ==========================================================
    // 解説 (Explanation)
    // ==========================================================
    // クラスには「データ(フィールド)」だけでなく
    // 「動作(メソッド)」も定義できます。

    String name;
    int hp;
    int mp;

    public SampleClass03(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    // 攻撃するメソッド
    public void attack() {
        System.out.println(this.name + " の攻撃！");
        System.out.println("敵に 10 のダメージを与えた！");
    }

    // 回復するメソッド
    public void heal() {
        // MPが足りるかチェック
        if (this.mp >= 10) {
            this.mp -= 10; // MPを10消費
            this.hp += 20; // HPを20回復
            System.out.println(this.name + " は魔法で回復した！ (HP+20, MP-10)");
        } else {
            System.out.println(this.name + " はMPが足りなくて回復できない！");
        }
    }

    public void showStatus() {
        System.out.println("[" + this.name + "] HP:" + this.hp + " MP:" + this.mp);
    }

    // ==========================================================
    // やってみよう (Try this)
    // ==========================================================
    // 1. 新しいメソッド runAway() (逃げる) を作ってみましょう
    // (中身は "〇〇は逃げ出した！" と表示するだけでOK)
    public void runAway() {
        System.out.println(this.name + "は逃げ出した！");
    }
    // 2. heal() メソッドの回復量を 20 から 50 に変えてみましょう
}
