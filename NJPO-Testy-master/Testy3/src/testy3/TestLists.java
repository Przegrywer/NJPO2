package testy3;

import java.util.*;


public class TestLists {
    ArrayList<Integer> list = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    long time1, time2, time3, wynik;
    public TestLists(){
        for(int i = 0; i < 1500000 ; i++){
            list.add(i);
            linkedList.add(i);
        }   
    }

    public String compareTimes(long op1time, long op2time){
        if((op1time - op2time) > 1200)
            return "ArrayLista jest szybsza o: " + ((op1time - op2time)) + " nanosekund";
        else if((op1time - op2time) < -1200)
            return "LinkedLista jest szybsza o: " + ((op2time - op1time)) + " nanosekund";
        else
            return "Obie operacje wykonały się z taką samą prędkością";
    }

    public void addOnFirstPos() {
        time1 = System.nanoTime();
       list.add(0, 123);
       time2 = System.nanoTime() - time1;
       time1 = System.nanoTime();
       linkedList.add(0, 123);
       time3 = System.nanoTime() - time1;
       System.out.print("Dla dodawania elementu na początek listy: ");
       System.out.println(compareTimes(time2, time3));
    }

    public void addOnMiddlePos() {
        time1 = System.nanoTime();
       list.add((list.size()/2), 200);
       time2 = System.nanoTime() - time1;
       time1 = System.nanoTime();
       linkedList.add((linkedList.size()/2), 200);
       time3 = System.nanoTime() - time1;
       System.out.print("Dla dodawania elementu na środek listy: ");
       System.out.println(compareTimes(time2, time3));
    }

    public void addOnLastPos() {
        time1 = System.nanoTime();
       list.add(300);
       time2 = System.nanoTime() - time1;
       time1 = System.nanoTime();
       linkedList.add(300);
       time3 = System.nanoTime() - time1;
       System.out.print("Dla dodawania elementu na koniec listy: ");
       System.out.println(compareTimes(time2, time3));
    }

    public void removeOnFirstPos() {
       time1 = System.nanoTime();
       list.remove(0);
       time2 = System.nanoTime() - time1;
       time1 = System.nanoTime();
       linkedList.remove(0);
       time3 = System.nanoTime() - time1;
       System.out.print("Dla usuwania elementu z początku listy: ");
       System.out.println(compareTimes(time2, time3));
    }

    public void removeOnMiddlePos() {
       time1 = System.nanoTime();
       list.remove((Math.round(list.size()/2)));
       time2 = System.nanoTime() - time1;
       time1 = System.nanoTime();
       linkedList.remove(Math.round((linkedList.size()/2)));
       time3 = System.nanoTime() - time1;
       System.out.print("Dla usuwania elementu z środka listy: ");
       System.out.println(compareTimes(time2, time3));
    }

    public void removeOnLastPos() {
       time1 = System.nanoTime();
       list.remove(list.size() - 1);
       time2 = System.nanoTime() - time1;
       time1 = System.nanoTime();
       linkedList.remove(linkedList.size() - 1);
       time3 = System.nanoTime() - time1;
       System.out.print("Dla usuwania elementu z końca listy: ");
       System.out.println(compareTimes(time2, time3));
    }

    public int[] getFirstPos() {
       int[] results = new int[2];
       time1 = System.nanoTime();
       results[0] = list.get(0);
       time2 = System.nanoTime() - time1;
       time1 = System.nanoTime();
       results[1] = linkedList.get(0);
       time3 = System.nanoTime() - time1;
       System.out.print("Dla pobierania elementu z początku listy: ");
       System.out.println(compareTimes(time2, time3));
       return results;
    }

    public int[] getMiddlePos() {
        int[] results = new int[2];
       time1 = System.nanoTime();
       results[0] = list.get((Math.round(list.size()/2)));
       time2 = System.nanoTime() - time1;
       time1 = System.nanoTime();
       results[1] = linkedList.get(Math.round((linkedList.size()/2)));
       time3 = System.nanoTime() - time1;
       System.out.print("Dla pobierania elementu z środka listy: ");
       System.out.println(compareTimes(time2, time3));
       return results;
    }

    public int[] getLastPos() {
        int[] results = new int[2];
       time1 = System.nanoTime();
       results[0] = list.get(list.size() - 1);
       time2 = System.nanoTime() - time1;
       time1 = System.nanoTime();
       results[1] = linkedList.get(linkedList.size() - 1);
       time3 = System.nanoTime() - time1;
       System.out.print("Dla pobierania elementu z końca listy: ");
       System.out.println(compareTimes(time2, time3));
       return results;
    }
    
}
