import java.util.*;
public class NQueen 
{
  int N;
  NQueen(int n)
  {
    N=n;
  }
  void printSoln(int board[][])
  {
    for (int i = 0; i < N; i++)
    {
       for (int j = 0; j < N; j++)
          System.out.print(" " + board[i][j] + " ");
       System.out.println();
    }
  }
  boolean isItSafe(int board[][], int m, int n)
  {
     int i, j;
     for(i = 0; i < n; i++)
       if(board[m][i] == 1)
         return false;
     for(i = m, j = n; i >= 0 && j >= 0; i--, j--)
       if(board[i][j] == 1)
         return false;
     for(i = m, j = n; j >= 0 && i < N; i++, j--)
       if(board[i][j] == 1)
         return false;
     return true;
  }
  boolean solveNQ(int board[][], int n)
  {
    if(n >= N)
      return true;
    for(int i = 0; i < N; i++)
    {
      if(isItSafe(board, i, n))
      {
        board[i][n] = 1;
        if(solveNQ(board, n + 1) == true)
          return true;
        board[i][n] = 0;
      }
    }
    return false;
  }
  boolean solving()
  {
    int board[][] = new int[N][N];
    int i,j;
    for(i=0;i<N;i++)
    {
      for(j=0;j<N;j++)
        board[i][j]=0;
    }
    if(solveNQ(board, 0) == false) 
    {
      System.out.print("Solution does not exist");
      return false;
    }
    printSoln(board);
    return true;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of queens");
    int n=in.nextInt();
    NQueen Q = new NQueen(n);
    Q.solving();
  }
}
