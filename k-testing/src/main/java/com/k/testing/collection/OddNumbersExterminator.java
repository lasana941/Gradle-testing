package com.k.testing.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        if (numbers == null){
            return null;
        }
        ArrayList<Integer> even = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                even.add(num);
            }
        }
        return even;
    }
}
