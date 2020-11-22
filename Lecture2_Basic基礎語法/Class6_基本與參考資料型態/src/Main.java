public class Main {
    public static void main(String[] args) {
        /*
        Java 資料型態，分為兩大類
            1. 基本資料型態 : Primitive type
            2. 參考資料型態 : Reference type
        若都沒有定義任何資料型態，則為 Null type，空型態
         */
        /*
        基本資料型態 : Primitive type
            1. 數字，整數類型 : byte、short、int、long
            2. 數字，浮點數類型 : float、double
            3. 字元類型 : char (Unicode 字元列表)
            4. 布林類型 : boolean
         */
        /*
        印出資料類型大小、最小值、最大值
            資料類型.SIZE : 印出資料類型大小
            資料類型.MIN_VALUE : 印出資料類型最小值
            資料類型.MAX_VALUE : 印出資料類型最大值
         */
        /*
        參考資料型態 : Reference type
            只要不是八種基本資料型態，其他都是參考資料型態
            - 物件(object)
            - 字串(String)
            - 自定義的類別(class)
            - 陣列(Array)
            - 介面(interface)
            - 列舉(enum)
         */

        byte byteVal;
        short shortVal;
        int intVal;
        long longVal;

        System.out.println("byte min : " + Byte.MIN_VALUE);
        System.out.println("byte max : " + Byte.MAX_VALUE);
        System.out.println("short min : " + Short.MIN_VALUE);
        System.out.println("short max : " + Short.MAX_VALUE);
        System.out.println("int min : " + Integer.MIN_VALUE);
        System.out.println("int max : " + Integer.MAX_VALUE);
        System.out.println("long min : " + Long.MIN_VALUE);
        System.out.println("long max : " + Long.MAX_VALUE);

        char charVal1 = 'a';
        char charVal2 = '\u0041';
        System.out.println("char 1 : " + charVal1);
        System.out.println("char 2 : " + charVal2);
    }
}
