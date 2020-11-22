public class Main {
    public static void main(String[] args) {
        // 存取修飾子
        /*
        public、protected、default、private
        可用來修飾類別、方法和變數。
        不同存取修飾子，各有不同的存取權限。

        開放權限大小 : public -->> protected -->> default -->> private
         */

        Account account = new Account();
        account.userID = 123;

        SomeClass someClass = new SomeClass();
        someClass.ID = 111;
    }

    static class SomeClass {
        private int ID;
    }
}
