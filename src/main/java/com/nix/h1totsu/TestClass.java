package com.nix.h1totsu;

/**
 * Created by h1tot on 22.06.2016.
 */
public class TestClass {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "dbc";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            boolean isExists = false;
            for (int j = 0; j < s2.length(); j++) {
                if (s2.charAt(j) == s1.charAt(i)) {
                    isExists = true;
                }
            }
            if (!isExists) {
                sb.append(s1.charAt(i));
            }
        }
    }
}
