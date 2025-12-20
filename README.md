# Java Sorting Algorithms 

A comprehensive collection of fundamental sorting algorithms implemented in Java.
This repository demonstrates clean architecture, recursion, and algorithm efficiency analysis.

## Algorithms Included

This repository contains implementations of:

* **Merge Sort** (Divide & Conquer)
* **Quick Sort** (Divide & Conquer)
* **Insertion Sort** (Simple & Adaptive)
* **Selection Sort** (In-place comparison)
* **Bubble Sort** (Basic comparison)

## Complexity Analysis (Big O)

| Algorithm      | Best Time  | Average Time | Worst Time | Space Complexity | Method       |
| -------------- | ---------- | ------------ | ---------- | ---------------- | ------------ |
| Quick Sort     | Ω(n log n) | Θ(n log n)   | O(n²)      | O(log n)         | Partitioning |
| Merge Sort     | Ω(n log n) | Θ(n log n)   | O(n log n) | O(n)             | Merging      |
| Insertion Sort | Ω(n)       | Θ(n²)        | O(n²)      | O(1)             | Insertion    |
| Selection Sort | Ω(n²)      | Θ(n²)        | O(n²)      | O(1)             | Selection    |
| Bubble Sort    | Ω(n)       | Θ(n²)        | O(n²)      | O(1)             | Exchanging   |

**Time Complexity:** How runtime grows with input size *n*.
**Space Complexity:** How much extra memory is needed.

* *O(1)* = sorts **in-place**.

## Algorithm Details

### Merge Sort

Recursively splits the array, then merges sorted halves.
Runs in **O(n log n)** but needs **O(n)** extra memory.

### Quick Sort

Chooses a pivot and partitions the array around it.
Uses Lomuto Partition; pivot = last element.
Runs fast in practice, uses **O(log n)** space due to recursion.

### Insertion Sort

Builds the sorted array one element at a time.
Great for small or nearly sorted inputs.

### Selection Sort

Repeatedly finds the minimum element and moves it to the front.
Simple but always **O(n²)**.

### Bubble Sort

Swaps adjacent elements until the array is sorted.
Easy to understand, slow in practice.

## How to Run

1. Clone the repo:

   ```bash
   git clone https://github.com/hakankocadag/SortingAlgorithms.git
   ```
2. Open the project in IntelliJ, Eclipse, or VS Code.
3. Navigate to the algorithm you want to test, e.g. `src/quicksort/QuickSort.java`.
4. Run the `main` method.

## License

This project is licensed under the **MIT License**.
