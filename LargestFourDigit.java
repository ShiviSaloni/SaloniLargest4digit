public class LargestFourDigit {
        public static void main(String[] args) {
            int number = 9999;
            int lcm = 10 * 13;  
            int output = (number / lcm) * lcm;
            System.out.println("The four digit number that is divisible by this is: " + output);
    }
}