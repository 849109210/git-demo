package com.bjpowernode;

/**
 * 张杰
 * 2021/7/21
 */
public class Test {
    public static void main(String[] args) {
        int[] arrays = {52,32,22,5,10,35,8,6};
        Bubble(arrays);
        for(int m = 0; m < arrays.length; m++){
            System.out.print(arrays[m] + " ");
        }
        System.out.println("测试");
        System.out.println("测试2");
        System.out.println("测试333");
        System.out.println("测试333333");
        System.out.println("测试4444");
        System.out.println("测试5555");
    }
    public static void Bubble(int[] a){
        for(int i = 1; i < a.length; i++){
            for(int k = 0; k < a.length - i; k++){
                if(a[k] > a[k+1]){
                    int temp = a[k+1];
                    a[k+1] = a[k];
                    a[k] = temp;
                }
            }
        }
    }
}
