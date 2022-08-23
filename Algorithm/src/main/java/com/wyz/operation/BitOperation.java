package com.wyz.operation;

/**
 * @author
 * @date 2022/8/22
 * @description 冒泡排序
 */
public class BitOperation {

    public static void main(String[] args) {
        int number = -11;

        // 输出Java中的二进制表示(补码),11111111111111111111111111110101
        System.out.println("原值，二进制：" + Integer.toBinaryString(number));

        // 取反，0变为1，1变为0
        System.out.println("取反，十进制" + ~number);
        System.out.println("取反，二进制：" + Integer.toBinaryString(~number));

        // 按位异或，相同为0，不同为1
        System.out.println("按位异或" + (number ^ number));

        // 按位与，同为1时，结果为1，否则为0
        System.out.println("按位与：" + (number & 1));

        // 按位或，同为0时，结果为0，否则为1
        System.out.println("按位或：" + (number | ~number));

        // 左移，数值位向左移动，高位丢弃，低位补0
        System.out.println("左移，十进制：" + (number << 1));
        System.out.println("左移，二进制：" + Integer.toBinaryString(number << 1));

        // 右移，数值位向右移动，低位丢弃，高位补符号位
        System.out.println("右移，十进制：" + (number >> 2));
        System.out.println("右移，二进制：" + Integer.toBinaryString(number >> 2));

        // 无符号右移，数值位向右移动，低位丢弃，高位补0
        System.out.println("无符号右移，十进制：" + (number >>> 1));
        System.out.println("无符号右移，二进制：" + Integer.toBinaryString(number >>> 1));
    }
}
