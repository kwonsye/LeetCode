import java.util.Arrays;

public class RotateArray {
    static class Main{
        public static void main(String[] args) {
            int[] inputs1 = new int[]{1,2,3,4,5,6,7};
            new RotateArray().rotate(inputs1, 3);
            System.out.println("result 1: " + Arrays.toString(inputs1));

            int[] inputs2 = new int[]{1,2,3,4,5,6,7};
            new RotateArray().rotateWithRightRotation(inputs2, 3);
            System.out.println("result 2: " + Arrays.toString(inputs2));
        }
    }

    //100%
    private void rotateWithRightRotation(int[] nums, int k) {
        if(k  % nums.length == 0) return;

        k = k % nums.length;
        rightRotation(nums, 0, nums.length-1); // 7 6 5 4 3 2 1
        rightRotation(nums, 0, k-1); // 5 6 7 4 3 2 1
        rightRotation(nums, k, nums.length-1); // 5 6 7 1 2 3 4
    }

    private void rightRotation(int[] nums, int start, int end) {
        while(start < end){
            //swap
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int[] results = new int[nums.length];

        for(int i=0; i< nums.length; i++){
            int shiftIndex = (i+k) % nums.length;
            results[shiftIndex] = nums[i];
        }

        for(int i=0; i < results.length; i++){
            nums[i] = results[i];
        }
    }
}
