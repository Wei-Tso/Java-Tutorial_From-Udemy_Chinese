public interface B extends A{
    // 介面可以繼承其他介面
    // 繼承其他介面後，不需要實作其他介面的方法
    // 如果使用 B 介面，則必須實作出 A 和 B 的方法

    void getBData();
}
