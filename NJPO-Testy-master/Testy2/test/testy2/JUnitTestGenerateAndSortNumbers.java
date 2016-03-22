package testy2;
import org.junit.Test;



public class JUnitTestGenerateAndSortNumbers {
    long start,end;
    
    @Test
    public void TestGeneratorNumbers(){
        GeneratorAndSortNumbers GASN = new GeneratorAndSortNumbers();
        start = System.nanoTime();
        GASN.Generate();
        end = System.nanoTime();
        System.out.println("Czas wygenerowania liczb wynosi " + (end - start)/1000000 + " ms");
    }
    
    @Test
    public void TestSortNumbers() throws Exception {
        GeneratorAndSortNumbers GASN = new GeneratorAndSortNumbers();
        GASN.Generate();
        start = System.nanoTime();
        GASN.Sort();
        end = System.nanoTime();
        System.out.println("Czas posortowania liczb wynosi " + (end - start)/1000000 + " ms");
    }
}
