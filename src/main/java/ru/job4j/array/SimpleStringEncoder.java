package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            if (i == input.length() - 1 || input.charAt(i) != input.charAt(i + 1)) {
                result += String.valueOf(input.charAt(i)) + (counter > 1 ? counter : "");
                counter = 1;
            } else {
                counter++;
            }
        }
        return result;
    }
}