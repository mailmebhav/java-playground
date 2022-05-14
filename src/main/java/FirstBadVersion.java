package main.java;

public class FirstBadVersion {
    int bad = 4;
    int count = 0;
    public static void main(String[] args) {
        int n = 5;
        FirstBadVersion firstBadVersion = new FirstBadVersion();
        int res = firstBadVersion.firstBadVersionFunc(n);
        System.out.println(res);
        System.out.println("calls " + firstBadVersion.count);
    }


    public boolean isBadVersion(int version) {
        count++;
        if(version >= bad) {
            return true;
        } else {
            return false;
        }
    }

    public int firstBadVersionFunc(int n) {
        int l = 1;
        int r = n;
        if(n == 1) {
            return 1;
        }
        while (l <= r){
            int m = l + (r-l)/2;
            if(isBadVersion(m)) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return l;
    }
}
