import java.util.Scanner;
class display_arr
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i,n,arr[];
      arr=new int[100];
      System.out.println("enter the value of n");
      n=sc.nextInt();
      System.out.println("enter array");
      for(i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      System.out.println("display array");
      for(i=0;i<n;i++)
      {
        System.out.println(arr[i]);
      }
    }
}