/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Brett
 */
import java.io.*;

public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File instructions = new File("instructions.txt");

        FileReader in;
        BufferedReader readFile;
        String textLine;

        try {
            in = new FileReader(instructions);
            readFile = new BufferedReader(in);
            while ((textLine = readFile.readLine()) != null) {
                System.out.println(textLine);
            }
            readFile.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist or cannot be found");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading file");
            System.err.println("IOException: : " + e.getMessage());
        }

    }

}
