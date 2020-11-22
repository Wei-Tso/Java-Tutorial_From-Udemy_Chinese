public class Role {
    String nickName;
    String gender;
    String skill;

    // 構造方法
    /*
    當物件被實體化時，用來初始化物件的方法。
    構造方法會和類別名稱完全相同，構造方法和一般方法一樣可無任何參數，也可帶參數。
    構造方法沒有返回值。
     */
    Role() {

    }

    // 方法
    void walk() {
        System.out.println("walk...");
    }

    void run() {
        System.out.println("run...");
    }

    void hit() {
        System.out.println("hit...");
    }
}
