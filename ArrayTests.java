import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2(){
    int[] input = {1, 2, 3, 4, 5};
    int[] answer = {5, 4, 3, 2, 1};
    assertArrayEquals(answer, ArrayExamples.reversed(input));
  //so whats happening here is that it's copying the elemtns of the new empty array into the 
  //arugment array, instead of the other way around. this results in an array of all zeroes
  }

  @Test
  public void testReversedAll0(){
  int[] input = {1, 2, 3, 4, 5};
  int[] answer = {0, 0, 0, 0, 0};
  assertArrayEquals(input, ArrayExamples.reversed(input));
  }

  @Test
  public void testReverseInPlace2(){
    int[] input = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input);
    int[] answer = {5, 4, 3, 2, 1};
    assertArrayEquals(answer, input);
    //copies the first half of the input array correctly, but has no copy so it's just copying the 
    // second half to the first half, which will be the same cause the first half is just the 
    //second half now
  }

  @Test
  public void testReverseInPlace3(){
    int[] input = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input);
    int[] answer = {5, 4, 3, 4, 5};
  assertArrayEquals(input, answer);
}

  @Test
  public void testAverageExamples(){
    double[] input = {1.0, 2.0, 3.0, 4.0, 5.0};
    double answer = 3.5;
    assertEquals(answer, ArrayExamples.averageWithoutLowest(input), 0);
  }

  @Test
  public void tsetAverageExamplesRepeat(){
    double[] input = {2.0, 2.0, 3.0, 4.0, 5.0};
    double answer = 3.5;
//will leave out both 2s instead of only one, not sure if this is inteded or a bug
  }



  
  }

