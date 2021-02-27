import java.io.*;
import java.util.*;
public class WaveTraversalTwoDArray
{
    public static void main(String[]args)throws Exception
    {
     Scanner s=new Scanner(System.in);
     int r=s.nextInt();
     int c=s.nextInt();
     int [][]arr=new int [r][c];
     for (int i=0;i<arr.length;i++)
     {
         for(int j=0;j<arr[0].length;j++)
         {
             arr[i][j]=s.nextInt();
         }
     }
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
     //wave traversal means when it come down row increase and up then row decrease
        //columns always get increases outer loop will be off col
        //two case are there 1st even col(row increase) 2nd odd columns(row decrease)
        for(int j=0;j<arr[0].length;j++)
        {
            if(j%2==0)
            { //column is even
                for(int i=0;i<arr.length;i++)
                { //row increase
                    System.out.println(arr[i][j]);
                }
            }else{//columns is odd
                for(int i= arr.length-1; i>=0;i--)
                {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
