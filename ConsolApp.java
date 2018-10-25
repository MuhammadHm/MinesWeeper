package Mines_Weeper;
import java.lang.*;
import java.util.*;
public class ConsolApp extends MinesWeeper{
    //Attributes
    int x,y;
    boolean isPointer;

    //Methods
    ConsolApp(int n,int m,int mines_num){
        super(n,m,mines_num);
        x=y=0;
        isPointer =false;
    }
    public void GenerateBoard(){
        board=new char[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                board[i][j]='O';
    }         //done
    public void ConvertInput(String s){
        if(s.contains("-"))
            isPointer =true;
        else
            isPointer =false;
        for(int i=0;i<s.length();i++) {
            if (Character.isLetter(s.charAt(i))) {
                y = s.charAt(i) - 65;
            } else if (Character.isDigit(s.charAt(i))) {
                if (x == 0)
                    x = s.charAt(i) - 49;
                else
                    x = (x * 10) + (s.charAt(i) - 49);
            }
        }
    }  //done
    public void setMinesLocation(){
        Random r=new Random();
        for(int i=0;i<mines_num;i++)
        {
            mines_location[i][0]=r.nextInt(n);
            mines_location[i][1]=r.nextInt(m);
        }
       /* //printing mines_location
        for (int i = 0; i < mines_num; i++)
        {
            for(int j=0;j<2;j++)
                System.out.print(mines_location[i][j]+ "\t");
            System.out.println();
        }*/
    }       //done
    public void PrintBoard() {
        //for Axis Coordinates
        int[] row = new int[n];
        char[] columen = new char[m];
        for (int i = 0; i < n; i++)
            row[i] = i + 1;
        System.out.print("  ");
        for(int j=0;j<m;j++)
        {
            columen[j]=(char)('A'+j);
           System.out.print("  "+columen[j]);
        }
        System.out.println();
        System.out.print("  ");
        for(int i=0;i<n;i++)
            System.out.print("  "+"_");
        System.out.println();
        for(int i=0;i<n;i++) {
            if(i<9)
            System.out.print(row[i]+ " | ");
            else
                System.out.print(row[i]+ "| ");
            for (int j = 0; j < m; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }           //done
    // public int CheckAround(){}
    public void EditBoard(){
        //pointer situation
        if(isPointer)
            board[x][y]='P';
        //TODO num situation
        else
        {
            for(int i=0;i<mines_num;i++)
            {
                if(mines_location[i][0]==x && mines_location[i][1]==y) {
                    //TODO lose case & score check
                }
            }
        }
    }
    public void LoseCase(){}
    public void WinCase() {}
    public  void EditScore(){}

}
