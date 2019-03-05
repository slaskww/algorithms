package org.sda.algorithms.examples;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.*;

public class Exceptions {

    public static void main(String[] args) {

        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        boolean finished = false;
        do {

            int returnValue = jfc.showOpenDialog(null);
            // int returnValue = jfc.showSaveDialog(null);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = jfc.getSelectedFile();

                try {
                    FileReader fileReader = new FileReader(selectedFile);
                    BufferedReader reader = new BufferedReader(fileReader);
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                    finished = true;

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    finished = false;
                } catch (IOException e) {
                    e.printStackTrace();
                    finished = false;
                }

            } else {
                finished = true;
            }
        } while (!finished);

    }

}
