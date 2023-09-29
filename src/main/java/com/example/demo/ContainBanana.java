package main.java.com.example.demo;

public class ContainBanana {

    public static void main(String[] args) {
        String S ="naabxxannaabxxan";
        System.out.println(containBanana(S));
    }

    private static int containBanana(String str) {
        int countB = 0;
        int countA = 0;
        int countN = 0;

        // Initialize the maximum number of moves
        int maxMoves = 0;

        // Convert the input string to uppercase for case insensitivity
        str = str.toUpperCase();

        // Iterate through the characters in the string
        for (char c : str.toCharArray()) {
            switch (c) {
                case 'B':
                    countB++;
                    break;
                case 'A':
                    countA++;
                    break;
                case 'N':
                    countN++;
                    break;
            }

            // Check if we have enough counts of each letter to make a move
            while (countB >= 1 && countA >= 3 && countN >= 2) {
                maxMoves++;
                countB--;
                countA -= 3;
                countN -= 2;
            }
        }

        return maxMoves;
    }
}
