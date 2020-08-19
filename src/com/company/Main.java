package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("workingDirectory.txt");
        printFile(path);
        System.out.println("==========================================");
        Path paths = FileSystems.getDefault().getPath("File","subDirectory.txt");
        printFile(paths);
        System.out.println("===========================================");
        paths = Paths.get("b:\\JAVA\\outThere.txt");
        printFile(paths);
    }

    private static void printFile(Path path){
        try(BufferedReader bufferedReader = Files.newBufferedReader(path)){
            String lines;
            while ((lines = bufferedReader.readLine()) !=null){
                System.out.println(lines);
            }
        }catch ( IOException e ){
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
