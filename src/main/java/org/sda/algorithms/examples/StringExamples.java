package org.sda.algorithms.examples;

public class StringExamples {

    public static void main(String[] args) {
        String text = "Hello SDA";
        String nowy = text + "!!!";

        text = "Hello World";

        String temp = "Hello ";
        for(int i = 0; i < 5; i++){
            temp = temp + "a";
        }
        System.out.println(temp);

        StringBuilder stringBuilder = new StringBuilder("Hello ");
        for(int i = 0; i< 5; i++){
            stringBuilder.append("a");
        }
        System.out.println(stringBuilder.toString());
    }
}
