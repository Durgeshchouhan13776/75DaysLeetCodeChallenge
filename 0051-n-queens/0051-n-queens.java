class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans  = new ArrayList<>();
        List<StringBuilder> board = new ArrayList<>();
        
        String s = ".".repeat(n);
        
        for(int i=0; i<n; i++){
            board.add(new StringBuilder(s));
        }
        
        int[] leftrow = new int[n];
        int[] upperDiagonal = new int[2*n-1];
        int[] lowerDiagonal = new int[2*n-1];

        solve(0,board,ans,leftrow,upperDiagonal,lowerDiagonal,n);
        return ans;
    }

    public static void solve(int col, List<StringBuilder> board, List<List<String>> ans, int[] leftrow, int[] upperDiagonal, int[] lowerDiagonal, int n){
        if(col==n){
            List<String> temp = new ArrayList<>();

            for(StringBuilder s : board){
                temp.add(s.toString());
            }

            ans.add(temp);
            return;
        }

        for(int row =0; row<n; row++){
            if(leftrow[row]==0&&upperDiagonal[n-1+col-row]==0&&lowerDiagonal[row+col]==0){
                board.get(row).setCharAt(col,'Q');

                   leftrow[row] = 1;

                lowerDiagonal[row + col] = 1;

                upperDiagonal[n - 1 + col - row] = 1;


                 solve(
                        col + 1,
                        board,
                        ans,
                        leftrow,
                        upperDiagonal,
                        lowerDiagonal,
                        n
                );

                board.get(row).setCharAt(col, '.');

                leftrow[row] = 0;

                lowerDiagonal[row + col] = 0;

                upperDiagonal[n - 1 + col - row] = 0;
            }

            }
        }
    }
