Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points pon a scale of 1 to 100 for three categories: problems clarity, originality and difficulty.
The rating for Alice's challenge is the triplet a=(a[0],a[1],a[2]) and the rating for Bob's challenge is the triplet b=(b[0],b[1],b[2]).
The task is to find their comparision points by comparing a[0] with b[0], a[1] with b[1] and a[2] with b[2].
 - if a[i] > b[i], then Alice is awarded 1 point
 - if a[i] < b[i], then Bob is awarded 1 point.
 - if a[i] = b[i] then neither person receives a point.
Comparision points is the total points a person earned. Given a and bm determine their respective comparision points.

Function Description
Complete the function compareTriplets in the editor below.
compareTriplets has the following parameters(s):
 - int a[3]: Alice's challenge rating
 - int b[3]: Bob's challenge rating
Return
 - int[2]: Alice's score in the first position and Bob's score in the second.
Input Format
The first line contains 3 space-separated integers, a[0], a[1], a[2], the respective values in triplet a.
The second line contains 3 space-separated integers, b[0].b[1].b[2], the respective values in triplet b.

Constraints
 - 1<= a[i] <= 100
 - 1<= b[i] <= 100
