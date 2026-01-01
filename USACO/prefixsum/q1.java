
/*
Farmer John has N cows standing in a row. Each cow has a breed ID:

1 = Holstein

2 = Guernsey

3 = Jersey

You are given an array cows of length N, where cows[i] represents the breed of the i-th cow (1-indexed).

You are also given Q queries. Each query consists of two integers [a, b] representing a range of cows (1-indexed, inclusive).

For each query, return the number of cows of each breed within the range [a, b].

Constraints

1 <= N <= 100,000

1 <= Q <= 100,000

cows[i] ∈ {1, 2, 3}

1 <= a <= b <= N

*/
import java.util.*;

class Solution {

    public List<List<Integer>> breedCounts(int[] cows, int[][] queries) {
        List<List<Integer>> list=new ArrayList<>();
        int[] psum1=new int[cows.length+1];
        int[] psum2=new int[cows.length+1];
        int[] psum3=new int[cows.length+1];
        psum1[0]=0;
        psum2[0]=0;
        psum3[0]=0;
        for(int i=1;i<=cows.length;i++){
            psum1[i]=psum1[i-1]+ (cows[i-1]==1?1:0);
            psum2[i]=psum2[i-1]+ (cows[i-1]==2?1:0);
            psum3[i]=psum3[i-1]+ (cows[i-1]==3?1:0);

        }
        for(int[] q:queries){
            int a=q[0];
            int b=q[1];
            int ct1=psum1[b]-psum1[a-1];
            int ct2=psum2[b]-psum2[a-1];
            int ct3=psum3[b]-psum3[a-1];
            list.add(Arrays.asList(ct1,ct2,ct3));
        }
        return list;

    }
}
