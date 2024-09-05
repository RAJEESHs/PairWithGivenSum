import java.util.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=sc.nextInt();
		for (int i=0;i<arr.length;i++) 
		{
		    arr[i]=sc.nextInt();
		}
		    for (int i=0;i<arr.length;i++) 
		    {
		        for (int j=i+1;j<arr.length;j++){
		        if(arr[i]+arr[j]==sum){
		            System.out.println(arr[i]+","+arr[j]);
		        }
	    }
	}
}
}
