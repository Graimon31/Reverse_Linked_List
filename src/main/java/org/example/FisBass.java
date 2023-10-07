package org.example;

import java.util.ArrayList;
import java.util.List;

class FisBass {
    public List<String> fizzBuzz(int n) {
        List<String> array = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            array.add(Integer.toString(i));
        }
        for (int i = 0; i < array.size(); i++){
            int j = Integer.parseInt(array.get(i));
            if (j % 3 == 0 && j % 5 == 0){
                array.set(i, "FizzBuzz");
            }
            else if (j % 5 == 0){
                array.set(i, "Buzz");
            }
            else if (j % 3 == 0) {
                array.set(i, "Fizz");
            }
        }
        return array;
    }
    public static void main(String[] args) {
        var array = new FisBass().fizzBuzz (15);
        System.out.println(array);
    }
}

