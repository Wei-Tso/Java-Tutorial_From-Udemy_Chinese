public class Main {
    public static void main(String[] args) {
        String strVal1 = "Hello";
        String strVal2 = "World";
        System.out.println(strVal1 +" " + strVal2);

        // %s : 格式化為字串
        // 必須使用 printf()
        String x = "最近";
        String y = "我很好";
        System.out.printf("哈囉! %s好嗎? %s \n" , x , y);

        // length()
        String name = "小熊";
        System.out.println(name.length());
    }
}
