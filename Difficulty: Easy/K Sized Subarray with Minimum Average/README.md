<h2><a href="https://www.geeksforgeeks.org/problems/subarray-with-least-average5031/1">K Sized Subarray with Minimum Average</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given an integer array <strong>arr[]</strong> and an integer <strong>k</strong>, find the contiguous subarray of size <strong>k</strong> that has the minimum average value among all possible subarrays of size k.&nbsp;</span><span style="font-size: 18px;">Return position (or index + 1) of the first element of that subarray.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [30, 20, 10], k = 1
<strong>Output: </strong>3
<strong>Explanation: </strong>Subarrays of length 1 are {30}, {20}, {10}. {10} has the least average equal to 10.
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [30, 20, 10], k = 2
<strong>Output: </strong>2
<strong>Explanation: </strong>Subarrays of length 2 are {30, 20}, {20, 10}. {20, 10} has the least average equal to (20 + 10)/2 = 15.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ k ≤ arr.size() ≤ 10<sup>5</sup><br>1 ≤ arr[i] ≤ 10<sup>4</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematics</code>&nbsp;