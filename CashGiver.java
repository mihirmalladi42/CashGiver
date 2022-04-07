import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
public class CashGiver {
    public static final String RED = "\u001B[31m", GREEN = "\u001B[32m", RESET = "\u001B[0m", YELLOW = "\u001B[33m";
    //Lines 7, 8, and 9 define variables used for the available denominations
    public static double[] availDen = {0.01, 0.05, 0.10, 0.25, 1, 5, 10, 20, 50, 100};
    public static int num100 = 0, num50 = 0, num20 = 0, num10 = 0, num5 = 0, num1 = 0, num025 = 0, num010 = 0, num005 = 0, num001 = 0;
    public static int[] numVars = {num001, num005, num010, num025, num1, num5, num10, num20, num50, num100};
    public static double leftover;
    //Lines 12 to 93 are the method for giving the least number of bills
    public static void LeastNumOfBills(double inp, double originalInp) {
        DecimalFormat moneyPlace = new DecimalFormat("#.##");
        //Lines 15 to 49 loop the process inside. The process inside checks the largest denomination that can fit inside the input. Each time the process repeats, the input is subtracted by the largest denomination.
            while (inp != 0) {
                if (inp - availDen[9] >= 0 && inp - availDen[8] >= 0 && inp - availDen[7] >= 0 && inp - availDen[6] >= 0 && inp - availDen[5] >= 0 && inp - availDen[4] >= 0 && inp - availDen[3] >= 0 && inp - availDen[2] >= 0 && inp - availDen[1] >= 0 && inp - availDen[0] >= 0) {
                    num100++;
                    inp -= availDen[9];
                } else if (!(inp - availDen[9] >= 0) && inp - availDen[8] >= 0 && inp - availDen[7] >= 0 && inp - availDen[6] >= 0 && inp - availDen[5] >= 0 && inp - availDen[4] >= 0 && inp - availDen[3] >= 0 && inp - availDen[2] >= 0 && inp - availDen[1] >= 0 && inp - availDen[0] >= 0) {
                    num50++;
                    inp -= availDen[8];
                } else if (!(inp - availDen[9] >= 0) && !(inp - availDen[8] >= 0) && inp - availDen[7] >= 0 && inp - availDen[6] >= 0 && inp - availDen[5] >= 0 && inp - availDen[4] >= 0 && inp - availDen[3] >= 0 && inp - availDen[2] >= 0 && inp - availDen[1] >= 0 && inp - availDen[0] >= 0) {
                    num20++;
                    inp -= availDen[7];
                } else if (!(inp - availDen[9] >= 0) && !(inp - availDen[8] >= 0) && !(inp - availDen[7] >= 0) && inp - availDen[6] >= 0 && inp - availDen[5] >= 0 && inp - availDen[4] >= 0 && inp - availDen[3] >= 0 && inp - availDen[2] >= 0 && inp - availDen[1] >= 0 && inp - availDen[0] >= 0) {
                    num10++;
                    inp -= availDen[6];
                } else if (!(inp - availDen[9] >= 0) && !(inp - availDen[8] >= 0) && !(inp - availDen[7] >= 0) && !(inp - availDen[6] >= 0) && inp - availDen[5] >= 0 && inp - availDen[4] >= 0 && inp - availDen[3] >= 0 && inp - availDen[2] >= 0 && inp - availDen[1] >= 0 && inp - availDen[0] >= 0) {
                    num5++;
                    inp -= availDen[5];
                } else if (!(inp - availDen[9] >= 0) && !(inp - availDen[8] >= 0) && !(inp - availDen[7] >= 0) && !(inp - availDen[6] >= 0) && !(inp - availDen[5] >= 0) && inp - availDen[4] >= 0 && inp - availDen[3] >= 0 && inp - availDen[2] >= 0 && inp - availDen[1] >= 0 && inp - availDen[0] >= 0) {
                    num1++;
                    inp -= availDen[4];
                } else if (!(inp - availDen[9] >= 0) && !(inp - availDen[8] >= 0) && !(inp - availDen[7] >= 0) && !(inp - availDen[6] >= 0) && !(inp - availDen[5] >= 0) && !(inp - availDen[4] >= 0) && inp - availDen[3] >= 0 && inp - availDen[2] >= 0 && inp - availDen[1] >= 0 && inp - availDen[0] >= 0) {
                    num025++;
                    inp -= availDen[3];
                } else if (!(inp - availDen[9] >= 0) && !(inp - availDen[8] >= 0) && !(inp - availDen[7] >= 0) && !(inp - availDen[6] >= 0) && !(inp - availDen[5] >= 0) && !(inp - availDen[4] >= 0) && !(inp - availDen[3] >= 0) && inp - availDen[2] >= 0 && inp - availDen[1] >= 0 && inp - availDen[0] >= 0) {
                    num010++;
                    inp -= availDen[2];
                } else if (!(inp - availDen[9] >= 0) && !(inp - availDen[8] >= 0) && !(inp - availDen[7] >= 0) && !(inp - availDen[6] >= 0) && !(inp - availDen[5] >= 0) && !(inp - availDen[4] >= 0) && !(inp - availDen[3] >= 0) && !(inp - availDen[2] >= 0) && inp - availDen[1] >= 0 && inp - availDen[0] >= 0) {
                    num005++;
                    inp -= availDen[1];
                } else if (!(inp - availDen[9] >= 0) && !(inp - availDen[8] >= 0) && !(inp - availDen[7] >= 0) && !(inp - availDen[6] >= 0) && !(inp - availDen[5] >= 0) && !(inp - availDen[4] >= 0) && !(inp - availDen[3] >= 0) && !(inp - availDen[2] >= 0) && !(inp - availDen[1] >= 0) && inp - availDen[0] >= 0) {
                    num001++;
                    inp -= availDen[0];
                } else if (!(inp - availDen[9] >= 0) && !(inp - availDen[8] >= 0) && !(inp - availDen[7] >= 0) && !(inp - availDen[6] >= 0) && !(inp - availDen[5] >= 0) && !(inp - availDen[4] >= 0) && !(inp - availDen[3] >= 0) && !(inp - availDen[2] >= 0) && !(inp - availDen[1] >= 0) && !(inp - availDen[0] >= 0)) {
                    break;
                }
            }
            //Lines 51 to 75 round the resulting outputs for cleaner looking output
            String num100Time = moneyPlace.format(100*num100);
            String num50Time = moneyPlace.format(50*num50);
            String num20Time = moneyPlace.format(20*num20);
            String num10Time = moneyPlace.format(10*num10);
            String num5Time = moneyPlace.format(5*num5);
            String num1Time = moneyPlace.format(num1);
            String num025Time = moneyPlace.format(0.25*num025);
            String num010Time = moneyPlace.format(0.1*num010);
            String num005Time = moneyPlace.format(0.05*num005);
            String num001Time = moneyPlace.format(0.01*num001);
            double num100TimeDbl = Double.parseDouble(num100Time);
            double num50TimeDbl = Double.parseDouble(num50Time);
            double num20TimeDbl = Double.parseDouble(num20Time);
            double num10TimeDbl = Double.parseDouble(num10Time);
            double num5TimeDbl = Double.parseDouble(num5Time);
            double num1TimeDbl = Double.parseDouble(num1Time);
            double num025TimeDbl = Double.parseDouble(num025Time);
            double num010TimeDbl = Double.parseDouble(num010Time);
            double num005TimeDbl = Double.parseDouble(num005Time);
            double num001TimeDbl = Double.parseDouble(num001Time);
            double sum = num100TimeDbl + num50TimeDbl + num20TimeDbl + num10TimeDbl + num5TimeDbl + num1TimeDbl + num025TimeDbl + num010TimeDbl + num005TimeDbl + num001TimeDbl;
            String roundedSum = moneyPlace.format(sum);
            String roundedOriginalInp = moneyPlace.format(originalInp);
            double dblRoundedSum = Double.parseDouble(roundedSum);
            double dblRoundedOriginalInp = Double.parseDouble(roundedOriginalInp);
            //If an error in the system occurs, lines 77 to 80 cover it by increasing a few values.
            if (dblRoundedSum != dblRoundedOriginalInp) {
                num001++;
                num001TimeDbl += 0.01;
            }
            //Lines 82 to 92 print the output.
            System.out.println("$100: " + num100);
            System.out.println("$50: " + num50);
            System.out.println("$20: " + num20);
            System.out.println("$10: " + num10);
            System.out.println("$5: " + num5);
            System.out.println("$1: " + num1);
            System.out.println("$0.25: " + num025);
            System.out.println("$0.10: " + num010);
            System.out.println("$0.05: " + num005);
            System.out.println("$0.01: " + num001);
            System.out.println(num100TimeDbl + " + " + num50TimeDbl + " + " + num20TimeDbl + " + " + num10TimeDbl + " + " + num5TimeDbl + " + " + num1TimeDbl + " + " + num025TimeDbl + " + " + num010TimeDbl + " + " + num005TimeDbl + " + " + num001TimeDbl + " = " + originalInp + " (IF ONE OF THE ADDENDS HAVE MORE THAN 2 DECIMALS, ONLY LOOK AT THE TENTHS AND HUNDREDTHS PLACES)");
    }
    //Lines 95 to 134 are the method for giving uniform bills (at least one of each possible denomination).
    public static void uniformBills(double inp) {
        //Line 97 lists the denominations that are less than or equal to the input. Line 98 lists the variables in which the values are stored in.
        ArrayList<Double> fitsInp = new ArrayList<Double>();
        ArrayList<Integer> arrListVars = new ArrayList<Integer>();
        //Line 100 is the sum that is taken out of inp to be run into the next step. (More on this later).
        double sum = 0;
        //Line 102 is the new input that gets passed on to the next step (More on this later).
        double newInp;
        //Lines 104 to 109 put the values into the ArrayLists.
        for (int i = 0; i < availDen.length; i++) {
            if (availDen[i] <= inp) {
                fitsInp.add(availDen[i]);
                arrListVars.add(numVars[i]);
            }
        }  
        //Lines 111 to 114 increase the values of the variables and increases the sum
        for (int j = 0; j < arrListVars.size(); j++) {
            sum += availDen[j];
            numVars[j]++;
        }
        //Line 116 decreases the value of the last index
        numVars[(arrListVars.size()-1)]--;
        //Line 118 decreases sum by the last value of availDen
        sum -= availDen[(arrListVars.size()-1)];
        //Sets the value of newInp
        newInp = inp-sum;
        //Lines 112 to 131Sets the global variables to each value in numVars
        num001 = numVars[0];
        num005 = numVars[1];
        num010 = numVars[2];
        num025 = numVars[3];
        num1 = numVars[4];
        num5 = numVars[5];
        num10 = numVars[6];
        num20 = numVars[7];
        num50 = numVars[8];
        num100 = numVars[9];
        //Calls the LeastNumOfBills method with newInp and inp. This is the "next step" that was mentioned in line 99 and 101.
        LeastNumOfBills(newInp, inp);
    }
    public static void main(String[] args) {
        //Lines 137 to 139 ask how much money the user wants to withdraw
        Scanner withdrawAmt = new Scanner(System.in);
        System.out.println(YELLOW + "How much money do you want to withdraw? (DO NOT ENTER MORE THAN 2 DECIMAL PLACES EX: ###.##): " + RESET);
        double moneyAns = withdrawAmt.nextDouble();
        //Lines 131 to 143 check what type of withdrawl the user wants to do
        Scanner whatType = new Scanner(System.in);
        System.out.println(YELLOW + "Enter 1 for UNIFORM bills and enter 2 for LEAST amount of bills" + RESET);
        int dispenseType = whatType.nextInt();
        //Lines 145 to 149 call a method depending on the response from the last input
        if (dispenseType == 1) {
            uniformBills(moneyAns);
        } else if (dispenseType == 2) {
            LeastNumOfBills(moneyAns, moneyAns);
        }
    }
}
