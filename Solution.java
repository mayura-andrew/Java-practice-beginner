import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6], sum, max = -64;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i = 1; i < 5; i++){
            for(int j = 1; j < 5; j++){
                sum = arr[i][j] + arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1]
                    + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                if(sum > max){

                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}

