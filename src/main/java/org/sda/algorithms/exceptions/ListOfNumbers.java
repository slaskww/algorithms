package org.sda.algorithms.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers() {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    public void writeList() {
        // The FileWriter constructor throws IOException, which must be caught.
        PrintWriter out = null;

        try {
            Handler handler = new FileHandler("OutFile.log");
            Logger.getLogger("").addHandler(handler);
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter(""));//OutFile.txt"));
            for (int i = 0; i < SIZE+20; i++) {
                // The get(int) method throws IndexOutOfBoundsException, which must be caught.
                out.println("Value at: " + i + " = " + list.get(i));

            }

        } catch (IOException e) {
            System.err.println("Caught  IOException " + e.getMessage());
           // e.printStackTrace();
            e.getStackTrace();
            Logger logger = Logger.getLogger("package.pl");
            StackTraceElement elements[] = e.getStackTrace();
            for (int i = 0, n = elements.length; i < n; i++) {
                logger.log(Level.WARNING, elements[i].getMethodName());
            }


        } catch (IndexOutOfBoundsException e) {
            System.err.printf("getLocalizedMessage %20s", e.getLocalizedMessage());
            System.err.println("getMessage " + e.getMessage());
            System.err.println("toString " + e.toString());
            System.err.println("fillInStackTrace " + e.fillInStackTrace());
            System.err.println("getCause " + e.getCause());
            System.err.println("getStackTrace " + e.getStackTrace());
            System.err.println("getSuppressed " + e.getSuppressed());
            System.err.println("hashCode " + e.hashCode());
            System.err.println("getClass " + e.getClass());
            e.printStackTrace();

        } finally {
            if (out != null) {
                out.close();
                System.out.println("Closing PrintWriter");
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    public static void main(String[] args) {

        ListOfNumbers list = new ListOfNumbers();
        list.writeList();
    }

}