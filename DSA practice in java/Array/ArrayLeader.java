import java.util.*;
class ArrayLeader{
    public static void main(String[] args) { 
        // You are given an array arr of positive integers. Your task is to find all the leaders in the array.
        // An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader
        int arr[]={ 16,17,3,4,5,2,1};
        PrintLeader(arr);

    }
    public static void PrintLeader(int arr[]){
        int max=arr[arr.length];
        
        System.out.println(max);
        

        }


    }

