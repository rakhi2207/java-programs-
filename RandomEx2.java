import java.io.*;
public class RandomEx2{
    //Writing a 10x10 multiplication table to a file:
    public static void main(String[] args)
    {
        File test = new File("C:\\java programs\\test.txt");
        test.createNewFile();
        try
        {
            FileWriter fw = new FileWriter(test);
            for( int n = 1; n <= 10; n++ )
            {
                for( int k = 1; k <= 10; k++)
                    fw.write(n*k + "\t");

                fw.write("\r\n");
            }

            fw.close();
        }

        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
