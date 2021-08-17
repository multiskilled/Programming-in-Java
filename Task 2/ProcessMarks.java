package def
import Marks;

public class ProcessMarks {


public static void main(String args[]) {
    Marks marks=new Marks();
    int min=min(marks.getMarks();
    int max=max(marks.getMarks());

    for(int i=0;i<marks.getMarks().length;i++){
        System.out.print(marks.getMarks()[i] + ".");
            if(i%10 == 9){
                System.out.println();
            }
            System.out.println();
            System.out.println("Min us"+min);
            System.out.println("<Max> us"+max);
        }
    }

    public static int min(int[] testMarks){
        int min=testMarks[0];
        for(int i=0;i<testMarks.length;i++){
            if(min>testMarks[i]){
                min=testMarks[i];
            }
        }
        return min;
    }
    public static int max(int[] testMarks){
        int max=testMarks[0];
        for(int i=0;i<testMarks.length;i++){
            if(max>testMarks[i]){
                max=testMarks[i];
            }
        }
        return max;
    }



}

