package com.kodilla.stream.beautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args){

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String firstTry = "AAAA";
        String secondTry = "aaaa";
        String thirdTry = "AbbA";
        String fourthTry = "AAAAA";
        poemBeautifier.beautify(firstTry, (string) -> "***"+firstTry+"***");
        poemBeautifier.beautify(firstTry, (string) -> "***"+secondTry.toUpperCase()+"***");
        poemBeautifier.beautify(firstTry, (string) -> "***"+thirdTry.replace("b", "A")+"***");
        poemBeautifier.beautify(firstTry, (string) -> "***"+fourthTry.substring(1,5)+"***");
    }
}