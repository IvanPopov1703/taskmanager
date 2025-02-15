package ru.taskmanager.utils;

public class StringUtils {

    private StringUtils(){}

    public static boolean isNullOrBlank(String str) {
        return str == null || str.isBlank();
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    public static int compareTo(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException();
        }
        return num1.compareTo(num2);
    }

    public static int countVowels(String str) {
        if (str == null) return 0;
        return (int) str.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}
