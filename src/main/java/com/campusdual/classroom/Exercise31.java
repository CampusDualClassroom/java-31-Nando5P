package com.campusdual.classroom;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;

public class Exercise31 {

    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/lorem.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
