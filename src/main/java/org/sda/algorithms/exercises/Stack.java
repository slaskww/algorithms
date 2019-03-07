package org.sda.algorithms.exercises;

public class Stack {
    public final int DEFAULT_MAX_SIZE = 10;
    private Object[] stack;
    private int positionOfElement = 0;
    private int maxSize;


    public Stack() {

        maxSize =  DEFAULT_MAX_SIZE;
        stack = new Object[maxSize];
    }

    public Stack(int s) {

        maxSize = s;
        stack = new Object[maxSize];

    }


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
    }

}
