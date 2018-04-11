/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberpyramid;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author s653957
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        String[] values;
        FileReader file = new FileReader("triangle.txt");
        Scanner numbers = new Scanner(file);
        ArrayList<String> rowsList = new ArrayList<>();
        while (numbers.hasNextLine()) {
            rowsList.add(numbers.nextLine());
        }

        String[][] pyramidString = new String[rowsList.size()][rowsList.size()];
        int[][] pyramid = new int[rowsList.size()][rowsList.size()];
        for (int i = 0; i < pyramidString.length; i++) {
            values = rowsList.get(i).split(" ");
            for (int j = 0; j < values.length; j++) {
                pyramidString[i][j] = values[j];
            }
        }

        for (int i = 0; i < pyramid.length; i++) {
            for (int j = 0; j < pyramid[i].length; j++) {
                if (pyramidString[i][j] != null) {
                    pyramid[i][j] = Integer.parseInt(pyramidString[i][j]);
                }
            }
        }

        for (int i = pyramid.length - 2; i >= 0; i--) {
            for (int j = 0; j < pyramid[i].length; j++) {
                if (pyramid[i][j] != 0) {
                    if (pyramid[i + 1][j] > pyramid[i + 1][j + 1]) {
                        pyramid[i][j] += pyramid[i + 1][j];
                    } else {
                        pyramid[i][j] += pyramid[i + 1][j + 1];
                    }
                }
            }
        }
        System.out.println(pyramid[0][0]);
    }

    public static void printArray(int[][] b) {

        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < b[i].length; j++) {
                System.out.println("pyramids " + b[i][j]);
                //  pyramidString[i] = rowsList.get(i).split(" ");
            }
            System.out.println("");
        }

    }

    public static void printArray(String[][] b) {

        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < b[i].length; j++) {
                System.out.println("pyramids " + b[i][j]);
                //  pyramidString[i] = rowsList.get(i).split(" ");
            }
            System.out.println("");
        }

    }

}
