package com.OOP;

// 测试程序

public class OOTest05 {
    public static void main(String[] args){

        Customer c = new Customer();
        c = null;

        // 此时出现了空引用访问  "实例" 相关的数据,出现空指针异常（没有对象的野指针）
        // java。lang.NullPointerException
        System.out.println(c.id);

    }
}
