package com.lazy.study.string;

/**
 * Created by zhiqiangjiang on 14-11-20.
 */
public class StringStudy {

    public static void main(String[] args) {
        String s = "hello world";
        String s2 = "hello world";
        //为啥string的比较可以用 == 呢？ 一般不是用
       // String的一个很大的特点，就是它是一个“不可变的字符串”，
        System.out.println(s.equals(s2));//true
        System.out.println(s == s2);//true

    }

}
