package cp31.p800;

import java.util.ArrayList;
import java.util.List;

public class p1862b {
    public int lengthofArr(int[] nums){
        List<Integer> list=new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=nums[i-1]){
                list.add(nums[i]);

            }
            else{
                list.add(nums[i]);
                list.add(nums[i]);

            }
        }
        System.out.println(list.toString());
        return list.size();
    }
    public static void main(String[] args) {
     System.out.println();   
    }
}
