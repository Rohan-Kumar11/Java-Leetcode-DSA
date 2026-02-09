package Arrays;

import java.util.Scanner;

public class Rotating_matrix {
//    LeetCode: 1886. Determine Whether Matrix Can Be Obtained By Rotation

    /*
    Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

    Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
     */

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row of 2D array: ");
        int row = input.nextInt();
        System.out.println("Enter the column of 2D array: ");
        int column = input.nextInt();

        int[][] mat =new int[row][column];

        int[][] target= new int[row][column];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i< row; i++){
            for (int j = 0; j < column; j++) {
                mat[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements of the target: ");
        for (int i = 0; i< row; i++){
            for (int j = 0; j < column; j++) {
                target[i][j] = input.nextInt();
            }
        }
        System.out.println(findRotation(mat,target));
    }

        static public boolean findRotation(int[][] mat, int[][] target) {
            boolean ans = false;
            int t = 0;
            while(t<4){
                ans = result(mat,target);
                if(ans == true){
                    return true;
                }
                mat = rotate(mat);
                t++;

            }
            return ans;
        }

        static public boolean result(int[][] mat, int[][] target){

            for(int i = 0; i<mat.length; i++){
                for(int j = 0; j<mat[0].length; j++){
                    if(mat[i][j] != target[i][j]){
                        return false;
                    }
                }
            }
            return true;
        }

        static public int[][] rotate(int[][] mat){
            int n=mat.length;
        int[][] arr= new int[n][n];
        int check=0;
        int find =0;
        while(find!=n*n && check!=4 ){
            int count=0;
      for(int i=0 ; i<mat.length ; i++){
        for(int j=0 ; j<mat.length ; j++){
            arr[i][j]=mat[n-j-1][i];
        }
      }
        for(int p=0 ; p<n ; p++){
        for(int k=0 ; k<mat.length ; k++){
            mat[p][k]=arr[p][k];
            if(arr[p][k]==target[p][k]){
                count++;
            }
      }
        }
      find=count;
        check++;
        }
        if (find==n*n){
            return true;
        }
        return false;
        }
    }
