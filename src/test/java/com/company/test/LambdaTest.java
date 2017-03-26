package com.company.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jun.n on 2017/03/26.
 */
public class LambdaTest {

    public static void testExec() {

        List<String> list = Arrays.asList("1", "2", "3", "4", "5");

        list.forEach(str -> System.out.println(str));

        Map<Integer, String> tmap = new HashMap<>();
        tmap.put(1, "one");
        tmap.put(2, "two");
        tmap.put(3, "three");
        tmap.put(4, "four");

        tmap.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}
