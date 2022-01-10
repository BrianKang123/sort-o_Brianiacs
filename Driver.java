import java.util.ArrayList;

public class Driver {
  public static void main(String [] args) {
    test(10);
    test(100);
    test(1000);
    test(10000);
    //test(100000); takes too long
}

  public static void test(int length) {
    //each arrayList length will be tested 100 times each sort
    int[] insAvg = new int[2]; //to tally the final passes and comps
    int[] selAvg = new int[2];
    int[] bubAvg = new int[2];
    int insMaxComps = 0;
    int insMinComps = 999999999;
    for(int i = 0 ; i < 100 ; i += 1) {
      ArrayList testIns = Sorts.populate(length, 0, 100000);
      ArrayList testSel = new ArrayList<Integer>();
      ArrayList testBub = new ArrayList<Integer>();
      //Create randomized test ALs, then copy them to get the same test cases for all 3
      Sorts.shuffle(testIns);
      for(int j = 0 ; j < testIns.size() ; j += 1){
        testSel.add(testIns.get(j));
        testBub.add(testIns.get(j));
      }
      //accumulate results
      int[] insResult = Sorts.insertionSortV(testIns);
      insAvg[0] += insResult[0];
      insAvg[1] += insResult[1];
      int[] selResult = Sorts.selectionSortV(testSel);
      selAvg[0] += selResult[0];
      selAvg[1] += selResult[1];
      int[] bubResult = Sorts.bubbleSortV(testBub);
      bubAvg[0] += bubResult[0];
      bubAvg[1] += bubResult[1];
      //finding best and worst comparison counts in insertion sort due to it being the only one with varying values
      if(insResult[1] < insMinComps)
        insMinComps = insResult[1];
      if(insResult[1] > insMaxComps)
        insMaxComps = insResult[1];
    }

    System.out.println("SIZE " + length + " TESTS");
    //Insertion Sort:
    System.out.println("Insertion Sort: ");
    System.out.println("\tAvg passes: " + insAvg[0]/100 + "\n\tAvg comparisons: " + insAvg[1]/100);
    //Selection Sort:
    System.out.println("Selection Sort: ");
    System.out.println("\tAvg passes: " + selAvg[0]/100 + "\n\tAvg comparisons: " + selAvg[1]/100);
    //Bubble Sort:
    System.out.println("Bubble Sort: ");
    System.out.println("\tAvg passes: " + bubAvg[0]/100 + "\n\tAvg comparisons: " + bubAvg[1]/100);

    System.out.println("Variatons in Insertion Sort: ");
    System.out.println("\tMax comparisons: " + insMaxComps);
    System.out.println("\tMinimum comparisons: " + insMinComps);

    System.out.println("\n\n");
  }
}
