import java.io.*; 
  
public class RandomEx {  
    static String FILEPATH ="C:/java programs/name7.txt";  
    public static void main(String[] args) throws IOException { 

            writeToFile(FILEPATH, "Computer World is a creative world", 31);
			String k= String.valueOf(readFromFile(FILEPATH, 16, 18));
            System.out.println(k);  
               
    }  
    private static byte[] readFromFile(String filePath, int position, int size)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(filePath, "r");  
        file.seek(position);  
        byte[] bytes = new byte[size];  
        file.read(bytes);  
        file.close();  
        return bytes;  
    }  
    private static void writeToFile(String filePath, String data, int position)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");  
        file.seek(position);  
        file.write(data.getBytes());  
        file.close();  
    }  
}

