# Insertion Sort

Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time by comparisons. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. Today we will be going over a simple insertion sort example.

## PseudoCode

![2022-11-28 (3)](https://user-images.githubusercontent.com/108303424/204435026-eec92ba7-a4a6-4a04-bc17-3380a614a200.png)

**Trace**

This is our sample array. At each point in our iterations we will demonstrate whats happening within our code.

Sample Array: [8,4,23,42,16,15]

**Pass 1**

Initially I begins at index one. So we set our temp variable to 4. Then we compare our temp 4 with index 0 whos value is 8. Since 8 is greater than our variable 4 we swap these index postions. Once sorted we exit our loop and set J to -1 and temp to 0.

![2022-11-28 (7)](https://user-images.githubusercontent.com/108303424/204438994-0e133041-6da0-4a4e-80b3-c8d8de0a69ff.png)

**Pass 2 & 3**

Through passes 2 & 3 we set our temp variable to 23 and then to 42. Since they are correctly sorted we can continue to the next pass.


![2022-11-28 (11)](https://user-images.githubusercontent.com/108303424/204439692-77d6d860-405b-4155-acf5-73dc8c55b472.png)

**Pass 4**

We now set our temp variable to 16. 42 is larger so we swap these indexes. We then check the prvious index 23 and we see that it too is larger so we continue to swap these indexes. We the then check the next index of 8 and see that it is lesser so we exit the loop and set our temp value to 15 and move to the last pass.


![2022-11-28 (12)](https://user-images.githubusercontent.com/108303424/204439913-b0729414-687c-45d6-b08c-839892826598.png)

**Pass 5**

We set our temp variable to 15. 42 is larger so we swap these indexes. Next we compare 23, it is larger so we swap these as well. Now we compare 16, it is larger so we swap the last index.

![2022-11-28 (14)](https://user-images.githubusercontent.com/108303424/204440527-12dc5b73-9f31-4817-8b74-86d5b6fa7557.png)

**End**

![2022-11-28 (16)](https://user-images.githubusercontent.com/108303424/204440802-39235681-60aa-48a2-80d8-52e3289efe35.png)

**Code**

![2022-11-28 (18)](https://user-images.githubusercontent.com/108303424/204443218-69c6be74-527a-49e6-91b4-adfc01606326.png)

