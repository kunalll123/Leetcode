import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String s) {
        // Map to store the values of Roman numerals
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Traverse the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanMap.get(s.charAt(i));

            // If current value is less than the previous, subtract it
            if (currValue < prevValue) {
                total -= currValue;
            } else {
                total += currValue;
            }

            // Update previous value
            prevValue = currValue;
        }

        return total;
    }

    // Test cases
    public static void main(String[] args) {
        RomanToInt converter = new RomanToInt();

        System.out.println(converter.romanToInt("III"));      // Output: 3
        System.out.println(converter.romanToInt("LVIII"));    // Output: 58
        System.out.println(converter.romanToInt("MCMXCIV"));  // Output: 1994
    }
}

