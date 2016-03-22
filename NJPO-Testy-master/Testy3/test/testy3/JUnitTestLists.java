package testy3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class JUnitTestLists {
    
    public JUnitTestLists() {
    }
    @Test
    public void testAddOnFirstPos(){
        TestLists test = new TestLists();
        test.addOnFirstPos();
        assertEquals(1500001, test.list.size());
        assertEquals(123, test.list.get(0),0);
        assertEquals(1500001, test.linkedList.size());
        assertEquals(123, test.linkedList.get(0),0);
        }
    
    @Test
    public void testAddOnMiddlePos(){
        TestLists test = new TestLists();
        test.addOnMiddlePos();
        assertEquals(1500001, test.list.size());
        assertEquals(200, test.list.get(test.list.size()/2),0);
        assertEquals(1500001, test.linkedList.size());
        assertEquals(200, test.list.get(test.linkedList.size()/2),0);
        }
    
    @Test
    public void testAddOnLastPos(){
        TestLists test = new TestLists();
        test.addOnLastPos();
        assertEquals(1500001, test.list.size());
        assertEquals(300, test.list.get(test.list.size() - 1),0);
        assertEquals(1500001, test.linkedList.size());
        assertEquals(300, test.list.get(test.linkedList.size() - 1),0);
        }
    
    @Test
    public void testRemoveOnFirstPos(){
        TestLists test = new TestLists();
        test.removeOnFirstPos();
        assertEquals(1499999, test.list.size());
        assertEquals(1, test.list.get(0),0);
        assertEquals(1499999, test.linkedList.size());
        assertEquals(1, test.linkedList.get(0),0);
        }
    
    @Test
    public void testRemoveOnMiddlePos(){
        TestLists test = new TestLists();
        test.removeOnMiddlePos();
        assertEquals(1499999, test.list.size());
        assertEquals(749999, test.list.get(test.list.size()/2),0);
        assertEquals(1499999, test.linkedList.size());
        assertEquals(749999, test.linkedList.get(test.list.size()/2),0);
        }
    
    @Test
    public void testRemoveOnLastPos(){
        TestLists test = new TestLists();
        test.removeOnLastPos();
        assertEquals(1499999, test.list.size());
        assertEquals(1499998, test.list.get(test.list.size() - 1),0);
        assertEquals(1499999, test.linkedList.size());
        assertEquals(1499998, test.linkedList.get(test.list.size() - 1),0);
        }
    
    @Test
    public void testGetFirstPos(){
        TestLists test = new TestLists();
        int[] testResults = test.getFirstPos();
        assertEquals(1500000, test.list.size());
        assertEquals(0, testResults[0]);
        assertEquals(1500000, test.linkedList.size());
        assertEquals(0, testResults[1]);
        }
    
    @Test
    public void testGetMiddlePos(){
        TestLists test = new TestLists();
        int[] testResults = test.getMiddlePos();
        assertEquals(1500000, test.list.size());
        assertEquals(750000, testResults[0]);
        assertEquals(1500000, test.linkedList.size());
        assertEquals(750000, testResults[1]);
        }
    
    @Test
    public void testGetLastPos(){
        TestLists test = new TestLists();
        int[] testResults = test.getLastPos();
        assertEquals(1500000, test.list.size());
        assertEquals(1499999, testResults[0]);
        assertEquals(1500000, test.linkedList.size());
        assertEquals(1499999, testResults[1]);
        }
    
    @Test
    public void testCompareTimesTime1IsBigger(){
        long op1time = 10000;
        long op2time = 100;
        TestLists test = new TestLists();
        assertEquals("ArrayLista jest szybsza o: " + ((op1time - op2time)) + " nanosekund", test.compareTimes(op1time, op2time));
        
        }
    
    @Test
    public void testCompareTimesTime2IsBigger(){
        long op1time = 100;
        long op2time = 10000;
        TestLists test = new TestLists();
        assertEquals("LinkedLista jest szybsza o: " + ((op2time - op1time)) + " nanosekund", test.compareTimes(op1time, op2time));
        
        }
    
    @Test
    public void testCompareTimesTimesEqual(){
        long op1time = 2500;
        long op2time = 3000;
        TestLists test = new TestLists();
        assertEquals("Obie operacje wykonały się z taką samą prędkością", test.compareTimes(op1time, op2time));
        
        }
    
}


