

import java.util.ArrayList;

public class Sorts {
  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList<Comparable> al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  // returns an array consisting of [passes, comparisons]
  public static int[] bubbleSortV( ArrayList<Comparable> data )
  {
    int[] retInfo = new int[2]; //[passes, comparisons]
    int passCount = 0;
    int compareCount = 0;
    for (int passes = 0; passes < data.size() - 1; passes++){
      for (int num = 0; num < data.size() - 1; num ++){
        Comparable test = data.get(num);
        Comparable adj = data.get(num+1);
        if (test.compareTo(adj) > 0){
          data.set(num, adj);
          data.set(num+1, test);
        }
        compareCount += 1;
      }
      passCount += 1;
    }
    retInfo[0] = passCount;
    retInfo[1] = compareCount;
    return retInfo;
  }

  // VOID version of SelectionSort
   // Rearranges elements of input ArrayList
   // postcondition: data's elements sorted in ascending order
   // returns an array consisting of [passes, comparisons]
   public static int[] selectionSortV( ArrayList<Comparable> data )
   {
     //note: this version places greatest value at "rightmost" end

     //maxPos will point to position of SELECTION (greatest value)
     int[] retInfo = new int[2]; //[passes, comparisons]
     int maxPos = 0;
     int passCount = 0;
     int compareCount = 0;
     for( int pass = 1 ; pass < data.size() ; pass += 1 ) {
       maxPos = 0; //reset maxPos every time
       //System.out.println( "\nbegin pass " + (data.size() - pass) );//diag
       for( int searched = data.size() - pass ; searched >= 0 ; searched -= 1 ) { //Loop to find index of maximum unsorted value
         //System.out.println(searched);
         if(data.get(searched).compareTo(data.get(maxPos)) > 0){ //tests if current value greater than maxPos
           maxPos = searched;
           //System.out.println( "maxPos: " + maxPos );//diag
           //System.out.println( data );//diag
         }
         compareCount += 1;

       }
       //swap maxPos and pass values
       data.set(data.size() - pass, data.set(maxPos, data.get(data.size() - pass)));

       //System.out.println( "maxPos: " +  maxPos + "\npass: " + pass );//diag
       //System.out.println( "after swap: " +  data );//diag
       passCount += 1;
     }
     retInfo[0] = passCount;
     retInfo[1] = compareCount;
     return retInfo;
   }//end selectionSort

  // VOID version of InsertionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  // returns an array consisting of [passes, comparisons]
  public static int[] insertionSortV( ArrayList<Comparable> data )
  {
    int[] retInfo = new int[2]; //[passes, comparisons]
    int passCount = 0;
    int compareCount = 0;
    for( int partition = 1 ; partition < data.size() ; partition += 1 ) {
      //partition marks first item in unsorted region

      //System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      //System.out.println( data );

      //traverse sorted region from right to left
      for( int i = partition ; i > 0 ; i -= 1 ) {
        compareCount += 1;
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( data.get(i).compareTo(data.get(i - 1)) < 0)  {
          data.set(i, data.set(i - 1, data.get(i)));
          //System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag

        }

        else
          break;
      }
      passCount += 1;
    }
    retInfo[0] = passCount;
    retInfo[1] = compareCount;
    return retInfo;
  }//end insertionSortV

}
