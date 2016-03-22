package testy2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class GeneratorAndSortNumbers {
    
    private Random random = new Random();
    private ArrayList<Integer> numbers = new ArrayList<>();
    
    public void Generate(){
        for (int i = 0; i < (int)1e7; i++) {
            this.numbers.add(random.nextInt());
        }
    }
    
    public void Sort(){
        Collections.sort(numbers);
    }


}
