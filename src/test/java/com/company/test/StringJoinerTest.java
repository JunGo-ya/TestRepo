package com.company.test;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by jun.n on 2017/03/26.
 */
public class StringJoinerTest {

    public static void testExec() {
        // 文字列の配列
        List<String> lists = Arrays.asList("a", "b", "c", "d", "e", "f");

        StringJoiner sj = new StringJoiner(" ");
        lists.forEach(str -> sj.add(str));
        System.out.println(sj.toString());

        String separater = "_";
        System.out.println(String.join(separater, lists));

    }
}
