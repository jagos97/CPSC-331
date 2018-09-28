public class Hufflepuff{

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
    //Assertion: A non-negative integer n has been given as input.
        if (n == 0) {
            return 10;
        }
        else if (n == 1) {
            return 9;
        }
        else if (n == 2) {
            return 8;
        }
        else if (n == 3) {
            return 7;
        } 
        else {
            int hocus = 10;
            int pocus = 9;
            int abra = 8;
            int kadabra = 7;
            int i = 3;
            while (i < n) {
                int shazam = 4 * kadabra - 6 * abra + 4 * pocus - hocus;
                hocus = pocus;
                pocus = abra;
                abra = kadabra;
                kadabra = shazam;
                i = i + 1;
            }
            return kadabra;
        }
    }



}