import java.util.ArrayList;
import java.util.Scanner;

public class UnitedWeStand{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            ArrayList<Integer> b=new ArrayList<>();
            ArrayList<Integer> c=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(a[i]==1){
                    b.add(i);
                }
                for(int j=i+1;j<n;j++){
                    if(a[j]%a[i]==0){
                        c.add(a[j]);
                    }
                    else{
                        b.add(a[j]);
                    }
                }
            }

        }
    }
}