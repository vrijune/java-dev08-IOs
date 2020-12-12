package ictgradschool.industry.io.ex02;

import ictgradschool.Keyboard;

import java.io.*;

public class MyReader {

    public void start() {

        // TODO Prompt the user for a file name, then read and print out all the text in that file.
        // TODO Use a BufferedReader.
        System.out.print("Enter a file name: ");
        String fileName = Keyboard.readInput();
        File myFile = new File(fileName);

        try (BufferedReader reader = new BufferedReader(new FileReader(myFile))) {
            String line = null;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new MyReader().start();
    }
}
