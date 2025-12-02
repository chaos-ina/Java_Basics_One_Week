package basic.practice.day6;

public class Sample602 {
    public static void main(String[] args) {
        // ==========================================================
        // 解説 (Explanation)
        // ==========================================================
        // 1つのクラス(SampleClass02)から、2人のキャラクターを作ります。
        // それぞれ別のデータ(名前やHP)を持っていることを確認しましょう。

        // 1人目：勇者 (Hero)
        SampleClass02 hero = new SampleClass02("勇者", 100, 50);

        // 2人目：戦士 (Warrior)
        SampleClass02 warrior = new SampleClass02("戦士", 150, 0);

        // それぞれのステータスを表示
        System.out.println("=== 1人目のステータス ===");
        hero.showStatus();

        System.out.println("=== 2人目のステータス ===");
        warrior.showStatus();

        // ==========================================================
        // やってみよう (Try this)
        // ==========================================================
        // 1. 3人目のキャラクター「魔法使い (Wizard)」を作ってみましょう
        // (例: 名前="魔法使い", HP=50, MP=100)
        SampleClass02 wizard = new SampleClass02("魔法使い", 50, 100);
        System.out.println("=== 3人目のステータス ===");
        wizard.showStatus();
        // 2. 勇者のHPを変更してみましょう
        // hero.hp = 200;
        hero.hp = 200;
        System.out.println("=== HP変更後のステータス ===");
        hero.showStatus();
    }
}
