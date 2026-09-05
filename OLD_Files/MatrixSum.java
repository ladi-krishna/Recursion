package OLD_Files;
// import java.util.*;
// public class MatrixSum {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         int[][] arr1 =new int[n][m];
//         int[][] arr2=new int[n][m];
//         int[][] res=new int[n][m];

//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 arr1[i][j]=sc.nextInt();
//             }
//         }

//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 arr2[i][j]=sc.nextInt();
//             }
//         }


//         Summation(arr1, arr2, res, 0, 0);
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(res[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void Summation(int[][] arr1,int[][] arr2,int[][] sum,int i,int j){
//         int n=arr1.length;
//         int m=arr1[0].length;
//         if(i==n){
//             return;
//         }
//         else{
//             sum[i][j]=arr1[i][j]+arr2[i][j];
//             if(j==m-1)
//             Summation(arr1, arr2, sum, i+1, 0);
//             else
//             Summation(arr1, arr2, sum, i, j+1);
             
           
//         }
//     }
// }

import java.util.*;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] res = new int[n][m];
        
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        
       
        summation(arr1, arr2, res, 0, 0);
        
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }

    public static void summation(int[][] arr1, int[][] arr2, int[][] res, int i, int j) {
        int n = arr1.length;
        int m = arr1[0].length;

        if (i == n) {
            return;
        }

        res[i][j] = arr1[i][j] + arr2[i][j];

        
        if (j == m - 1) {
            summation(arr1, arr2, res, i + 1, 0);
        } else {
            summation(arr1, arr2, res, i, j + 1);
        }
    }
}
