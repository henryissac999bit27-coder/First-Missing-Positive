# LeetCode #41: First Missing Positive (Hard)

## 📝 Problem Description
Given an unsorted integer array `nums`, return the smallest positive integer that is not present in `nums`.

**Constraints:**
- The algorithm should run in **O(n)** time.
- The problem asks for **O(1)** auxiliary space (Note: This implementation uses $O(n)$ space for clarity and simplicity).

## 🚀 My Solution
The approach uses a **HashSet** to store all numbers from the input array for quick lookup:
1. **Insert:** Add all integers from `nums` into a `HashSet`.
2. **Search:** Starting from `i = 1`, check if `i` exists in the set.
3. **Return:** The first value of `i` that is NOT found in the set is the smallest missing positive integer.

## 📊 Complexity Analysis
- **Time Complexity:** $O(n)$ — One pass to build the set and one pass to find the missing integer.
- **Space Complexity:** $O(n)$ — The `HashSet` stores up to $n$ unique elements.

## 🔗 Problem Link
[First Missing Positive - LeetCode](https://leetcode.com)
