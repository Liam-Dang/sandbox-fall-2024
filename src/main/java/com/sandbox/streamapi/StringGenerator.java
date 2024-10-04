package com.sandbox.streamapi;

import java.util.Random;
import java.util.function.Supplier;

public class StringGenerator implements Supplier<String> {

    Random random = new Random();
    char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    @Override
    public String get() {
        return "" + chars[random.nextInt(chars.length)];
    }
}
