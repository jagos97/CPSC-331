//Julio Agostini 30049674
//Edmund Sayson 30047166
//Shardar Quraishi 30045559


package cpsc331.A1;

public class Hufflepuff{

    //This class performs an optimized execution of the Hufflepuff Number algorithim
    //An integer input n >= 0 is expected from the command line for it to execute.
    // If input other than n is given then algorithim won't execute and will be
    // told what needs to be given for it to work

    // main function that reads input from the command line and if input n
    // is given then eval will execute and print it out on command line.
    public static void main(String[] args){

        if (args.length == 1){
         
        try{
            int n = Integer.parseInt(args[0]);
                System.out.println(eval(n));
        }
            catch (NumberFormatException e){
                System.out.println("Silly muggle! One integer input is required.");
            }
            catch (IllegalArgumentException e){
                //Assertion: n < 0
                System.out.println("Silly muggle! The integer input cannot be negative.");
            }

        }

        else{
            System.out.println("Silly muggle! One integer input is required.");
        }
    }  

    public static int eval(int n){
    //Asertion: n is an integer input
        if(n < 0){
            //Asertion: n < 0
            throw new IllegalArgumentException();
        }

        else if (n == 0) {
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

            //bound function: n - i
            //loop invariants: 
                            //1. n is an integer input such that n ≥ 4
                            //2. i is an integer such that 3 ≤ i ≤ n
                            //3. Abra is the ith -1 hufflepuff number
		                    //4. Kadabra is the ith hufflepuff number
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