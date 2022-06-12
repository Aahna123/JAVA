import java.util.*;
class Selection_Sort
{
    public static void main(String Args[])
    {
        int n,p,i,j,temp=0,min=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a size");
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter a number");
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            min=a[i];
            p=i;
            for(j=i+1;j<n;j++)
            {
                if(a[j]<min)
                {
                    min=a[j];
                    p=j;
                }
            }
            temp=a[i];
            a[i]=min;
            a[p]=temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        
    }
}