package ictgradschool.industry.io.ex04;

import ictgradschool.Keyboard;
import ictgradschool.industry.io.ex03.Movie;
import ictgradschool.industry.io.ex03.MovieReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by anhyd on 20/03/2017.
 */
public class Ex4MovieReader extends MovieReader {

    @Override
    protected Movie[] loadMovies(String fileName) {

        // TODO Implement this with a Scanner
        System.out.print("Enter a file name: ");
        String fileName = Keyboard.readInput();

        File myfile = new File("films");
        try(Scanner scanner = new Scanner(myfile)){
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return null;
    }

    public static void main(String[] args) {
        new Ex4MovieReader().start();
    }
}
