/*
 * お菓子店クラス　伊藤
 */
public class Store {
    private static final Snack[] Snackies = new Snack[3];
    public int asset = -250;

    /*
     * お菓子の売却を実行　伊藤
     */
    public void perform() {
        Snackies[0] = new Kabayakisan();
        Snackies[1] = new Oyatukarupasu();
        Snackies[2] = new Potetohurai();

        for (Snack aSnack : Snackies) {
            aSnack.sell();
            this.asset += aSnack.getValue();
        }

        System.out.println("総資産 : 円" + this.asset);

        if (this.asset >= 0) {
            System.out.println("店は返済できた");
        } else {
            System.out.println("返済できなかった...");
        }
    }

    public static void main(String[] args) {
        Store store = new Store();
        store.perform();
    }
}


       