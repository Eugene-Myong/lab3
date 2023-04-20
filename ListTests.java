import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter(){
        List<String> input = new ArrayList<String>();
        input.add("Apple");
        input.add("Banana");
        input.add("Carrot");
        input.add("Dinner");
        List<String> answer = new ArrayList<String>();
        answer.add("Apple");
        answer.add("Dinner");
        assertEquals(answer, ListExamples.filter(input, new StringChecking()));
//error in method is that it adds at index 0, so it will be in reverse order
    }

    @Test
    public void testMerge(){
        List<String> input = new ArrayList<String>();
        input.add("Apple");
        input.add("Carrot");
        input.add("Eggs");
        List<String> input2  = new ArrayList<String>();
        input.add("Banana");
        input.add("Dinner");
        input.add("Focaccia");

        List<String> answer = new ArrayList<String>();
        answer.add("Apple");
        answer.add("Banana");
        answer.add("Carrot");
        answer.add("Dinner");
        answer.add("Eggs");
        answer.add("Focaccia");
        assertEquals(answer, ListExamples.merge(input, input2));
//error is that it just doesnt work, throws the second list onto the back of the first one and
//returns that
//another potential bug is that it doesn't really check for duplicates, so my guess is 
//that it would just throw on the second lists elements and move on

    }
}