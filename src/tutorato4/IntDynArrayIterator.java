package tutorato4;

import tutorato2.IntDynamicArray;

public class Iterator {
    int i;
    IntDynamicArray arr;
    Iterator(int i, IntDynamicArray arr){
        this.i = i;
        this.arr = arr;
    }
    boolean hasNext(){
        if(i<arr.getLength())
            return true;
        else
            return false;
    }
    int next(){
        int t = arr.getElem(i);
        i++;
        return t;
    }
    public static void printArray(IntDynamicArray arr){
        for(int i=0; i < arr.getLength(); i++){
            System.out.print(arr.getElem(i)+" ");
        }
        System.out.println();
    }
    public static void i_printArray(IntDynamicArray arr){
        // è + complicat di prima, però ci trna utile per esempio nel ciclo while
        /*for(Iterator it = new Iterator(0, arr); it.hasNext(); it.next()){
            System.out.print(arr.getElem(it.i)+" ");
        }
        System.out.println();
         */
        // modifico next ulteriormente ritonando il valore dell'elem
        /*
        Iterator it = new Iterator(0, arr);
        while(it.hasNext()){
            System.out.print(arr.getElem(it.i)+" ");
        }
        System.out.println();
         */
        Iterator it = new Iterator(0, arr);
        while(it.hasNext()){
            int t = it.next();
            System.out.print(t+" ");
        }
    }
}
