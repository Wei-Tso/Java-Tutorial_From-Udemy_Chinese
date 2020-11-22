public class Main {
    public static void main(String[] args) {
        // 資料型態大小 : byte -> short -> char -> int -> long -> float -> double

        // 資料由小轉大
        byte byteVal = 100;
        int intVal = byteVal;
        System.out.println("intVal : " + intVal);

        // 資料由大轉小
        int a = 100;
        byte b = (byte) a;
        System.out.println("b : " + b);

        // 整數轉字串
        int intValue = 100;
        String strVal = Integer.toString(intValue);
        System.out.println("strVal : " + strVal);

        // 字串轉整數
        String strValue = "100";
        int integerVal = Integer.parseInt(strValue);
        System.out.println("integerVal : " + integerVal);
    }
}
