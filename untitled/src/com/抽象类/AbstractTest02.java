package com.抽象类;

/*
    1. 抽象类中不一定有抽象方法，抽象方法必须出现在抽象类中；

    2. 非抽象的类继承抽象类，必须将抽象类中的方法进行实现
        在这里 可以叫做 方法的覆盖，重写，也可以叫做实现，因为相关的方法被实现了；
 */

import java.beans.Transient;

public class AbstractTest02 {
    public static void main(String[] args) {

        // 此为面向抽象的编程；
        // 有效的降低了耦合度；
        // 使得程序的健壮性得到了提高；
        // 这种原则符合 OCP 原则
        // 向上转型
        // 鸟是一个动物

        /*
                分析：
                    在编译阶段，move 的方法属于对象 Animal ，在运行的阶段，属于 Bird；
                    不同的阶段拥有不同的状态；
         */
        Animal bird = new Bird();
        bird.move();

    }
}


// 抽象类
abstract class Animal {
    // 定义抽象方法
    public abstract void move();

}


/*
    分析;
        Animal 是一个抽象类，是父类；
        Animal 这个抽象类中有一个抽象方法 move ；
        Bird 是子类，并且是非抽象的；
        Bird 继承之后，会将父类中的抽象方法进行继承，而拥有抽象方法的抽象类一定得是抽象类；

 */

// 在前面加上 abstract 就可以不用实现方法，编译也不会报错，此时就不用进行重写，覆盖
class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Bird is moving！ 这是一个抽象方法！");
    }
    // 需要将继承过来的方法进行重写的操作，覆盖 / 重写 ，也可以叫做 “ 实现 ”；
    // 把抽象的方法进行实现
}