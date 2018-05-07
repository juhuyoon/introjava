package simple.textgui;

import java.util.Scanner;

//A text GUI is a text form interaction without a graphical interface.
//making a calculator application
public class Main {
    //always start with a while loop when starting a GUI
    // this will run forever if while = true (never ends)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;
        int number1, number2; //number variables in which we operate from.

        while(true) {
            System.out.println("Enter your choice. 1: Addition 2: Subtraction 3: Multiplication 4: Division 5. Exit: \n");
            option = Integer.parseInt(in.next());

            if (option == 1) {
                askForNumbers();
                number1 = Integer.parseInt(in.next());
                number2 = Integer.parseInt(in.next());
                float sum = number1 + number2;
                System.out.println("The sum is :" + sum);
            } else if (option == 2){
                askForNumbers();
                number1 = Integer.parseInt(in.next());
                number2 = Integer.parseInt(in.next());
                float diff = number1 - number2;
                System.out.println("The difference is :" + diff);
            } else if (option == 3) {
                askForNumbers();
                number1 = Integer.parseInt(in.next());
                number2 = Integer.parseInt(in.next());
                float multi = number1 * number2;
                System.out.println("The product is :" + multi);
            } else if (option == 4) {
                askForNumbers();
                number1 = Integer.parseInt(in.next());
                number2 = Integer.parseInt(in.next());
                float quotient = number1/number2;
                System.out.println("The quotient is :" + quotient);
            } else { //to link to option 5 automatically and then ask for the calculator to exit
                break;
            }
        }
    }


    public static void askForNumbers(){
        System.out.println("Enter 2 numbers");
    }



}
