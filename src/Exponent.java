public class Exponent {
    public static double Exponent(double base, double exponent){
        /**
         * result must be 1 as all numbers can be divisible by 1
         */
        double result = 1;
        /**
         * Loop from 1 time to exponent times
         */
        for(int i = 1; i <= exponent; i++){
            /**
             * Multiply the result by the base
             */
            result = result * base;
        }
        /**
         * return the result
         */
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Exponent(2,3));
    }
}
