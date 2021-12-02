public class FirstBadVersion extends VersionControl{
    static class Main{
        public static void main(String[] args) {
            int result = new FirstBadVersion(4).firstBadVersion(5);
            System.out.println("result : " + result);
        }
    }

    protected FirstBadVersion(int firstBadVersion) {
        super(firstBadVersion);
    }

    public int firstBadVersion(int n) {
        return binarySearch(1, n);
    }

    private int binarySearch(int start, int end){
        if(end == start){
            return start;
        }

        int mid = start + (end-start)/2;

        if(!isBadVersion(mid)){
            return binarySearch(mid+1, end);
        }else {
            return binarySearch(start, mid);
        }
    }
}

class VersionControl{
    int firstBadVersion;

    protected VersionControl(int firstBadVersion){
        this.firstBadVersion = firstBadVersion;
    }

    protected boolean isBadVersion(int n){
        return firstBadVersion == n;
    }
}


