import java.util.*;
class Insertion_sort
{
    public static void main(String args[])
    {
        int i,n,m,index;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        n=sc.nextInt();
        System.out.println("Enter the value to insert");
        m=sc.nextInt();
        System.out.println("Enter the index where the value should be inserted");
        index=sc.nextInt();
        int a[]=new int[n+1];
        for(i=0;i<n-1;i++)
        {
            System.out.println("Enter the value in the array");
            a[i]=sc.nextInt();
        }
        for(i=n-1;i>=index;i--)
        {
            a[i]=a[i-1];
        }
        a[index]=m;
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}