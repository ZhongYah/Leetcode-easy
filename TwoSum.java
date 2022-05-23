package work;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = new int[] {2, 3, 7, 4, 8};
        int target = 7;
        int[] result = twoSum(numbers, target);
        System.out.print(result[0]+" "+result[1]);
    }
    
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
}

/*  public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer>visitedNumbers = new HashMap<>();
        for (int i=0; i<numbers.length; i++){
            int delta = target-numbers[i];
            if (visitedNumbers.containsKey(delta)) {
                return new int[] {i, visitedNumbers.get(delta)};
            }
            visitedNumbers.put(numbers[i], i);
        }
        return new int[] {-1, -1};
    }*/