package com.epam.rd.autotasks;

public class DecrementingCarousel {
    static int [] arr ;
    static int capacity;
    int counter = 0;
    boolean alreadyExecuted = false;
    boolean alreadyRun = false;

    public DecrementingCarousel(int capacity) {
        DecrementingCarousel.capacity = capacity;
        arr = new int[capacity];

    }

    public boolean addElement(int element){
        if (alreadyExecuted) return false;
        if (counter < capacity && element > 0) {
            arr[counter] = element;
            counter++;
            return true;
        }
        return false;
    }

    public CarouselRun run(){
        alreadyExecuted = true;
        if (alreadyRun) return null;
        alreadyRun = true;
        return new CarouselRun();

    }


}