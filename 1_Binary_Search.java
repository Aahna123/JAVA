import java.util.*;
class Binary_Search
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a[]= new int[10];
        int i, flag=0, se=0, l=0, u=9, mid=0;
        for(i=0;i<=9;i++)
        {
            System.out.println("Input number in ascending order");
            a[i]=sc.nextInt();
        }
        System.out.println("Input a search element");
        se=sc.nextInt();
        while(l<=u)
        {
            mid=(l+u)/2;
            if(a[mid]==se)
            {
                flag=1;
                break;
            }
            else if(se<a[mid])
            {
                u=mid-1;
            }
            else{
                l=mid+1;
            }
        }
            if(flag==1)
            {
                System.out.println("Search Element Found");
            }
            else{
                System.out.println("Search Element NOT found");
            }
    }
}