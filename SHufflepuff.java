//Julio Agostini 30049674
//Edmund Sayson 30047166
//Shardar Quraishi 30045559



package cpsc331.A1;

import java.util.InputMismatchException;

class SHufflepuff{

    //This class performs a simple execution of the Hufflepuff number algorithm
    //An integer input n >= 0 is expected from the command line for it to execute.
    // If input other than n is given then algorithim won't execute and will be
    // told what needs to be given for it to work

    
    // main function that reads input from the command line and if input n
    // is given then sHuffle will execute and print it out on command line.
    public static void main(String[] args){
         
        if (args.length == 1){

        try{
            int n = Integer.parseInt(args[0]);
                System.out.println(sHuffle(n));
            }
        
            catch (NumberFormatException e){
                System.out.println("Silly muggle! One integer input is required.");
            }

            catch (IllegalArgumentException e){
                System.out.println("Silly muggle! The integer input cannot be negative.");
            }
        }

        else{
            System.out.println("Silly muggle! One integer input is required.");
        }

    }  
    protected static int sHuffle(int n){
        //Asertion: n is an integer input
        if (n < 0){
            //Asertion: n < 0
            throw new IllegalArgumentException();
        }
        // Asertion: n is an integer input such that n >= 0

        else if(n == 0){
            //Assertion: n == 0
            return 10;
        }

        else if(n == 1){
            //Assertion: n == 1
            return 9;
        }
        
        
        else if(n == 2){
            //Assertion: n == 2
            return 8;
        }

        
        else if(n == 3){
            //Assertion: n == 3
            return 7;
        }

        //bound function= n
        else{
            //Assertion: n >= 4
            return 4 * sHuffle(n-1) - 6 * sHuffle(n-2) + 4 * sHuffle(n-3) - sHuffle(n-4);

            //Assertion: the nth Hufflepuff number has been returned as output
        }
    }
    

}
