public class Main {
    public static void main(String[] args) {
        // abstract
        /*
        一個修飾子，可以用來修飾類別和方法
        抽象類別只能被繼承，不能被實體化
         */

        /*
        1. 一個類別只能繼承一個抽象類別
        2. 抽象類別可以定義方法本體
        3. 以資料為主體
        4. 資料欄位，事後可以修改
         */

        B b = new B();
        b.makeMoney();
        b.makeMoney2();
    }
}
