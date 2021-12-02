public class BinarySearch {
    static class Main{
        public static void main(String[] args) {
            int result = new BinarySearch().search(new int[]{-1,0,3,5,9,12}, 9);
            System.out.println("result : " + result);
        }
    }

    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length-1, nums, target);
    }

    private int binarySearch(int start, int end, int[] arr, int target){
        if(end < start) return -1;

        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] > target){
            return binarySearch(start, mid-1, arr, target);
        }else if(arr[mid] < target){
            return binarySearch(mid+1, end, arr, target);
        }

        return -1;
    }
}