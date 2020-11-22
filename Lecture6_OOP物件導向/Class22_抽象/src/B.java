public class B extends A{

    /*
    因為繼承 A，A 裡面有抽象方法，所以必須將抽象方法實作出來
     */
    @Override
    void makeMoney2() {
        System.out.println("B make money...");
    }
}
