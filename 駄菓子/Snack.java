/**
 * お菓子の基底クラスです　伊藤
 */
public class Snack {
    public int unitPrice = 50;
    public String name; // お菓子の名前を追加



    /*
     * お菓子を売却します　伊藤
     */
    public void sell() {
        this.unitPrice = (int) (Math.random() * 200);
        System.out.println(name + "単価＄" + this.unitPrice + "で売却した！");
    }
    /*　伊藤
     * お菓子の価値を計算
     * @return 価値
     */
    public int getValue() {
        // 価値の計算ロジックを実装する
        // 例: 単価を返す場合
        return unitPrice;
    }
}