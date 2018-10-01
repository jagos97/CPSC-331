package cpsc331.A1;

public class Hufflepuff{

    //This class performs an optimized execution of the Hufflepuff Number algorithim
    //An integer input n >= 0 is expected from the command line for it to execute.
    // If input other than n is given then algorithim won't execute and will be
    // told what needs to be given for it to work

    // main function that reads input from the command line and if input n
    // is given then eval will execute and print it out on command line.
    public static void main(String[] args){
         
        try{
            int n = Integer.parseInt(args[0]);
            if (n < 0 ){
                //Assertion: n < 0
                System.out.println("Silly muggle! The input integer cannot be negative.");
            }
            else{
                System.out.println(eval(n));
            }
        }
            catch (NumberFormatException e){
                System.out.println("Silly muggle! One integer input is required.");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Silly muggle! One integer input is required.");
            }

    }  

    public static int eval(int n){
    //Assertion: A non-negative integer n has been given as input
        if (n == 0) {
        //Assertion: n = 0
            return 10;
        }
        else if (n == 1) {
        //Assertion n = 1
            return 9;
        }
        else if (n == 2) {
        //Assertion: n = 2
            return 8;
        }
        else if (n == 3) {
        //Assertion: n = 3
            return 7;
        } 
        else {
            //Asserion n >= 4
            int hocus = 10;
            int pocus = 9;
            int abra = 8;
            int kadabra = 7;
            int i = 3;

            //bound function: 
            //loop invariants:
            while (i < n) {
                int shazam = 4 * kadabra - 6 * abra + 4 * pocus - hocus;
                hocus = pocus;
                pocus = abra;
                abra = kadabra;
                kadabra = shazam;
                i = i + 1;
            }
            return kadabra;
            //The nth Hufflepuff number has been returned as input.
        }
    }



}