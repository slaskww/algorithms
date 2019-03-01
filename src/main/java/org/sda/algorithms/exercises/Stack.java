package org.sda.algorithms.exercises;

public class Stack {
    public final int DEFAULT_MAX_SIZE = 10;
    private Object[] stack;
    private int positionOfElement = 0;
    private int maxSize;


    private int maxSize = 10;
    // tablica w której będziemy trzymać obiekty
    private Object[] objectOnStack = new Object[maxSize];
    // rozmiar stosu
    private int size = 0;

    public Stack() {

        maxSize =  DEFAULT_MAX_SIZE;
        stack = new Object[maxSize];
    }

    public Stack(int s) {

        maxSize = s;
        stack = new Object[maxSize];

    }

<<<<<<< HEAD
    // Dodatkowo:
    // Drugi kontruktor który bedzie przyjmowal rozmiar stosu

    public void push(Object o){

        // sprawdzamy czy size przekroczyl maksymalny rozmiar stosu

        /*
        if(size < maxSize) {
            objectOnStack[size] = o;
            size++;
            // skrócona wersja
            // objectOnStack[size++] = o;

        } else {
            System.out.println("Przekroczyłeś rozmiar stosu. Element nie zostanie dodany");
        }

        */

        if(isFull()){
            System.out.println("Przekroczyłeś rozmiar stosu. Element nie zostanie dodany");
        } else {
            objectOnStack[size] = o;
            size++;
        }

        // rozmiar jest zawsze o jeden większy niż ostatni index
        // jeśli wrzuciliśmy coś pod index = 0 to rozmiar wynosi 1
    }

    public Object pop(){

        if(isEmpty()){
            System.out.println("Stos pusty");
            return null;
        } else {
            Object o = objectOnStack[size - 1]; //sciagamy ostatni element, index jest o 1 mniejszy niz rozmiar
            objectOnStack[size - 1] = null;
            size--;
            return o;
        }
    }

    public Object peek(){
        return objectOnStack[size - 1];
    }

    public boolean isFull(){
        return size == maxSize;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
=======

    public void push(Object o){

        if (positionOfElement == maxSize){
            System.out.println("przekroczyłeś dopuszczalną wielkość stosu");
            return;
        }
        stack[positionOfElement]  = o;
        positionOfElement++;

    }

    public Object pop(){
        if (positionOfElement != 0){
            positionOfElement--;
           Object o =  stack[positionOfElement];
            stack[positionOfElement] = null;
            return o;
        }
        System.out.println("brak elementów na stosie");
        return null;

    }

    public Object peek(){

        if (positionOfElement != 0){
            return stack[positionOfElement-1];
        }
        System.out.println("brak elementów na stosie");
        return null;
    }

    public boolean isFull(){

        return (stack.length == maxSize);
    }

    public boolean isEmpty(){
        return  (stack.length == 0);
    }

    public int size(){
        return positionOfElement;
>>>>>>> myBranch
    }

}
