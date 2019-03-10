package org.sda.algorithms.examples;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.*;

public class Exceptions {

    public static void main(String[] args) {

        // Klasa JFileChooser pozwala nam wybrać plik w okienku

        // FileSystemView.getFileSystemView().getHomeDirectory() wskazuje na pulpit w systemach windows
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        boolean finished = false;
        do {

            // wywołanie otwarcia okienka
            int returnValue = jfc.showOpenDialog(null);
            // int returnValue = jfc.showSaveDialog(null);

            // returnValue decyzja jaką podjął użytkownika

            if (returnValue == JFileChooser.APPROVE_OPTION) {

                // plik który wybraliśmy
                File selectedFile = jfc.getSelectedFile();
                try {

                    // FileReader i BufferedReader pomagają nam czytać plik linijka po linijce
                    FileReader fileReader = new FileReader(selectedFile);

                    // ten kod się nie wykona po exception
                    BufferedReader reader = new BufferedReader(fileReader);
                    String line;
                    // czytamy plik tak długo aż nie skończą się linie
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                    finished = true;

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    finished = false;
                } catch (IOException e) {
                    e.printStackTrace();
                    finished = true;
                }

            } else {
                finished = true;
            }
        } while (!finished);

    }

}
