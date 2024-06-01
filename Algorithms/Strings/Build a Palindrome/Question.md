### Build A Palindrome

You have two strings, <b>a</b> and <b>b</b>. Find a string, <b>s</b>, such that:

- s can be expressed as s = s<sub>a</sub> + s<sub>b</sub> where s<sub>a</sub> is a non-empty substring of a and s<sub>b</sub> is a non-empty substring of b.
- s is a palindrome string
- The length of s is as long as possible
  For each of the q pairs of strings(a<sub>i</sub> and b<sub>i</sub>) received as input, find and print string s<sub>i</sub> on a new line. If you're able to form more than one valid string s<sub>i</sub>, print whichever one comes first alphabetically. If there is no valid answer, print -1 instead.

#### Input Format

The first line contains a single integer,<i>q</i>, denoting the number of queries. The subsequent lines describe each query over two lines:

- The first line contains a single string denoting <i>a</i>
- The second line contains a single string denoting <i>b</i>

#### Constraints

- 1 &le; <i>q</i> 10
- 1 &le; |<i>a</i>|, |<i>b</i>| &le; 10<sup>5</sup>
- a and b contain only lowercase English letters.
- Sum of |a| over all queries does not exceed 2&times;10<sup>5</sup>
- Sum of |b| over all queries does not exceed 2&times;10<sup>5</sup>

#### Output Format

For each pair of strings (<i>a<sub>i</sub></i> and <i>b<sub>i</sub></i>), find some s<sub>i</sub> satisfying the conditions above and print it on a new line. If there is no such string, print -1 instead.

#### Sample Input

```
3
bac
bac
abc
def
jdfh
fds
```

#### Sample Output

```
aba
-1
dfhfd
```

#### Explanation

We perform the following three queries:

- Concatenate <i>s<sub>a</sub></i> = <b>"a"</b> with <i>s<sub>b</sub></i> = <b>"ba"</b> to create <i>s</i> = <b>"aba"</b>.
- We are given a = <b>"abc"</b> and s<sub>b</sub>= <b>"def"</b>; because both strings are composed of unique characters, we cannot use them to form a palindromic string. Thus, we print -1.
