package org.example;
import java.util.HashMap;

class Main {
    public boolean isIsomorphic(String s, String t) {
        int count1 = s.length();
        int count2 = t.length();
        if (count1 == count2) {
            HashMap<Character, Character> dict1 = new HashMap<>();
            for (int i = 0; i < count1; i++) {
                if (dict1.containsKey(s.charAt(i))) {
                    char value = dict1.get(s.charAt(i));
                    if (t.charAt(i) != value) {
                        return false;
                    }
                } else if (dict1.containsValue(t.charAt(i))) {
                        return false;
                } else {
                    dict1.put(s.charAt(i), t.charAt(i));
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        new Main().isIsomorphic("egg","add");
    }
}

