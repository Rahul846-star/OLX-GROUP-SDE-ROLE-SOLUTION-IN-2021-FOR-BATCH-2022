 import java.util.*;
class Solution {
    public int solution(int[] A) {
        Set<Integer> tree=new TreeSet<>();
        for(int i=0;i<A.length;i++)
        {
            tree.add(A[i]);
        }
        ArrayList<Integer>arr=new ArrayList<>(tree);
        int count=arr.get(0);
        int flag=0;
        int res=0;
        if(count<0)
        {
            return 1;
        }
        for(int i=0;i<A.length;i++)
        {
            if(arr.get(i)!=count)
            {
                flag=1;
                break;
            }
            count++;
            
        }
            return count;

    }
}
