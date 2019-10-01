import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
    public String SumAndGreaterThan10(int[] arr) {
        int sum = 0;
        ArrayList<Integer> greaterThan10 = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(arr[i] > 10) {
                greaterThan10.add(arr[i]);
            }
        }
        return ("Sum: " + sum + " Array: " + greaterThan10);
    }

    public void ShuffleNamesAndGreaterThan5(String[] arr) {
        ArrayList<String> shuffledArr = new ArrayList<String>();
        ArrayList<String> greaterThan5 = new ArrayList<String>();
        for(int i = 0; i < arr.length; i++) {
            shuffledArr.add(arr[i]);
        }
        Collections.shuffle(shuffledArr);
        System.out.println(shuffledArr);
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() > 5) {
                greaterThan5.add(arr[i]);
            }
        }
        System.out.println(greaterThan5);
    }

    public void ShuffleAlphabet(char[] alphabet, char[] vowels) {
        ArrayList<Character> shuffledAlph = new ArrayList<Character>();
        for(int i = 0; i < alphabet.length; i++) {
            shuffledAlph.add(alphabet[i]);
        }
        Collections.shuffle(shuffledAlph);
        System.out.println(shuffledAlph.get(25));
        System.out.println(shuffledAlph.get(0));
        for(int i = 0; i < vowels.length; i++) {
            if(shuffledAlph.get(0) == vowels[i]) {
                System.out.println("You have a vowel!");
            }
        }
    }

    public int[] RandomArray() {
        int[] randArr = new int[10];
        Random r = new Random();
        for(int i = 0; i < randArr.length; i++) {
            randArr[i] = r.nextInt((100 - 55) + 1) + 55;
        }
        return randArr;
    }

    public void SortedRandomArray() {
        int[] randArr = new int[10];
        ArrayList<Integer> randList = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 0; i < randArr.length; i++) {
            randArr[i] = r.nextInt((100 - 55) + 1) + 55;
            randList.add(randArr[i]);
        }
        Collections.sort(randList);
        System.out.println(randList);
        System.out.println("" + randList.get(0) + " " + randList.get(9));
    }

    public void RandomString(char[] alphabet) {
        String str = new String();
        Random r = new Random();
        for(int i = 0; i < 5; i++) {
            str += alphabet[r.nextInt(alphabet.length)];
        }
        System.out.println(str);
    }

    public String[] RandomArrayWithRandomStrings(char[] alphabet) {
        String[] randStrArr = new String[10];
        Random r = new Random();
        for(int i = 0; i < randStrArr.length; i++) {
            randStrArr[i] = "";
            for(int j = 0; j < 5; j++) {
                randStrArr[i] += alphabet[r.nextInt(alphabet.length)];
            }
        }
        return randStrArr;
    }
}