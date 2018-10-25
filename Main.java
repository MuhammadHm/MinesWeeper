package Mines_Weeper;
import java.util.*;
import java.util.Scanner;

public class Main {
    static Scanner read=new Scanner(System.in);
    public static void main(String [] args)
    {
        ConsolApp c=new ConsolApp(10,10,8);
        c.GenerateBoard();
        c.PrintBoard();
        String s=read.next();
        c.ConvertInput(s);
        c.EditBoard();
        c.PrintBoard();
        c.setMinesLocation();

    }

}
