public class Main {
    public static void main(String[] args) {
        /*
        if 可以處理範圍資料的判斷
        switch 只能處理 case 常數值判斷
         */
        /*
        switch 根據資料值，選擇程式分支，只做一次運算，處理效率較高
        if...else... 需每個都判斷
         */

        // 補充資料：運行時間
        // 使用 for loop 進行大量運算，可以看出 if...else... 和 switch 之間的時間差異
        /*
        long 變數名稱 = System.nanoTime();
         */

        //記錄開始時間
        long ifStartTime = System.nanoTime();

        String strVal = "999";
        if ("1".equals(strVal)) {
            System.out.println(strVal);
        } else if ("2".equals(strVal)) {
            System.out.println(strVal);
        } else if ("3".equals(strVal)) {
            System.out.println(strVal);
        } else if ("4".equals(strVal)) {
            System.out.println(strVal);
        } else if ("5".equals(strVal)) {
            System.out.println(strVal);
        } else if ("6".equals(strVal)) {
            System.out.println(strVal);
        } else if ("7".equals(strVal)) {
            System.out.println(strVal);
        } else if ("8".equals(strVal)) {
            System.out.println(strVal);
        } else if ("9".equals(strVal)) {
            System.out.println(strVal);
        } else if ("10".equals(strVal)) {
            System.out.println(strVal);
        } else if ("11".equals(strVal)) {
            System.out.println(strVal);
        } else if ("12".equals(strVal)) {
            System.out.println(strVal);
        } else if ("13".equals(strVal)) {
            System.out.println(strVal);
        } else if ("14".equals(strVal)) {
            System.out.println(strVal);
        } else if ("15".equals(strVal)) {
            System.out.println(strVal);
        } else {
            System.out.println(strVal);
        }

        //記錄結束時間
        long ifEndTime = System.nanoTime();

        //印出時間差= 結束時間 - 開始時間
        System.out.println("if 所需的時間 : " + (ifEndTime - ifStartTime));

        // ----------------------------------------------

        long switchStartTime = System.nanoTime();
        String strVal2 ="999";
        switch (strVal) {
            case "1":
                System.out.println(strVal2);
                break;
            case "2":
                System.out.println(strVal2);
                break;
            case "3":
                System.out.println(strVal2);
                break;
            case "4":
                System.out.println(strVal2);
                break;
            case "5":
                System.out.println(strVal2);
                break;
            case "6":
                System.out.println(strVal2);
                break;
            case "7":
                System.out.println(strVal2);
                break;
            case "8":
                System.out.println(strVal2);
                break;
            case "9":
                System.out.println(strVal2);
                break;
            case "10":
                System.out.println(strVal2);
                break;
            case "11":
                System.out.println(strVal2);
                break;
            case "12":
                System.out.println(strVal2);
                break;
            case "13":
                System.out.println(strVal2);
                break;
            case "14":
                System.out.println(strVal2);
                break;
            default:
                System.out.println(strVal2);
                break;
        }

        //記錄結束時間
        long switchEndTime = System.nanoTime();

        //印出時間差= 結束時間 - 開始時間
        System.out.println("switch 所需的時間 : " + (switchEndTime - switchStartTime));
    }
}
