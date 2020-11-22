public class Main {
    public static void main(String[] args) {
        // override

        // 方法重載(overload) v.s. 方法重寫(override)
        /*
        方法重載(overload) : 一個類別中，有同樣的方法名稱，但參數資料不同
        方法重寫(override) : 子類別繼承父類別，覆寫父類別方法，方法名稱與參數都一樣
         */

        Dog dog = new Dog();
        dog.move();

        Bird bird = new Bird();
        bird.move();
    }
}
