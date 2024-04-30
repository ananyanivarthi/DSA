package home_ques;

public class knighttour {
    public static void main(String[] args) {
        int[][] chess = new int[5][5];
        KT(chess, 0, 0, 1);
    }
    public static void KT(int[][]chess, int r, int c, int move){
        if(r<0||c<0||r>= chess.length||c>= chess.length||chess[r][c]>0){
            return;
        } else if (move== chess.length* chess.length) {
            chess[r][c] = move;
            displayboard(chess);
            chess[r][c] = 0;
            return;
        }
        chess[r][c] = move;
        KT(chess, r-2, c+1, move+1);
        KT(chess, r-1, c+2, move+1);
        KT(chess, r+1, c+2, move+1);
        KT(chess, r+2, c+1, move+1);
        KT(chess, r+2, c-1, move+1);
        KT(chess, r+1, c-2, move+1);
        KT(chess, r-1, c-2, move+1);
        KT(chess, r-2, c-1, move+1);
        chess[r][c] = 0;
    }
    public static void displayboard(int[][] chess){
        for(int i=0; i< chess.length;i++){
            for(int j=0; j< chess[i].length;j++){
                System.out.println(chess[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("****************");
    }
}
