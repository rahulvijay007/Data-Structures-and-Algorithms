# 📚 Java DSA – Conceptual Overview

This repository (intentionally) documents **what** core Data Structures & Algorithms (DSA) are and **why** you’d use them — without assuming any specific files or implementations exist yet.

> This README provides **descriptions only** so you can shape the codebase however you like and fill topics incrementally.

---

## 🔎 What This Repo Is About

- A compact, Java-oriented **reference guide** to the most common DSA topics.
- Written to help learners and interview candidates recall **key ideas, use-cases, and trade-offs**.
- Each section explains concepts at a high level; you can add or link code examples as you build them.

---

## 🧰 Core Data Structures (What & Why)

### Arrays
Contiguous memory blocks with O(1) random access by index. Great for fixed-size collections, cache-friendly scans, and base structures for higher-level DS. Downsides: costly inserts/deletes in the middle.

### Linked Lists
Nodes linked by references. Efficient O(1) head/tail inserts (when tracked), flexible size, but O(n) access by position and extra memory per node. Variants: singly, doubly, circular.

### Stack (LIFO)
Push/pop at one end. Models call stacks, undo operations, DFS recursion frames, and expression evaluation (infix → postfix, balanced parentheses).

### Queue (FIFO)
Enqueue at rear, dequeue at front. Models producer–consumer flows, BFS layering, and scheduling. Variants: circular queue, deque (double-ended).

### Priority Queue / Heap
Retrieves min/max in O(log n). Ideal for Dijkstra’s shortest path, scheduling by priority, and streaming “top-k” elements. Backed by a binary heap in typical Java usage.

### Hash Table / Hash Map
Average O(1) insert/lookup with hashing + buckets. Perfect for frequency counts, memoization caches, and set membership. Requires good hash functions and collision handling.

### Trees
Hierarchical structures for ordered data, searching, and indexing. Common forms:
- **Binary Tree** – Each node ≤ 2 children; flexible shape.
- **Binary Search Tree (BST)** – Ordered by key; supports sorted traversal. Unbalanced BSTs can degrade to O(n).
- **Self-Balancing BSTs (AVL/Red-Black)** – Keep height ~O(log n) for predictable performance.
- **Heap (Min/Max)** – Specialized tree for priority queues.

### Tries (Prefix Trees)
Character-by-character paths for strings. Efficient prefix queries, autocomplete, and dictionary tasks. Space–heavy without compression; often combined with optimizations.

### Graphs
Vertices + edges to model networks (roads, friendships, dependencies). Represented by adjacency lists (sparse) or matrices (dense). Foundation for traversal, connectivity, and shortest-path algorithms.

---

## 🧪 Algorithm Families (When to Reach for Them)

### Searching
- **Linear Search** – Scan when unsorted or tiny data.
- **Binary Search** – O(log n) on sorted structures; extendable to answer functions via predicate checks.

### Sorting
From easy-to-grasp (Bubble/Insertion) to interview staples (Merge/Quick). Choose by constraints:
- **Merge Sort** – Stable, O(n log n), uses extra space.
- **Quick Sort** – In-place, average O(n log n), worst-case O(n²) if poorly pivoted.
- **Heap Sort** – In-place O(n log n), not stable.

### Traversal
- **DFS** – Depth-first; good for topological sorts, cycle detection, and backtracking.
- **BFS** – Layered breadth; finds unweighted shortest paths and levels.

### Shortest Paths & MST
- **Dijkstra** – Non-negative edges; priority queue heavy.
- **Bellman–Ford** – Handles negative edges; detects negative cycles.
- **Floyd–Warshall** – All-pairs paths; cubic time.
- **Minimum Spanning Tree** – **Kruskal** (edge-centric + DSU) and **Prim** (grow from a seed using PQ).

### Greedy
Make locally optimal choices that provably lead to global optimum (with a matroid/interval structure). Examples: activity selection, Huffman coding, some scheduling.

### Recursion & Backtracking
Systematically explore solution spaces with pruning. Classic problems: N-Queens, permutations, Sudoku, subsets/combination generation.

### Dynamic Programming (DP)
Break problems into overlapping subproblems; reuse results via memoization/tabulation. Patterns: 1D/2D DP, knapsack, LCS/LCSubstring, LIS, edit distance, coin change.

### Divide & Conquer
Split, solve, and combine (merge sort, quick sort, fast exponentiation). Good for parallelizable workloads.

### String Algorithms
Prefix function (KMP), Z-algorithm, Rabin–Karp rolling hash, tries/suffix arrays for pattern search, deduplication, and bioinformatics tasks.

### Disjoint Set Union (Union–Find)
Amortized almost-O(1) merges/finds with path compression + union-by-rank. Key for Kruskal’s MST and dynamic connectivity.

### Bit Manipulation
Space-efficient tricks for parity, subsets enumeration, masks, and constant-time arithmetic checks.
