package com.company.test;


import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        System.out.println("StandardCharsets : " + StandardCharsets.UTF_8);
        System.out.println("--------------------------------");
        StringJoinerTest.testExec();
        System.out.println("--------------------------------");
        LambdaTest.testExec();
        System.out.println("--------------------------------");
        StreamTest.execTest();
        System.out.println("--------------------------------");
    }
}
