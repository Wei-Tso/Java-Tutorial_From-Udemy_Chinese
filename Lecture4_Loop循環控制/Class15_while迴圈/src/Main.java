import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 語法 :
        /*
        while(條件式){
            程式碼執行區塊
        }
         */
        int intVal = 0;
        while (intVal <= 10) {
            System.out.println("value = " + intVal);
            intVal++;
        }

        // do...while 迴圈
        /*
        第一次就會執行{}內程式區塊，不管 while 中的條件式是否成立。
        第二次之後，才開始由 while 中的條件式來決定，是否執行{}內的程式區塊。
         */
        // 語法 :
        /*
        do{
            程式執行區塊
        }while(條件式);
         */
        Scanner sc = new Scanner(System.in);

        String input;
        do {
            System.out.println("是否離開系統 : ");
            input = sc.next();
        }while(!input.equals("y"));

        System.out.println("已經離開系統");
    }
}
