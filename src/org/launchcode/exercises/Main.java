package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
//        System.out.println(Divide(1,0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
//        for (String file : studentFiles.values()) {
//            System.out.println(file + ": " + CheckFileExtension(file));
//        }
    }

    public static double Divide(double x, double y) {
        if (y == 0) {
            try {
                throw new ArithmeticException("You cannot divide by 0!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        return x/y;
    }

    public static int CheckFileExtension(String fileName) {
        int index = fileName.length();
        if (fileName == null || fileName.equals("")) {
            try {
                throw new FileException("This is not a file!");
            } catch (FileException e) {
                e.printStackTrace();
            }
        };
        if (index >5 || fileName.substring(index-5,index).equals(".java")){
            return 1;
        } else {
            return -1;
        }
    }

}
