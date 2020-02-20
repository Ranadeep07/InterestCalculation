/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication30;

/**
 *
 * @author RANADEEP
 */
import java.util.*;

    /**
     * @param args the command line arguments
     */
class JavaApplication30
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Choice:\n1.Simple Interest\n2.Compound Interest\n");
                SimpleIntersetCalculation obj1=new SimpleIntersetCalculation();
                CompoundInterest obj2=new CompoundInterest();
                int choice=sc.nextInt();
                
        switch(choice)
        {
            
            case 1:
                    
                    System.out.println(obj1.Int_calc());
                    break;
            case 2:
                    
                    System.out.println(obj2.Comp_interest());
                    break;
        }
        
        
        
    }
}
class SimpleIntersetCalculation
{
    public double Int_calc()
    {
        double Interest;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Principle Amount : ");
        double PrincipleAmount=sc.nextDouble();
        System.out.println("Enter Years: ");
        float time=sc.nextFloat();
        System.out.println("Enter Interest Rate: ");
        float InterestRate=sc.nextFloat();
        Interest =(PrincipleAmount*time*InterestRate)/100;
        return Interest;
    }
}
class CompoundInterest
{
    public double Comp_interest()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle: ");
        double principle =sc.nextDouble();
        System.out.println("Enter Interest rate: ");
        float Interestrate=sc.nextFloat();
        System.out.println("Enter time: ");
        float time =sc.nextFloat();
        
  
        /* Calculate compound interest */
        double CI = principle * 
                    (Math.pow((1 + Interestrate / 100), time)); 
          
        return  CI; 
    }
}



 
