package com.chapter.Streams;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<String> words = Stream.of("fffffffffffff", "xxxxxxxxxxxx", "ccccccccccccccc",
                "xxxxxxxxxxxv", "xxxxxxxxxxxb", "xxxxxxxxxxxn");

        long count = words.filter(s -> s.length() > 15).peek(s -> System.out.print(" " + s + " ")).limit(5).count();

    }
}