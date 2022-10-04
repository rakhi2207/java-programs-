/*RockLee444*/
import java.util.Scanner;
public class Insertion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] data = new int[1]; //Initializing array
        int size=0,error=0; //Initializing variables
        do{
            error=0;
                    System.out.println("How many numbers do you wish to sort?");
                    size = sc.nextInt();
                    if(size>0){
                    data = new int[size];
                    for(int i=0;i<size;i++){
                           System.out.println("Add a number.");
                           data[i]=sc.nextInt();
                    }
                }
                else {
                    error=1;
                }
        }while(error!=0);
        sc.close();
        insertion(data,size);
    }

    public static void insertion(int[] data,int size){
        int aux,j;
        for(int i=1;i<size;i++){
            j=i;
            aux=data[i];
            while(j>0 && aux<data[j-1]){
                data[j] = data[j-1];
                j--;
            }
            data[j] = aux;
        }
        visualize(data, size);
    }

    public static void visualize(int data[],int size){
        System.out.println("\t*******Sorted array:*******");

        for(int i=0;i<size;i++){
            System.out.println("Number in position " + i + ": " + data[i]);
        }
    }
}