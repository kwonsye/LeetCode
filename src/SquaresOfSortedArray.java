import java.util.Arrays;

public class SquaresOfSortedArray {
    static class Main{
        public static void main(String[] args) {
            int[] results = new SquaresOfSortedArray().sortedSquares(new int[]{-4,-1,0,3,10});
            System.out.println("result : " + Arrays.toString(results));
        }
    }

    public int[] sortedSquares(int[] nums) {
        int[] results = new int[nums.length];

        int left = 0;
        int right = nums.length-1;

        for(int i=nums.length-1; i>=0; i--){

            if(nums[left]*nums[left] >= nums[right]*nums[right]){
                results[i] = nums[left] * nums[left];
                left++;
            }else{
                results[i] = nums[right] * nums[right];
                right--;
            }
        }

        return results;
    }
}
