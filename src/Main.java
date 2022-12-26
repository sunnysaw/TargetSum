import java.util.Scanner;
/*
In this section we will see how to find how find a given number in array.
__________________________________________________________________________
Question : find the total number of pairs in the array who sum is equal to the given value x.
________________________________________________________________________________________________
Approach : first we take x value to user, and then we will compare with the value of array if match then we will father
           else we will return the value.
 */
public class Main {
    static int PairSum(int arr[] , int x ){
        int ans = 0;
        for (int i =0; i < arr.length; i++){ // For first index.
            for (int j = i + 1; j < arr.length; j++){ // For second index.
                if (arr[i] + arr[j] == x){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the value of array that you want to store : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println("Now printing the value of array : " + arr[i]);
            System.out.println("Now printing the reference value of array : " + arr);
            System.out.println("Now printing the index value of array : " + i);
            System.out.println();
        }
        int x = sc.nextInt();
        System.out.println("Printing the total number of pair :" + PairSum(arr,x));
    }
}