public class Topped {

    public static void main(String[] args) {
        int[] mark = {56,95,78,88,45,30,12,99};

        int highestMarks = mark[0];
        int highestMarksIndex = 0;

        for (int i = 1; i < mark.length; i++){
            if(mark[i] > highestMarks){
                highestMarks = mark[i];
                highestMarksIndex = i;
            }
        }
        System.out.println("RollNo of Topper Student is " + (highestMarksIndex+1) + " and the marks of the Student is " + highestMarks ); 
    }
}