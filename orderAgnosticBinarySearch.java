package dsa;

import java.util.*;

public class orderAgnosticBinarySearch {
    public static void main(String [] args)
    {
        int n ,target;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter length of array");
        n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();

        }
        System.out.println("Enter a number to search");
        target = sc.nextInt();
        orderAgnosticBS(a,target);
        sc.close();  
    }
    static void orderAgnosticBS(int [] arr,int target)
    {
        int start,end,mid=0,flag=0;
        start = 0;
        end = arr.length-1;
        if(arr[start]<arr[end])  //ascending
        {
            while(start!=end)
        {
            mid = (start+end)/2;
            if(arr[mid] == target ){
                flag = 1;
                break;
            }
            else if(arr[mid]>target)
                end = mid-1;
            else
                start = mid+1;
            
        }
    }
    else{   //descending
        while(start!=end)
        {
            mid = (start+end)/2;
            if(arr[mid] == target ){
                flag = 1;
                break;
            }
            else if(arr[mid]<target)
                end = mid-1;
            else
                start = mid+1;
            
        }
    }
    if(flag==0)
            System.out.println("Not Found");
        else 
            System .out.println("Found at index : "+ mid);
        }

    }
    

