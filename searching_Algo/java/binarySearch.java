import java.util.*;

public class Main 
{
    
    public static void main(String[] args)
    {
        
        Scanner inp = new Scanner(System.in);
        
        int[] a = new int[50];
        int n;
        int x;
        
        System.out.println("enter the total no. of element :");
        n= inp.nextInt();
        System.out.println("enter the numbers in sorted order (ascending order)");
        for (int i=0;i<n;i++)
        {
            a[i]=inp.nextInt();
        }
        
        System.out.println("enter the no. which you want to search");
        x=inp.nextInt();
        //call the binarySearch method 
        //pass the array ,searchingElement
        //pass the l=0 and r=arraySize-1
        int l=0;
        int r=n-1;
        int pos=binarySearch(a,x,l,r);
        if(pos!=0)
        {
             System.out.println("element found at position : "+(pos+1)+"."); 
        }
        else 
        {
            System.out.println("element is not in the list .") ;
        }
    }
    
    public static int binarySearch(int[] a , int x , int l , int r)
    {
       
        if(r>=l)
        {
            int mid=(l+r)/2;
            if (a[mid]==x)
            {
                return mid;
            }
            else if (a[mid]>x)
            {
                return binarySearch(a,x,l,mid-1);
            }
            else if (a[mid]<x) 
            {
                return binarySearch (a, x,mid+1,r);
            }
            
        }
        
            return 0;
        
    }
}
