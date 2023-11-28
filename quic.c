#include <stdio.h>

void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

int partition(int arr[], int low, int high) {
    int pivot = arr[low];  
    int end = low;

    for (int j = low + 1; j <= high; j++) {
        if (arr[j] < pivot) {
            end++;
            swap(arr, end, j);
        }
    }
    swap(arr, low, end);  
        return end;
}

void quickSort(int arr[], int low, int high) {
    if (low < high) {
        int q = partition(arr, low, high);

        quickSort(arr, low, q - 1);
        quickSort(arr, q + 1, high);
    }
}

void main() {
    int limit, i;
    printf("Enter the limit: ");
    scanf("%d", &limit);
    int a[limit];
    
    printf("Enter the numbers to be sorted:\n");
    for (i = 0; i < limit; i++) {
        scanf("%d", &a[i]);
    }

    quickSort(a, 0, limit - 1);

    printf("Sorted array: ");
    for (i = 0; i < limit; i++) {
        printf("%d ", a[i]);
    }

}
