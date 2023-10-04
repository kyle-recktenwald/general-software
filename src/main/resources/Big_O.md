# Big O:

### Overview:

* Big O time is the language and metric we use to describe the efficiency of algorithms

### Time Complexity:

* Time complexity tells you how the execution time of an algorithm grows as the input data (or problem size) gets larger

### Space Complexity:

* Space complexity is how much memory or storage space an algorithm or program uses to solve a problem
* It's a measure of the amount of computer memory required by the program to execute and produce its output

### Tips for Determining Big O:

* Dropping Constants & Non-Dominant Terms:
    * It is very possible for `O(N)` code to run faster than `O(1)` code for specific inputs
    * Big O **just describes the rate of increase**
    * For this reason, we drop the constants in runtime
        * i.e. an algorithm that one might describe as `O(2N)` is actually `O(N)`
    * Drop the Non-Dominant Terms:
        * A "term" typically refers to a part or component of a mathematical expression or equation
        * For Example:
            * `O(N^2 + N)` becomes `O(N^2)`
            * `O(N + log N)` becomes `O(N)`
* Multi-Part Algorithms: Add vs. Multiply:
    * For algorithms with two steps, you'll need to know whether to multiply or add the runtimes:
        * If your algorithm is in the form "do this, then, **when you're all done**, do that" then you **add** the runtimes
        * If your algorithm is in the form "do this **for each time** you do that" then you **multiply** the runtimes