import java.util.*;
class Linear_Search
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int i, se=0, flag=0;
        for (i=0;i<=9;i++)
        {
            System.out.println("Input a number");
            a[i]=sc.nextInt();
        }
        System.out.println("Input a search Element");
        se=sc.nextInt();
        for(i=0;i<=9;i++)
        { 
            if(a[i]==se)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Search Element Found!");
        }
        else{
            System.out.println("Search element not found");
        }
    }
}