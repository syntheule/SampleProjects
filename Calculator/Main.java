package Calculator;
// adding the user input 
import java.util.Scanner;
// importing the operations
import Calculator.functions.*;

public class Main {
    // instantiating the operations
    Scanner inx = new Scanner(System.in);
    Add add = new Add();
    Subtraction minus = new Subtraction();
    Multiplication times = new Multiplication();
    Division divide = new Division();
    public static void main(String[] args) {
        Main calc = new Main();
        calc.startProgram();
    }

    void startProgram ()
    {
        System.out.print("-------------------- Welcome to Calculator -------------------------\n\n");
        System.out.print("Enter 2 numbers to add: ");
        int size = 2;
        double[] nums = new double[size];
        for (int i = 0; i < size; i++) {
            nums[i] = inx.nextDouble();
        }
        selection(nums[0], nums[1]);
    }

    void selection(double fNum, double sNum)
    {
        System.out.println("Enter the following:\n\n1 - addition\n2 - subtraction\n3 - multiplication\n4 - division\n\n");
        System.out.print("Select: ");    

        // input for selection of operation
        int sel = inx.nextInt();

        // result depending from the operation selected
        System.out.print("Result: ");
        switch (sel) {
            case 1:
                add.display(fNum, sNum);
                break;

            case 2:
                minus.display(fNum, sNum);
                break;

            case 3:
                times.display(fNum, sNum);
                break;

            case 4:
                divide.display(fNum, sNum);
                break;
        
            default:
                selection(fNum, sNum);
                break;
        }
    }   
}
