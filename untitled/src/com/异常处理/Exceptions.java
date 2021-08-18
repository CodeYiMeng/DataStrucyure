package com.异常处理;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        int[] arr = new int[10];

        int idx;
        Scanner in = new Scanner(System.in);
        idx = in.nextInt();

        // ctrl + alt T 进行异常的捕捉 快捷键的显示 try catch
        try {
            System.out.println(arr[9]);
        } catch (Exception e) {
            e.printStackTrace();
            
        }

    }
}
