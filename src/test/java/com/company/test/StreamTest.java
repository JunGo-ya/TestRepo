package com.company.test;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by jun.n on 2017/03/26.
 */
public class StreamTest {
    public static void execTest() {

        // ファイルを読み込み一行ずつ出力
        try (Stream<String> st = Files.lines(Paths.get("test.xml"))) {
            st.forEach(str -> System.out.println(str));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        // 空のstream作成
        Stream<String> empStream = Stream.empty();

        // 初期値を指定してstream生成
        Stream<String> preStream = Stream.of("val1", "val2", "val3");

        // stream iterater
        Stream<Integer> iteStream = Stream.iterate(1, i -> i + i).limit(5);
        iteStream.forEach(System.out::println);
    }
}
