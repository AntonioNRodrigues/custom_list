# Java Lists Implementation

This project demonstrates the implementation of various custom list types in Java:

- `CustomArrayList`
- `CustomLinkedList`
- `CustomVector`
- `CustomCopyOnWriteArrayList`

## Temporal Complexity

### CustomArrayList
- **Insertion**
    - Best: `O(1)` (end)
    - Average: `O(n/2)` (random position)
    - Worst: `O(n)` (beginning)
- **Deletion**
    - Best: `O(1)` (end)
    - Average: `O(n/2)` (random position)
    - Worst: `O(n)` (beginning)

### CustomLinkedList
- **Insertion**
    - Best: `O(1)` (beginning/end)
    - Average: `O(1)` (beginning/end), `O(n)` (arbitrary position)
    - Worst: `O(n)` (arbitrary position)
- **Deletion**
    - Best: `O(1)` (beginning/end)
    - Average: `O(1)` (beginning/end), `O(n)` (arbitrary position)
    - Worst: `O(n)` (arbitrary position)

### CustomVector
- **Insertion**
    - Best: `O(1)` (end)
    - Average: `O(n/2)` (random position)
    - Worst: `O(n)` (beginning)
- **Deletion**
    - Best: `O(1)` (end)
    - Average: `O(n/2)` (random position)
    - Worst: `O(n)` (beginning)

### CustomCopyOnWriteArrayList
- **Insertion**
    - Best: `O(1)` (end)
    - Average: `O(n)` (copy entire array on modification)
    - Worst: `O(n)` (copy entire array on modification)
- **Deletion**
    - Best: `O(n)` (copy entire array on modification)
    - Average: `O(n)` (copy entire array on modification)
    - Worst: `O(n)` (copy entire array on modification)

## Explanation of Custom Lists

### CustomArrayList
The `CustomArrayList` class is a dynamic array-based implementation. It internally uses an array to store elements. When the array is full, it resizes itself to double its capacity. Insertion at the end is efficient (`O(1)`), but inserting or deleting elements at other positions requires shifting elements, which results in `O(n)` complexity in the worst case.

### CustomLinkedList
The `CustomLinkedList` class is a linked list implementation using nodes. Each node contains the data and a reference to the next node. It supports efficient insertion and deletion at the beginning and end (`O(1)`), but operations at arbitrary positions require traversing the list, leading to `O(n)` complexity.

### CustomVector
The `CustomVector` class is similar to the `CustomArrayList` but includes a capacity increment. When the vector is full, it resizes itself by adding a specified increment to its capacity. Insertion at the end is efficient (`O(1)`), but inserting or deleting elements at other positions requires shifting elements, resulting in `O(n)` complexity in the worst case.

### CustomCopyOnWriteArrayList
The `CustomCopyOnWriteArrayList` class is a thread-safe implementation. It creates a copy of the array upon every modification (insertion or deletion). While reading operations are efficient (`O(1)`), modification operations have a higher cost (`O(n)`) due to the need to copy the entire array.

Feel free to explore and modify these classes to suit 