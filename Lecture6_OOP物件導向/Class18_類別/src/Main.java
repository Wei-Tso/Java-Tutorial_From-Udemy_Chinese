public class Main {
    public static void main(String[] args) {
        // 物件導向(Object-oriented programming , OOP)
        /*
        將抽象的程式擬物化，將程式比喻成真實世界中的物件。
        而物件(Object) 是從 類別(Class) 實體化而來的。
         */

        // 建立物件
        // 類別名稱  物件名稱 = new 類別建構子();

        Role role = new Role();

        role.nickName = "nickName";
        role.gender = "gender";
        role.skill = "skill";

        System.out.println(role.nickName);
        System.out.println(role.gender);
        System.out.println(role.nickName);

        role.walk();
        role.run();
        role.hit();
    }
}
