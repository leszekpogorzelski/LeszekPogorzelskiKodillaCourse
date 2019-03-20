package com.kodilla.stream.beautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

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

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}