# foregone_solution

Welcome to my first commentary on tough programming challenges.
I had always been seduced by tough problems, even if I am incapable of solving them.
But I can at least try to understand the solutions in this lifetime.
Tough problems make life bearable.

# Problem
Someone just won the Code Jam lottery, and we owe them N jamcoins! However,
when we tried to print out an oversized check, we encountered a problem. The
value of N, which is an integer, includes at least one digit that is a 4... and
the 4 key on the keyboard of our oversized check printer is broken.

Fortunately, we have a workaround: we will send our winner two checks for
positive integer amounts A and B, such that neither A nor B contains any digit
that is a 4, and A + B = N. Please help us find any pair of values A and B that
satisfy these conditions.

# Input
The first line of the input gives the number of test cases, T. T test cases
follow; each consists of one line with an integer N.

# Output
For each test case, output one line containing Case #x: A B, where x is the
test case number (starting from 1), and A and B are positive integers as
described above.

It is guaranteed that at least one solution exists. If there are multiple
solutions, you may output any one of them. (See "What if a test case has
multiple correct solutions?" in the Competing section of the FAQ. This
information about multiple solutions will not be explicitly stated in the
remainder of the 2019 contest.)

# Limits
1 ≤ T ≤ 100.
Time limit: 10 seconds per test set.
Memory limit: 1GB.
At least one of the digits of N is a 4.

Test set 1 (Visible)
1 < N < 10**5.

Test set 2 (Visible)
1 < N < 10**9.

Solving the first two test sets for this problem should get you a long way
toward advancing. The third test set is worth only 1 extra point, for extra fun
and bragging rights!

Test set 3 (Hidden)
1 < N < 10**100.

# Sample

Input
```
3
4
940
4444
```

Output
```
Case #1: 2 2
Case #2: 852 88
Case #3: 667 3777
```

In Sample Case #1, notice that A and B can be the same. The only other possible answers are `1 3` and `3 1`.

# Comments
Easy problem.
Change each 4 in number like the following.
```
56434 -> 56333 + 101
```
Remember the positions.

A first solution (Python3):

```
def foregone_solutions():
    tasks = int(input())
    for t in range(tasks):
        n = int(input())
        a, b = 0, 0
        for i, digit in enumerate(map(int, str(n))):
            a *= 10
            b *= 10
            if digit == 4:
                a += 3
                b += 1
            else:
                a += digit
        print("Case #{}: {} {}".format(t + 1, a, b))


if __name__ == "__main__":
    foregone_solutions()
```

This passes all test cases.
I did not even have to go to strings to solve the 3rd test case with numbers till `1e100`.
