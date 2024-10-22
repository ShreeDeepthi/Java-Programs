import java.util.Scanner;

class MagicStringGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input array
        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }

        // Step 1: Generate magicArray
        MagicArray magicArray = new MagicArray(inputArray);
        int[] magicArr = magicArray.generateMagicArray();

        // Step 2: Count even, odd, prime elements in input array and magicArray
        ElementCounter elementCounter = new ElementCounter(inputArray, magicArr);
        int[] counts = elementCounter.countElements();

        // Step 3: Merge counts into strings
        StringMerger stringMerger = new StringMerger(counts);
        String inputString = stringMerger.mergeInputString();
        String magicArrayString = stringMerger.mergeMagicArrayString();

        // Step 4: Create magic number
        MagicNumberGenerator magicNumberGenerator = new MagicNumberGenerator(inputString, magicArrayString);
        String magicNumber = magicNumberGenerator.generateMagicNumber();

        // Step 5: Create magic string
        MagicStringCreator magicStringCreator = new MagicStringCreator(inputArray, magicArr, magicNumber);
        String magicString = magicStringCreator.createMagicString();

        System.out.println("Magic String: " + magicString);

        scanner.close();
    }
}

class MagicArray {
    private int[] inputArray;

    public MagicArray(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public int[] generateMagicArray() {
        // Implementation of magicArray generation as described
        // Return magicArray
        return new int[] {11, 9, 3, 3}; // Placeholder, replace with actual logic
    }
}

class ElementCounter {
    private int[] inputArray;
    private int[] magicArray;

    public ElementCounter(int[] inputArray, int[] magicArray) {
        this.inputArray = inputArray;
        this.magicArray = magicArray;
    }

    public int[] countElements() {
        // Implementation of counting even, odd, prime elements in input array and magicArray
        // Return counts
        return new int[] {3, 2, 2}; // Placeholder, replace with actual logic
    }
}

class StringMerger {
    private int[] counts;

    public StringMerger(int[] counts) {
        this.counts = counts;
    }

    public String mergeInputString() {
        // Implementation of merging counts into input string
        // Return inputString
        return "322"; // Placeholder, replace with actual logic
    }

    public String mergeMagicArrayString() {
        // Implementation of merging counts into magicArray string
        // Return magicArrayString
        return "043"; // Placeholder, replace with actual logic
    }
}

class MagicNumberGenerator {
    private String inputString;
    private String magicArrayString;

    public MagicNumberGenerator(String inputString, String magicArrayString) {
        this.inputString = inputString;
        this.magicArrayString = magicArrayString;
    }

    public String generateMagicNumber() {
        // Implementation of generating magic number
        // Return magicNumber
        return "365"; // Placeholder, replace with actual logic
    }
}

class MagicStringCreator {
    private int[] inputArray;
    private int[] magicArray;
    private String magicNumber;

    public MagicStringCreator(int[] inputArray, int[] magicArray, String magicNumber) {
        this.inputArray = inputArray;
        this.magicArray = magicArray;
        this.magicNumber = magicNumber;
    }

    public String createMagicString() {
        // Implementation of creating magic string
        // Return magicString
        return "fldgjgddfedk"; // Placeholder, replace with actual logic
    }
}
