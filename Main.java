package com.company;

class Bank{
        double getRateOfInterest(){
            return 0;
        }
    }
     class SBI extends Bank{
        double getRateOfInterest(){
            return 8.4;
        }
    }
     class ICICI extends Bank{
        double getRateOfInterest(){
            return 7.3;
        }
    }
     class AXIZ extends Bank{
        double getRateOfInterest(){
            return 9.7;
        }
    }

public class Main {
    public static void main(String[] args) {
	   Bank b;
	   b=new SBI();
       System.out.println("SBI : " + b.getRateOfInterest());
       b=new ICICI();
       System.out.println("ICICI : " + b.getRateOfInterest());
       b=new AXIZ();
       System.out.println("AXIZ : " + b.getRateOfInterest());

    }
}
