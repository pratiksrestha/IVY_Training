import java.awt.*;

public class LoopPattern {
    public static void main(String[] args){
        char[] alphabets = {'A', 'B', 'C', 'D', 'E'};
        for(int i=0; i<alphabets.length; i++){
            for(int j=0; j<=i; j++){
                System.out.print(alphabets[j]);
            }
            System.out.println();
        }
    }
}
