import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        int[] numArray = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        String[] namesArr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        PuzzleJava puzzle = new PuzzleJava();

        System.out.println(puzzle.SumAndGreaterThan10(numArray));

        System.out.println();

        puzzle.ShuffleNamesAndGreaterThan5(namesArr);

        System.out.println();

        puzzle.ShuffleAlphabet(alphabet, vowels);

        System.out.println();

        int[] randArr = puzzle.RandomArray();
        System.out.println(Arrays.toString(randArr));

        System.out.println();

        puzzle.SortedRandomArray();

        System.out.println();

        puzzle.RandomString(alphabet);

        System.out.println();

        String[] randStrArr = puzzle.RandomArrayWithRandomStrings(alphabet);
        System.out.println(Arrays.toString(randStrArr));
    }
}