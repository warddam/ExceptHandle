package WalkerCC_CompSci;

import java.util.*;


public class Main {
    public static void main(String arg[])
    {
        try
        {

            int num1,num2,Result;
            Scanner Divide=new Scanner(System.in);


            System.out.print("Enter numerator:");
            num1=Divide.nextInt();

            System.out.print("Enter denominator:");
            num2=Divide.nextInt();


            Result=num1/num2;
            System.out.println("Result:"+Result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error:"+e.getMessage());
            System.out.println("Error:"+e);
        }

        System.out.println("Bye");
    }
}