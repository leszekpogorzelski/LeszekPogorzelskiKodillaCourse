package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.Calculator.Calculator;
public class TestingMain {
    public static void main (String[] args){

            //Test SimpleUser.
                SimpleUser simpleUser = new SimpleUser("theForumUser");

                String result = simpleUser.getUsername();
                        if(result.equals("theForumUser")) {
                            System.out.println("Test ok!");
                        }
                        else {
                            System.out.println("Error!");
                        }
            //Test kalkulatora.
            Calculator calculator = new Calculator(5,3);
                    int wynik1 = calculator.add();
                        int wynik2 = calculator.subtract();
                        if(wynik1 == 8 && wynik2 == 2) {
                            System.out.println("Test kalkulatora ok!");
                        }
                        else {
                            System.out.println("Error kalkulatora!");
                        }


    }
}
