package com.jordan.test.hashmap;

/**
 * @autheor masheng
 * @description 关于Hash方法的测试
 * @date 2020/4/24
 */
public class HashTest {
    public static void main(String[] args) {
        Object o = new Object();
        int hashCode = o.hashCode();
        //312714112
        //0001 0010 1010 0011 1010 0011 1000 0000
        //(h = key.hashCode()) ^ (h >>> 16)
        //无符号右移16位，相当于只保留高16位
        //0000 0000 0000 0000 0001 0010 1010 0011
        //异或得到
        //0001 0010 1010 0011 1011 0011 1010 0011
        //相当于保留了高16位的特征，从而降低hash碰撞的概率
        System.out.println(hashCode);
        System.out.println(Integer.toBinaryString(hashCode));
    }
}