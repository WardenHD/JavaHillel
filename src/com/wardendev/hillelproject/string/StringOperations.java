package com.wardendev.hillelproject.string;

public class StringOperations {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int countVowels(String str) {
        int count = 0;
        for(char c : str.toCharArray()) 
            if("aeiou".contains(String.valueOf(c).toLowerCase())) count++;
        
        return count;
    }

    public static boolean isPalindrome(String str) {
        return str.toLowerCase() == reverse(str.toLowerCase());
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) if(!sb.toString().contains(String.valueOf(c))) sb.append(c);

        return sb.toString();
    }

    public static String[] toWords(String str) {
        return str.split(" ");
    }
}