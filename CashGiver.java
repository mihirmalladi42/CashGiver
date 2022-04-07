import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
public class CashGiver {
    public static final String RED = "\u001B[31m", GREEN = "\u001B[32m", RESET = "\u001B[0m", YELLOW = "\u001B[33m";
    public static double[] availDen = {0.01, 0.05, 0.10, 0.25, 1, 5, 10, 20, 50, 100};
    public static int num100 = 0, num50 = 0, num20 = 0, num10 = 0, num5 = 0, num1 = 0, num025 = 0, num010 = 0, num005 = 0, num001 = 0;
    public static int[] numVars = {num001, num005, num010, num025, num1, num5, num10, num20, num50, num100};
    public static double leftover;
    public static void LeastNumOfBills(double inp, double originalInp) {
        DecimalFormat moneyPlace = new DecimalFormat("#.##");
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
            if (dblRoundedSum != dblRoundedOriginalInp) {
                num001++;
                num001TimeDbl += 0.01;
            }

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
    public static void uniformBills(double inp) {
        ArrayList<Double> fitsInp = new ArrayList<Double>();
        ArrayList<Integer> arrListVars = new ArrayList<Integer>();
        double sum = 0;
        double newInp;
        int indexAvailDen = -1;
        for (int i = 0; i < availDen.length; i++) {
            if (availDen[i] <= inp) {
                fitsInp.add(availDen[i]);
                arrListVars.add(numVars[i]);
            }
        }  
        for (int j = 0; j < arrListVars.size(); j++) {
            sum += availDen[j];
            numVars[j]++;
        }
        numVars[(arrListVars.size()-1)]--;
        sum -= availDen[(arrListVars.size()-1)];
        newInp = inp-sum;
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
        LeastNumOfBills(newInp, inp);
    }
    public static void main(String[] args) {
        Scanner withdrawAmt = new Scanner(System.in);
        System.out.println(YELLOW + "How much money do you want to withdraw? (DO NOT ENTER MORE THAN 2 DECIMAL PLACES EX: ###.##): " + RESET);
        double moneyAns = withdrawAmt.nextDouble();
        Scanner whatType = new Scanner(System.in);
        System.out.println(YELLOW + "Enter 1 for UNIFORM bills and enter 2 for LEAST amount of bills" + RESET);
        int dispenseType = whatType.nextInt();
        if (dispenseType == 1) {
            uniformBills(moneyAns);
        } else if (dispenseType == 2) {
            LeastNumOfBills(moneyAns, moneyAns);
        }
    }
}
