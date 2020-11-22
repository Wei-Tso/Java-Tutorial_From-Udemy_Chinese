public class Main implements A,B{
    // 實作介面，使用 implements 關鍵字
    // 可以 implements 多個介面  v.s.  只能繼承一個
    public static void main(String[] args) {
        // 語法 :
        /*
        封裝修飾子  interface  介面名稱{
            方法
        }
         */

        /*
        1. 一個類別可以實作多個介面
        2. 介面不能定義方法本體
        3. 以行為方法為主體
        4. 資料欄位，預設是 public static final，所以資料不能修改
         */


        System.out.println("x = " + x);

        // 介面是不能被實體化
        // A a = new A();

    }

    /*
    必須將介面的方法實做出來
     */
    @Override
    public void getAData() {

    }

    @Override
    public void getBData() {

    }
}
