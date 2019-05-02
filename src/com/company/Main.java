package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

//        String s1 = "apple apple";
//        String s2 = "banana";

        System.out.println(Arrays.toString(uncommonWords(s1, s2)));
    }

    private static String[] uncommonWords(String s1, String s2) {
        List<String> list = new ArrayList<>();
        addUniqueString(list, s1);
        addUniqueString(list, s2);
        return list.toArray(new String[list.size()]);
    }

    private static void addUniqueString(List<String> list, String inputString) {
        String[] inputArr = inputString.split("\\W+");
        for (String input: inputArr) {
            if (list.contains(input)) {
                list.remove(input);
            } else {
                list.add(input);
            }
        }
    }
}
