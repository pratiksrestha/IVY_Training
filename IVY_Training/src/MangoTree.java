import java.util.*;

public class MangoTree {
    public static void main(String[] args){
        int number_rows, number_columns, number_tree;
        System.out.println("Enter the number of rows and columns: ");
        Scanner s = new Scanner(System.in);
        number_rows = s.nextInt();
        number_columns = s.nextInt();
        System.out.println("Enter the position number of the tree: ");
        number_tree = s.nextInt();

        if(number_tree>number_rows*number_columns){
            System.out.println("this tree does not belong to Dora");
        }

        else if(number_tree>=1 && number_tree<=number_columns || number_tree%number_columns==0 || number_tree%number_columns==1){
            System.out.println("its a mango tree!");
        }

        else{
            System.out.println("not a mango tree!");
        }
    }
}
