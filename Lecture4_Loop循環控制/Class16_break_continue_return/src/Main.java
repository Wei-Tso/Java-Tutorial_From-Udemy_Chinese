public class Main {
    public static void main(String[] args) {
        // break
        // 當程式執行到 break，將會終止跳出整個循環區塊
        int[] intArr = {1 , 2 , 3 , 4 , 5};
        for (int i : intArr) {
            if(i == 3) {
                break;
            }
            System.out.println(i);
        }

        // continue
        // 當程式執行到 continue，則會強迫直接跳到下一次循環，原本 continue 下方還有程式則會全部略過
        for (int i : intArr) {
            if(i == 3) {
                continue;
            }
            System.out.println(i);
        }

        // return
        // 當程式執行到 return，該區塊下方的程式不會被執行。return 通常用在呼叫方法，當特定條件成立，返回原呼叫點。
        int[] intArr2 = null;

        printData(intArr);
        printData(intArr2);
    }

    private static void printData(int[] intArr) {
        if(intArr == null) {
            System.out.println("資料異常");
            return;
        }
        for(int i : intArr) {
            System.out.println(i);
        }
    }
}
