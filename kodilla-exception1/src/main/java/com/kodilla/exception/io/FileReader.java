package com.kodilla.exception.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());

        System.out.println(file.getPath());
        try (Stream<String> filelines = Files.lines(Paths.get(file.getPath()))){

            filelines.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Błąd" + e);
        } finally {
            System.out.println("Finally!");
        }
    }
}
