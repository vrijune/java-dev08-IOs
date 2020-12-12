package ictgradschool.industry.io.ex02;

import ictgradschool.Keyboard;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyScanner {

    public void start() {

        // TODO Prompt the user for a file name, then read and print out all the text in that file.
        // TODO Use a Scanner.

        System.out.println("Enter a file name:");
        String filename = Keyboard.readInput();


        File myFile = new File("mytextfile.txt");
        try (Scanner scanner = new Scanner(myFile)) {

            while (scanner.hasNextLine()) {

                System.out.println(scanner.nextLine());
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
        public static void main (String[]args){
            new MyScanner().start();
        }
    }

