package com.static使用;

/*
    定义中国人类
 */

/*
     什么时候需要创建静态的变量？
        当创建的对象当中都存在一个相同的属性的时候，使用静态变量可以进行内存空间的节省
 */

public class Chinese {
    // 在变量的前面没有任何的 static 进行修饰 这种变量叫做实例变量
    String id;

    String name;
    // 国籍的变量不会随着实例化的对象的改变从而进行改变
    // 实例变量所有的对象都有一个
    // 100 个对象 100 个实例变量
    // 设计方式的缺点？
    // 实例变量存储在堆中

    // 当所有的对象都有一个自己的实例变量的时候，并且这个变量保存的值都是一样的，这样子会造成内存的浪费，使用实例变量可以进行减少内存的消耗
    // 类是一个模板，将变量定义成为静态之后，将会使得所有的变量都有这个属性
    // 静态的东西可以通过类进行提取相关的变量
    // 所有的中国人的国籍都是中国，在这里声明实例变量是不合适的造成内存的浪费，没必要使得每一个对象都保存一个变量，声明为静态变量，内存空间就会得到节省
    // 类级别的特征
    // 静态变量不需要进行创建对象，在类加载的时候，内存已经创立了
    // 以后创建的对象进行这个变量的访问的时候，使用类进行访问即可
    // 类进行加载的时候，这个变量会进行创建内存空间
    // 对象的集体创建的时候会节省空间
    static String country;


    public static void main(String[] args) {

    }


    // 定义两个构造方法
    public Chinese() {
        this.id = null;
        this.name = null;
        this.country = null;
    }

    public Chinese(String id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }
}
