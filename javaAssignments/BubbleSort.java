package javaAssignments;

public class BubbleSort {
void bubbleSort(int array[])
{
	int n= array.length;
	for (int i = 0; i < n-1; i++)
		for (int j =0; j < n-i-1; j++)
			if (array[j] > array[j+1]) {
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;			
			}
}
void printArray(int array[])
{
	int n = array.length;
	for (int i =0; i<n; ++i)
		System.out.print(array[i] + " ");
	System.out.println();
}
public static void main(String[] args) {
	BubbleSort bs=new BubbleSort();
	int array[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	bs.bubbleSort(array);
	System.out.println("Sorted array");
	bs.printArray(array);
}
}
