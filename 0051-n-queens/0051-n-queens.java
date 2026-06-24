class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<StringBuilder> board = new ArrayList<>();
        String s = ".".repeat(n);

        for(int i=0; i<n; i++){
            board.add(new StringBuilder(s));
        }
        solve(0,board, ans, n);
        return ans;
    }

    public static void solve(int col, List<StringBuilder> board, List<List<String>> ans, int n){

        if (col==n){

            List<String> temp = new ArrayList<>();

            for(StringBuilder s : board){
                temp.add(s.toString());
            }
            ans.add(temp);

            return;
        }

        for(int row = 0; row<n; row++){
            if(isSafe(row, col, board,n)){
                board.get(row).setCharAt(col, 'Q');
                solve(col+1, board, ans, n);
                board.get(row).setCharAt(col, '.');
            }
        }
    }

    public static boolean isSafe(int row, int col, List<StringBuilder> board, int n){
        int duprow = row;
        int dupcol = col;

        while(row>=0 && col>=0){
            if(board.get(row).charAt(col)=='Q')
            return false;
            row--;
            col--;
        }

        col = dupcol;
        row = duprow;

        while (col >= 0) {

            if (board.get(row).charAt(col) == 'Q')
                return false;

            col--;
        }

        row = duprow;
        col = dupcol;

        while (row < n && col >= 0) {

            if (board.get(row).charAt(col) == 'Q')
                return false;

            row++;
            col--;
        }

        return true;
    }
}