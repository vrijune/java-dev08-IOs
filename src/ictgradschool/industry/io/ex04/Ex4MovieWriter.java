package ictgradschool.industry.io.ex04;

import ictgradschool.Keyboard;
import ictgradschool.industry.io.ex03.Movie;
import ictgradschool.industry.io.ex03.MovieWriter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by anhyd on 20/03/2017.
 */
public class Ex4MovieWriter extends MovieWriter {

     System.out.print("Enter a file name: ");
    String films = Keyboard.readInput();


    @Override
    protected Movie[] saveMovies(String fileName, Movie[] films) {

        // TODO Implement this with a PrintWriter
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuffer csvHeader = new StringBuffer("");
        StringBuffer csvData = new StringBuffer("");
        csvHeader.append("Name,Age,Designation\n");

        // write header
        writer.write(csvHeader.toString());

        // write data
        csvData.append("name");
        csvData.append(',');
        csvData.append("year");
        csvData.append(',');
        csvData.append("lengthInMinutes");
        csvData.append(',');
        csvData.append("director");
        csvData.append(',');
        writer.write(csvData.toString());
        writer.close();


        return films;
    }


    public static void main(String[] args) {
        new Ex4MovieWriter().start();
    }

}
