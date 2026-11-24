public class ThreeDigits {
    public static void main(String[] args) {
        for (int count = 1; count <= 9; count++) {

            for (int index = 0; index <= 9; index++) {

                for (int digit = 0; digit <= 9; digit++) {
                    int number = (count * 100) + (index * 10) + units;
                    int sumOfSquares = (count * count) + (index * index) + (digit * digit);
                    
                    if (sumOfSquares == number) {
                        System.out.println(number);
                    }
                    else {
                   	System.out.println("Invalid")
                }
            }
        }
    }
}

