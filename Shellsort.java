/*Shellsort is an in-place comparison sort.
The method starts by sorting elements far apart from each other and progressively reducing the gap between them. */

import java.util.*;
 
public class Shellsort{
 
  public static void sort(int[] array) {
    int inner, outer;
    int temp;
 
    int h = 1;
    while (h <= array.length / 3) {
      h = h * 3 + 1;
    }
    while (h > 0) {
      for (outer = h; outer < array.length; outer++) {
        temp = array[outer];
        inner = outer;
 
        while (inner > h - 1 && array[inner - h] >= temp) {
          array[inner] = array[inner - h];
          inner -= h;
        }
        array[inner] = temp;
      }
      h = (h - 1) / 3;
    }
  }
 
  public static void main(String[] args) {
 
    int [] array = {65,67,98,0,76,45,21,42}; 
    System.out.println("Before sorting " + Arrays.toString(array));
    sort(array);
    System.out.println("After sorting " + Arrays.toString(array));
 
  }
}