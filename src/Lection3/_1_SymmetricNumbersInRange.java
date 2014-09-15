package Lection3;

import java.util.Scanner;

public class _1_SymmetricNumbersInRange {

	public static void main(String[] args) {
		System.out.print("Please enter two number separeted by space:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
       
        String firstNum = "";
        String secondNum = "";
        String currentNum = "";

        for (int i = a; i <= b; i++) { 
               
                currentNum = Integer.toString(i);
               
                firstNum = currentNum.substring(0, currentNum.length()/2);
                secondNum = currentNum.substring(currentNum.length()/2+currentNum.length()%2, currentNum.length());
               
                if (firstNum.equals(secondNum)) {
                        System.out.print(currentNum + " ");
                }
        }
	}

}
