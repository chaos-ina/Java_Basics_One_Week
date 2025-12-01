package day6;

public class Sample603 {
    public static void main(String[] args) {
        // ==========================================================
        // 解説 (Explanation)
        // ==========================================================
        // インスタンスを作って、そのインスタンスに「動作」をさせます。

        SampleClass03 hero = new SampleClass03("勇者", 50, 20);

        System.out.println("=== 戦闘開始！ ===");
        hero.showStatus();

        // 攻撃させる
        hero.attack();

        // 回復させる (1回目)
        hero.heal();
        hero.showStatus(); // ステータスが変わっているか確認

        // 回復させる (2回目)
        hero.heal();
        hero.showStatus();

        // 回復させる (3回目: MPが足りないはず)
        hero.heal();

        // ==========================================================
        // やってみよう (Try this)
        // ==========================================================
        // 1. attack() を3回連続で呼び出してみましょう
        for(int i = 0; i < 3; i++) {
            hero.attack();
        }
        // 2. SampleClass03で作った runAway() メソッドをここで呼び出してみましょう
        hero.runAway();
    }
}
