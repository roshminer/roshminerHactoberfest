import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int arr1[] = new int[n1];
    for(int i = 0 ; i < arr1.length ; i++){
        arr1[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int arr2[] = new int[n2];
    for(int j = 0 ; j < arr2.length ; j++){
        arr2[j] = scn.nextInt();
    }
    int diff[] = new int[n2];
    int i = arr1.length - 1;
    int j = arr2.length - 1;
    int k = diff.length - 1;
    while(k>=0){
        if(arr2[j] > arr1[i]){
            diff[k] = arr2[j] - arr1[i];
            System.out.println(diff[k]);
        }else{
            diff[k] = arr2[j]+10 - arr1[i];
            System.out.println(diff[k]);
            arr2[j-1] -= 1;
        }
        i--;
        j--;
        k--;
    }
 }

}