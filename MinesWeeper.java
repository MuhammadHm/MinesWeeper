package Mines_Weeper;
public abstract class  MinesWeeper {
   //Attributes
   int n,m,mines_num;
   char[][] board;
   int[][] mines_location;
   boolean[][] visited;

   //Methods
    MinesWeeper(int n,int m,int mines_num){
        this.n=n;
        this.m=m;
        this.mines_num=mines_num;
        visited =new boolean[n][m];
        mines_location =new int[mines_num][2];
    }
    public abstract void GenerateBoard();
    //public abstract int CheckAround();
    public abstract void EditBoard();
    public abstract void LoseCase();
    public abstract void WinCase() ;
    public abstract void setMinesLocation();
    public abstract void EditScore();

}
