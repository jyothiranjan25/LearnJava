package J3Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java24RegularExpressions {
    // Regular expressions are used to define a search pattern
    // Regular expressions are used to perform pattern-matching and "search-and-replace" functions on text
    // Regular expressions are written in a formal language that can be interpreted by a regular expression processor
    // A regular expression is a sequence of characters that forms a search pattern
    // When you search for data in a text, you can use this search pattern to describe what you are searching for
    // A regular expression can be a single character, or a more complicated pattern
    // Regular expressions can be used to perform all types of text search and text replace operations
    // Regular expressions are used in search engines, search and replace dialogs of word processors and text editors, in text processing utilities such as sed and AWK and in lexical analysis
    // Regular expressions are often used in input validation, parsing, and data extraction
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("expressions", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Welcome to regular expressions");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        // Regular Expression Patterns
        // [abc]: a, b, or c (simple class)
        // [^abc]: Any character except a, b, or c (negation)
        // [a-z]: Any character between a and z
        // [A-Z]: Any character between A and Z
        // [a-z A-Z]: Any character between a and z or A and Z
        // [0-9]: Any digit between 0 and 9
        // [a-z 0-9]: Any character between a and z or digit between 0 and 9
        // .: Any character except newline
        // \d: Any digit, short for [0-9]
        // \D: Any non-digit, short for [^0-9]
        // \s: Any whitespace character, short for [\t\n\x0B\f\r]
        // \S: Any non-whitespace character, short for [^\s]
        // \w: Any word character, short for [a-zA-Z_0-9]
        // \W: Any non-word character, short for [^\w]
        // \b: A word boundary
        // \B: A non-word boundary
        // ^: Start of a string

        System.out.println(Pattern.matches(".s", "as")); // true
        System.out.println(Pattern.matches(".s", "mk")); // false
        System.out.println(Pattern.matches(".s", "mst")); // false
        System.out.println(Pattern.matches("[abcd]", "a")); // true
        System.out.println(Pattern.matches("[abcd]", "e")); // false
        System.out.println(Pattern.matches("[a-z]", "a")); // true
        System.out.println(Pattern.matches("[a-z]", "A")); // false
        System.out.println(Pattern.matches("[a-zA-Z]", "a")); // true
        System.out.println(Pattern.matches("[a-zA-Z]", "A")); // true
        System.out.println(Pattern.matches("[a-zA-Z]", "1")); // false
        System.out.println(Pattern.matches("[a-zA-Z0-9]", "1")); // true
        System.out.println(Pattern.matches("[a-zA-Z0-9]", "A")); // true
        System.out.println(Pattern.matches("[a-zA-Z0-9]", "a")); // true
        System.out.println(Pattern.matches("[a-zA-Z0-9]", "!")); // false
        System.out.println(Pattern.matches("", "!")); // true
    }


}
