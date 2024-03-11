public class Matrices {
    public static void printSpiral(int[][] matrix){
        int sr = 0;
        int sc = 0;
        int er = matrix.length-1;
        int ec = matrix[0].length-1;
        
        while (sr<=er && sc<=ec){
            for (int j=sc; j<=ec; j++){
                System.out.print(matrix[sr][j]+" ");
            }
            for (int i=sr+1; i<=er; i++){
                System.out.print(matrix[i][ec]+" ");
            }
            for (int j=ec-1; j>=sc; j--){
                if (sr == er) break;
                System.out.print(matrix[er][j]+" ");
            }
            for (int i=er-1; i>sr; i--){
                if (sc == ec) break;
                System.out.print(matrix[i][sc]+" ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        System.out.println();
    }

    public static int diagonalSum(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        if (n!=m) return Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=matrix[i][i];
            if (i!=n-1-i) sum+=matrix[i][n-1-i];
        }
        return sum;
    }

    public static int[] binarySearch(int[][] matrix, int k){
        int sr=0;
        int sc=matrix[0].length-1;
        int er=matrix.length-1;
        int ec=0;

        while(sr<=er && sc>=ec){
            int ele = matrix[sr][sc];
            if(ele == k) return new int[]{sr, sc};
            else if (ele > k) sc--;
            else sr++;

        }
        return new int[] {-1, -1};
    }
}
