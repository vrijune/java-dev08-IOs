package ictgradschool.industry.io.ex01;

import java.io.*;

public class ExerciseOne {

    public void start() {

        printNumEsWithFileReader();

        printNumEsWithBufferedReader();

    }

    private void printNumEsWithFileReader() {

        int numE = 0;
        int total = 0;

        // TODO Read input2.txt and print the total number of characters, and the number of e and E characters.
        // TODO Use a FileReader.
        int num = 0;
        char c = (char) num;
        try (FileReader fR = new FileReader("input2.txt")) {
            num = fR.read();
            while (num != -1) {
                total++;
                if (num == 'E' || num == 'e') {
                    numE++;
                }
              num = fR.read();

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not Found" + e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Number of e/E's: " + numE + " out of " + total);
    }

    private void printNumEsWithBufferedReader() {

        int numE = 0;
        int total = 0;
        int num = 0;
        char c = (char) num;
        // TODO Read input2.txt and print the total number of characters, and the number of e and E characters.
        // TODO Use a BufferedReader.

        File myFile = new File("input2.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(myFile))) {
            String line = null;

            while ((line = reader.readLine()) != null) {
                total += line.length();
                for (int i = 0; i < line.length(); i++)
                {
                    if (line.charAt(i) == 'E' || line.charAt(i) == 'e')
                        numE++;
                }

            }

            }catch(IOException e){
                System.out.println("Error" + e.getMessage());
            }


            System.out.println("Number of e/E's: " + numE + " out of " + total);
        }

        public static void main (String[]args){
            new ExerciseOne().start();
        }

    }
