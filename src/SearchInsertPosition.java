public class SearchInsertPosition {
    static class Main{
        public static void main(String[] args) {
            int result = new SearchInsertPosition().searchInsert(new int[]{1,3,5,6}, 7);
            System.out.println("result : " + result);
        }
    }

    public int searchInsert(int[] nums, int target) {
        return binarySearch(0, nums.length, nums, target);
    }

    private int binarySearch(int start, int end, int[] arr, int target){

        if(start > end || start >= arr.length || end < 0){
            return start;
        }

        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] < target){
            return binarySearch(mid+1, end, arr, target);
        }else{
            return binarySearch(start, mid-1, arr, target);
        }
    }
}
