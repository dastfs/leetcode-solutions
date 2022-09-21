package Algo;

public class BinarySearch {
    int blnarySearch(int arr[], int x){
        int l = 0, r = arr.length - 1; // l = left, r = right

        while(l <= r){
            int mid = l + (r - l)/2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }

        return -1;
    }
}


//int l = 0;
//int r = length - 1;
//
//int m = l + (r - l)/ 2; cause (r+l)/2 can be overflow
