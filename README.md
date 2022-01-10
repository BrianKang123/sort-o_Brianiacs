# sort-o_Brianiacs
## Roster: Jing Yi Feng, Brian Kang, Brian Wang
## SOTW: The Feels by Twice

## Bubble Sort
### Description
Swaps adjacent elements if they are in the wrong order until entire list is ordered. 
### Best Case
* The best case scenario for Bubble Sort's passes would be n-1 because it disregards the last index. Also, our algorithm of Bubble Sort swaps adjacent values by comparing them, and compares them regardless of whether or not they have been previously swapped, or if they are already sorted. The algorithm also will make all the passes through the arrayList regardless of if it is already sorted due to the code not knowing whether or not it is sorted. Therefore, the best and worst cases differ only in the time it takes to actually swap elements.
* Time Complexity: O(n)
### Worst Case
* The worst case scenario for Bubble Sort would be if the list is sorted in descending order.
* The worst case scenario for Bubble Sort's passes would be n-1 as well because like the best case scenario, it disregards the last index. Also, Bubble Sort swaps two at a time, so the worst case for the comparisons would be the same as the best scenario for the comparisons because bubble checks through the entire array each time and on repeat.  
* Time Complexity: O(n^2)
### Explanation/Examples
```
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
### Description
Searches for the smallest element in the array and swaps it to the front of the array and keep doing so until list is sorted. 
### Best Case
* The best case scenario for Selection Sort's passes would be n-1 because it disregards the last index. Also, Selection Sort selects and moves, so the best scenario for the comparisons would be the same as the worst scenario for the comparisons because the function goes through the same iteration of selecting through each value in the array and placing it in its appropriate location.
* Time Complexity: O(n^2)
### Worst Case
* The worst case scenario for Selection Sort's passes would be n-1 as well because like the best case scenario, it disregards the last index. Also, Selection Sort selects and moves, so the worst scenario for the comparisons would be the same as the best scenario for the comparisons because the function goes through the same iteration of selecting through each value in the array and placing it in its appropriate location. 
* Time Complexity: O(n^2)
### Explanation/Examples

## Insertion Sort
### Description 
List is split into sorted and unsorted and elements are placed in the correct sorted position by comparing with adjacent elements and swapping if neccessary. 
### Best Case
* The best case scenario for Insertion Sort's passes would be n-1 because it disregards the last index. Also, Insertion Sort inserts the value where appropriate, so the best scenario for the comparisons would be the values in ascending order from left to right because the function checks for each index only once and moves on to the next one, only making n-1 comparisons.  
* Time Complexity: O(n)
### Worst Case
* The worst case scenario for Insertion Sort's passes would be n-1 because it disregards the last index. Also, Insertion Sort inserts the value where appropriate, so the worst scenario for the comparisons would be the values in the reverse order or descending order from left to right because the function will check the entire array each time it goes through a pass, resulting in the maximum number of comparisons.  
* Time Complexity: O(n^2)
### Explanation/Examples


