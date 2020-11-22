public class Main {
    public static void main(String[] args) {
        // 語法 :
        /*
        for(迴圈控制變數初始化 ; 迴圈控制變數判斷 ; 迴圈控制變數遞增、減資料) {
            程式執行區塊
        }
         */

        for (int i = 0 ; i < 10 ; i++){
            System.out.println("i = " + i);
        }

        // foreach 迴圈
        /*
        for(資料型態 迴圈控制變數 : 集合或陣列資料) {
            程式執行區塊
        }
         */

        int[] intArr = {10 , 20 , 5 , 3 , 100};
        for (int i : intArr){
            System.out.println("Arr : " + i);
        }
    }
}
