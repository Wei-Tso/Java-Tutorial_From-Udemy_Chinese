public class Main {
    public static void main(String[] args) {
        // 語法
        /*
        修飾詞  資料返回類型  方法名稱(參數資料類型  參數名稱) {
            程式碼執行區塊
        }
         */
        /*
        修飾詞 : 決定此方法是否對外其他類別開放使用
                public : 公開
                private : 私有
        資料返回類型 : 可有回傳值，也可以無回傳值
                void : 表示無任何回傳值
        參數資料類型 : 呼叫方法，可有一個或多個傳遞參數到此方法中，也可以無傳遞任何參數
         */

        initData();
        initData(100 , 10);
    }

    // 方法須寫在這裡
    public static void initData() {
        int x = 100;
        int y = 10;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void initData(int x , int y) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    // 方法重載
    // 同樣的方法，但參數不同
    public static void initData(double x , double y) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
