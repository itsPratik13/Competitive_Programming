package cp31.p800;

public class p1866a {
    public int minOps(int[] nums){
        int minct=Integer.MAX_VALUE;

        for(int x:nums){
            if(x==0){
                return 0;
            }
            minct=Math.min(minct,Math.abs(x));
        }
        return minct;

    }
    public static void main(String[] args) {
        
    }
}
