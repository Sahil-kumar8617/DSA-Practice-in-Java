public class Leet66OnePlus {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        // If all digits are 9, create a new array with 1 at the front
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
