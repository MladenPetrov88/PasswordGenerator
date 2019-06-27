import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        for (int firstNumber = 1; firstNumber < n; firstNumber++) {
            for (int secondNumber = 1; secondNumber < n; secondNumber++) {
                for (char firstLetter = 'a'; firstLetter < 'a' + l; firstLetter++) {
                    for (char secondLetter = 'a'; secondLetter < 'a' +l; secondLetter++) {
                        for (int thirdNumber = 1; thirdNumber <= n; thirdNumber++){
                            if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
                                System.out.printf("%d%d%c%c%d ", firstNumber, secondNumber, firstLetter, secondLetter, thirdNumber);
                            }
                        }
                    }
                }
            }
        }
    }
}
