import java.util.Scanner;

public class AishwaryaApproach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Convert input array to magicArray
        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int[] magicArray = convertToMagicArray(inputArray);

        // Step 2: Count even, odd, and prime elements in both arrays
        int evenCountInput = countEvenElements(inputArray);
        int oddCountInput = countOddElements(inputArray);
        int primeCountInput = countPrimeElements(inputArray);

        int evenCountMagic = countEvenElements(magicArray);
        int oddCountMagic = countOddElements(magicArray);
        int primeCountMagic = countPrimeElements(magicArray);

        // Step 3: Merge counts to form strings
        String inputString = mergeCountsToString(evenCountInput, oddCountInput, primeCountInput);
        String magicString = mergeCountsToString(evenCountMagic, oddCountMagic, primeCountMagic);

        // Step 4: Create magic number
        int magicNumber = createMagicNumber(inputString, magicString);

        // Step 5: Create magic string
        String magicStringFinal = createMagicString(inputArray, magicArray, magicNumber);

        System.out.println("Magic String: " + magicStringFinal);
    }

    private static int[] convertToMagicArray(int[] inputArray) {
        // Implementation omitted
        return null;
    }

    private static int countEvenElements(int[] array) {
        // Implementation omitted
        return 0;
    }

    private static int countOddElements(int[] array) {
        // Implementation omitted
        return 0;
    }

    private static int countPrimeElements(int[] array) {
        // Implementation omitted
        return 0;
    }

    private static String mergeCountsToString(int evenCount, int oddCount, int primeCount) {
        // Implementation omitted
        return null;
    }

    private static int createMagicNumber(String inputString, String magicString) {
        // Implementation omitted
        return 0;
    }

    private static String createMagicString(int[] inputArray, int[] magicArray, int magicNumber) {
        // Implementation omitted
        return null;
    }
}
