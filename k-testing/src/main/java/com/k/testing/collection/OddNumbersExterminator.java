package com.k.testing.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbersExterminator {
    // korzystając z dobrodziejstw Javy 8 mozesz zrobic:
    // public List<Integer> exterminate(ArrayList<Integer> numbers) {
    //    return numbers.stream().filter(nr -> nr % 2 == 0).collect(Collectors.toList());
    // }
    // o tym będzie w module o Streamach
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        if (numbers == null){
            return null;
        }
        // List<Integer> even = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                even.add(num);
            }
        }
        return even;
    }
}
