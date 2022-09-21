package Algo;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            swap(arr, i, findMinIndex(arr, i));
        }
    }

    public static int findMinIndex(int arr[], int index){
        int minIndex = index;
        int minValue = arr[index];
        for(int i = index + 1; i < arr.length; i++){
            if(arr[i] < minValue){
                minIndex = i;
                minValue = arr[i];
            }
        }
        return minIndex;
    }

    public static void swap(int arr[], int firstElement, int secondElement){
        int temp = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement] = temp;
    }
}
