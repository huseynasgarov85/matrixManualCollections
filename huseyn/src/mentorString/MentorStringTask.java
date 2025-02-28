package mentorString;

import java.util.Objects;
import java.util.Stack;

public class MentorStringTask {
    public static String sezarSifreleme(String text, Integer number) {
        String sifreli = "";
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int j = 0; j < text.length(); j++) {
            for (int i = 0; i < arr.length; i++) {
                char letter = text.charAt(j);
                if (letter == arr[i]) {
                    if (i + 1 + number > 26) {
                        int value = i + number - 26;
                        while (value>26){
                            value-=26;
                        }
                        letter = arr[value];
                        sifreli += letter;
                    } else {
                        for (int k = 0; k < arr.length; k++) {
                            if (letter == arr[k]) {
                                letter = arr[k + number];
                                sifreli += letter;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return sifreli;
    }

    public static String removeVowels(String name) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] chars = name.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j]) {
                    chars[i] = ' ';
                }
            }
        }
        String temp = new String(chars);
        String[] arr = temp.split(" ");
        String result = "";
        for (String s : arr) {
            result += s;
        }
        return result;
    }

    public static String removeSait(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        String saitler = "aeiouAEIOU";
        for (char sait : saitler.toCharArray()) {
            text = text.replace(String.valueOf(sait), "");
        }
        return text;
    }

    public static boolean myStack() {
        Stack<String> stack = new Stack<>();
        stack.add("{");
        stack.add("(");
        stack.add("[");
        stack.add("]");
        stack.add(")");
        stack.add("}");
        for (String s : stack) {
            System.out.print(s);
        }
        System.out.println();
        while (true) {
            for (int i = 0; i <= stack.size(); i++) {
                System.out.println(stack.firstElement());
                System.out.println(stack.lastElement());
                if (!Objects.equals(stack.firstElement(), stack.lastElement())) {
                    if (i == stack.size() - 1) {
                        break;
                    }
                    if (stack.size() == 2) {
                        return true;
                    }

                    stack.add(stack.get(++i));
                }
            }
            if (stack.size() == 2) {
                break;
            }
        }
        System.out.println("hello");
        return false;

    }
}
