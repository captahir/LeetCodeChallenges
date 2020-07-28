package singleNums;

//Verilmiş array daxilində yalnız bir dəfə işlədilmiş rəqəmləri çap et

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        int[] ints = {5, 4, 9, 2, 3, 3, 7, 5, 1, 9, 5, 4, 4};

        System.out.println(Arrays.toString(filter(ints)));
    }

   public static Object[] filter(int[] array) {
        return Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() == 1)
                .toArray();
    }
}
