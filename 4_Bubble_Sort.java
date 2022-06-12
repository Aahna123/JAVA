import java.util.*;
class bubble_sort
{
    public static void main(String args[])
    {
        int i,j,n,temp=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the limit");
        n=sc.nextInt();
       int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Input a number");
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}