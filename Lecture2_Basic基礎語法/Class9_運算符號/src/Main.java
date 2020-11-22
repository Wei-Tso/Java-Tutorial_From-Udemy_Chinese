public class Main {
    public static void main(String[] args) {
        // 指定運算符號 : =

        // 算數運算符號 :
            /*
            + : 加法，字串則是將兩個字串進行串接
            - : 減法
            * : 乘法
            / : 除法
            % : 取餘數
             */

        // 進階指定運算符號 :
            /*
            += : a = a + b
            -= : a = a - b
            *= : a = a * b
            /= : a = a / b
            %= : a = a % b
             */

        // 單元運算符號 :
            /*
            + : 正值
            - : 負值
            ++ : 遞增運算，資料值 +1
            -- : 遞減運算，資料值 -1
             */

        // 遞增 / 遞減 運算符號前綴和後綴差異
            /*
            a++ : 先取出 a 的資料後，才做 a = a + 1 的動作
            ++a : 先做 a = a + 1 的動作，再取出 a
             */

        // 邏輯運算符號 :
            /*
            && : 兩個皆為 true，才為 true
            || : 其中一個為 true，即為 true
            ! : 布琳的反向運算
             */

        // 關係運算符號 :
            /*
            == : 兩值相等，即為 true；注意；字串判斷是否相等需使用 equal
            != : 兩值不相等，即為 true
            > : 左側值 大於 右側值，即為 true
            < : 左側值 小於 右側值，即為 true
            >= : 左側值 大於或等於 右側值，即為 true
            <= : 左側值 小於或等於 右側值，即為 true
             */

        // 條件運算符號 : 三元運算符號
            /*
            資料型態  變數名稱 = (條件運算) ? (條件為 true 取此值) : (條件為 false 取此值)

            int a = 10;
            int b = 2;
            int c = 2;

            String result1 = (a == b) ? "a = b" : "a != b";
            String result2 = (c == b) ? "c = b" : "c != b";
             */

        // instanceof 運算符號 : 用來判斷是否同一個特定類別
            /*
            String a = "Hello";
            System.out.println(a instanceof String);
             */
    }
}
