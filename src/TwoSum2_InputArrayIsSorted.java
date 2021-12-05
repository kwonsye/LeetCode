import java.util.Arrays;

public class TwoSum2_InputArrayIsSorted {
    static class Main{
        public static void main(String[] args) {
            int[] results = new TwoSum2_InputArrayIsSorted().twoSum(new int[]{2,3,4}, 6);
            System.out.println("result : " + Arrays.toString(results));
        }
    }

    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length-1;

        while(true){
            if(numbers[left] + numbers[right] == target){
                return new int[]{left+1, right+1};
            }

            if(numbers[left] + numbers[right] > target){
                right--;
            }else{
                left++;
            }
        }
    }
}
