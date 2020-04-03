 
import java.util.*;
import java.lang.*;
import java.io.*;

class countSumPair {
public static void main (String[] args) {
    
    
    Scanner sc= new Scanner(System.in);
    
    int t= sc.nextInt();
    
    while(t-->0)
    {
        int n=sc.nextInt();
        int sum=sc.nextInt();
        
        int a[] =new int[n];
        
        for(int i=0; i<n; i++)
        a[i]=sc.nextInt();
        
        int count=0;
        
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                int temp=a[i]+a[j];
                if(temp==sum)
                count++;
            }
        }
        
        System.out.println(count);
    }
    
    }
}
