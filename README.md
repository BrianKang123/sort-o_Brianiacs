# sort-o_Brianiacs
## Roster: Jing Yi Feng, Brian Kang, Brian Wang
## SOTW: The Feels by Twice

## Bubble Sort
### Description/ALGO
 1. Start with the end of the loop (The size of the array).
 2. Iterate through the array from right to left, checking two at a time.
 3. For each check, determine if the value is less than or greater than the previous index.
 If the right element is greater or equal to the left element, maintain the order. Else, swap the order and repeat with the previous index as the focused index and the index before the focused index.
 4. Repeat Step 3 x times where x is the number of elements in the array - 2. 
### Best Case
* The best case scenario for Bubble Sort's passes would be n-1 because it disregards the last index. Also, our algorithm of Bubble Sort swaps adjacent values by comparing them, and compares them regardless of whether or not they have been previously swapped, or if they are already sorted. The algorithm also will make all the passes through the arrayList regardless of if it is already sorted due to the code not knowing whether or not it is sorted. Therefore, the best and worst cases differ only in the time it takes to actually swap elements.
* Time Complexity: O(n)
### Worst Case
* The worst case scenario for Bubble Sort would be if the list is sorted in descending order.
* The worst case scenario for Bubble Sort's passes would be n-1 as well because like the best case scenario, it disregards the last index. Also, Bubble Sort swaps two at a time, so the worst case for the comparisons would be the same as the best scenario for the comparisons because bubble checks through the entire array each time and on repeat.  
* Time Complexity: O(n^2)
### Explanation/Examples
```
original list
[66, 25, 24, 1, 40]
```
```
bubble: 
[66, 25, 24, 1, 40]
[66, 25, 1, 24, 40]
[66, 1, 25, 24, 40]
[1, 66, 25, 24, 40]
[1, 66, 24, 25, 40]
[1, 24, 66, 25, 40]
[1, 24, 25, 66, 40]
[1, 24, 25, 40, 66]
```

## Selection Sort
### Description/ALGO
1. Select smallest element, move to end.
2. Select next smallest, move to next to end.
3. Repeat until no elements not sorted
### Best Case
* The best case scenario for Selection Sort's passes would be n-1 because it disregards the last index. Also, Selection Sort selects and moves, so the best scenario for the comparisons would be the same as the worst scenario for the comparisons because the function goes through the same iteration of selecting through each value in the array and placing it in its appropriate location.
* Time Complexity: O(n^2)
### Worst Case
* The worst case scenario for Selection Sort's passes would be n-1 as well because like the best case scenario, it disregards the last index. Also, Selection Sort selects and moves, so the worst scenario for the comparisons would be the same as the best scenario for the comparisons because the function goes through the same iteration of selecting through each value in the array and placing it in its appropriate location. 
* Time Complexity: O(n^2)
### Explanation/Examples
```
original list
[66, 25, 24, 1, 40]
```
```
selection: 
[66, 25, 24, 1, 40]
[40, 25, 24, 1, 66]
[1, 25, 24, 40, 66]
[1, 24, 25, 40, 66]
[1, 24, 25, 40, 66]
```
## Insertion Sort
### Description/ALGO
Partition list into sorted and unsorted regions, start between element 0 and element 1
Walk element from unsorted to proper position in sorted list by comparing the values and swapping if necessary
Increase size of partition by 1 each time
Once partition is at the end of the list, the list is sorted 
### Best Case
* The best case scenario for Insertion Sort's passes would be n-1 because it disregards the last index. Also, Insertion Sort inserts the value where appropriate, so the best scenario for the comparisons would be the values in ascending order from left to right because the function checks for each index only once and moves on to the next one, only making n-1 comparisons.  
* Time Complexity: O(n)
### Worst Case
* The worst case scenario for Insertion Sort's passes would be n-1 because it disregards the last index. Also, Insertion Sort inserts the value where appropriate, so the worst scenario for the comparisons would be the values in the reverse order or descending order from left to right because the function will check the entire array each time it goes through a pass, resulting in the maximum number of comparisons.  
* Time Complexity: O(n^2)
### Explanation/Examples
```
original list
[66, 25, 24, 1, 40]
```
```
insertion: 
[66, 25, 24, 1, 40]
[25, 66, 24, 1, 40]
[25, 24, 66, 1, 40]
[24, 25, 66, 1, 40]
[24, 25, 1, 66, 40]
[24, 1, 25, 66, 40]
[1, 24, 25, 66, 40]
[1, 24, 25, 40, 66]

```


