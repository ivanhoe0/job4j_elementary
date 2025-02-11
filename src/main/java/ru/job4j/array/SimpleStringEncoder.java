package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else if (counter != 1 && symbol != input.charAt(i)) {
                result = result + symbol + counter;
                symbol = input.charAt(i);
                counter = 1;
            } else {
                result = result + symbol;
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        return counter == 1 ? result + symbol : result + symbol + counter;
    }
}
