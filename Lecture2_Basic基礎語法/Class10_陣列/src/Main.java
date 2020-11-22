import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        陣列定義方式 :
            資料型態[] 陣列名稱 = new 資料型態[陣列大小];
         */
        int[] intArray = new int[3];

        // 陣列初始化 :
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;

        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);

        // 陣列定義資料值 :
        int[] intArray2 = {100 , 200 , 300};
        System.out.println(intArray2[0]);
        System.out.println(intArray2[1]);
        System.out.println(intArray2[2]);

        // 事後可以更改陣列中存放的資料
        intArray2[0] = 1000;
        intArray2[1] = 2000;
        intArray2[2] = 3000;
        System.out.println(intArray2[0]);
        System.out.println(intArray2[1]);
        System.out.println(intArray2[2]);

        // 獲取陣列的長度 : .length
        System.out.println(intArray.length);

        // 獲取陣列的所有元素 : (1) Arrays.toString(陣列名稱) (2) for loop
        System.out.println(Arrays.toString(intArray));

        // 陣列排序 : Arrays.sort(陣列名稱)
        int[] intArr = {1000 , 1 , 100};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
    }
}
