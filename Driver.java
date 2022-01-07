import java.util.ArrayList;

public class Driver {
  public static void main(String [] args) {
    ArrayList testIns = new ArrayList<Integer>();
    ArrayList testSel = new ArrayList<Integer>();
    ArrayList testBub = new ArrayList<Integer>();
    //use the Sorts.java methods to create ArrayList?
    for(int i = 0 ; i < 15 ; i += 1){
      testIns.add((int)(Math.random() * 100));
    }
    for(int i = 0 ; i < testIns.size() ; i += 1){
      testSel.add(testIns.get(i));
      testBub.add(testIns.get(i));
    }
    //Insertion Sort:
    System.out.println("Insertion Test:\n\tBefore Sort: " + testIns);
    Sorts.insertionSortV(testIns);
    System.out.println("\tAfterSort: " + testIns);

    //Selection Sort:
    System.out.println("Selection Test:\n\tBefore Sort: " + testSel);
    Sorts.selectionSortV(testSel);
    System.out.println("\tAfterSort: " + testSel);

    //Bubble Sort:
    System.out.println("Bubble Test:\n\tBefore Sort: " + testBub);
    Sorts.bubbleSortV(testBub);
    System.out.println("\tAfterSort: " + testBub);
  }
}
