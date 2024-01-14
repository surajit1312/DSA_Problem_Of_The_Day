package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * GeeksForGeeks: Find duplicate rows in a binary matrix
 * 
 * Link:
 * https://www.geeksforgeeks.org/problems/find-duplicate-rows-in-a-binary-matrix/1
 * 
 * TC: O(M x N) where M, N are number of rows and columns of matrix respectively
 * SC: O(M)
 * 
 */
public class P1_Find_Duplicate_Rows_In_Binary_Matrix {
    public static void main(String[] args) {
        int matrix[][] = {
                { 0, 1, 1, 0 },
                { 1, 0, 0, 1 },
                { 1, 0, 0, 1 },
                { 1, 0, 0, 1 },
                { 0, 1, 1, 0 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 0 },
                { 0, 1, 1, 0 },
                { 0, 0, 1, 1 }
        };
        int m = 9;
        int n = 4;
        ArrayList<Integer> repeated = repeatedRows(matrix, m, n);
        System.out.println(repeated);
    }

    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n) {
        Map<String, Integer> pattern = new HashMap<String, Integer>();
        ArrayList<Integer> repeated = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            String current = "";
            for (int j = 0; j < n; j++) {
                current += matrix[i][j];
            }
            if (pattern.containsKey(current)) {
                repeated.add(i);
            }
            pattern.put(current, pattern.getOrDefault(current, 0) + 1);
        }
        return repeated;
    }
}
