#include <stdio.h>
void swap();
void quickSort();
int partition();
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

void swap(int a[], int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}

int partition(int a[], int low, int high) {
    int pivot = a[low];  
    int end = low;

    for (int j = low + 1; j <= high; j++) {
        if (a[j] < pivot) {
            end++;
            swap(a, end, j);
        }
    }
    swap(a, low, end);  
        return end;
}

void quickSort(int a[], int low, int high) {
    if (low < high) {
        int q = partition(a, low, high);

        quickSort(a, low, q - 1);
        quickSort(a, q + 1, high);
    }
}
