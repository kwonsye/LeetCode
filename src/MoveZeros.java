import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {
    static class Main{
        public static void main(String[] args) {
            int[] input1 = new int[]{0,1,0,3,12};
            new MoveZeros().moveZeroesWithList(input1);
            System.out.println("result 1 : " + Arrays.toString(input1));

            int[] input2 = new int[]{0,1,0,3,12};
            new MoveZeros().moveZeroesWithIndex(input2);
            System.out.println("result 2 : " + Arrays.toString(input2));
        }
    }

    private void moveZeroesWithIndex(int[] nums) {
        int newIndex = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[newIndex] = nums[i];
                newIndex++;
            }
        }

        for(; newIndex < nums.length; newIndex++){
            nums[newIndex] = 0;
        }
    }

    public void moveZeroesWithList(int[] nums) {
        List<Integer> results = new ArrayList<>();

        int numOfZeros=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                numOfZeros++;
            }else{
                results.add(nums[i]);
            }
        }

        for(int i=0; i<numOfZeros; i++) results.add(0);

        for(int i=0; i<nums.length; i++){
            nums[i] = results.get(i);
        }
    }
}
