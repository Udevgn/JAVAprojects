import java.util.*;
class TestClass {
    class Heap{
        boolean max_heap;
        int size ;
        int arr[];
        int capacity;
        Heap(int capacity,boolean max_heap,int a[]){
            this.capacity = size;
            this.size = a.length;
            this.max_heap = max_heap;
            arr = new int[a.length];
            for(int i=0;i<a.length;i++)
                arr[i] =a[i];
            int index = (size-1)/2;
            while(index>=0){
                heapify(index);
                index--;
            }
        }
        public int extract(){
            if(size<0){
                System.out.println("Heap is Empty!!");
                return -1;
            }
            int temp = arr[0];
            arr[0] = arr[size-1];
            arr[--size] = 0;
            heapify(0);
            return temp;
        }
        void heapify(int index){
            int left = (2*index)+1;
            int right = (2*index)+2;
            if(left>=size && right>=size){
                return;
            }
            if(max_heap==true){
                int left_val = (left<size)?arr[left]:Integer.MIN_VALUE;
                int right_val = (right<size)?arr[right]:Integer.MIN_VALUE;
                int max = (right_val>left_val)?right_val:left_val;
                int max_index = (max==arr[left])?left:right;
                max = (arr[index]>max)?arr[index]:max;
                if(max!= arr[index]){
                    int temp = arr[max_index];
                    arr[max_index] = arr[index];
                    arr[index] = temp;
                    heapify(max_index);
                }
            }
            else if(max_heap !=true){
                int left_val = (left<size)?arr[left]:Integer.MAX_VALUE;
                int right_val = (right<size)?arr[right]:Integer.MAX_VALUE;
                int min = (right_val<left_val)?right_val:left_val;
                int min_index = (min==arr[left])?left:right;
                min = (arr[index]<min)?arr[index]:min;
                if(min != arr[index]){
                    int temp = arr[min_index];
                    arr[min_index] = arr[index];
                    arr[index] = temp;
                    heapify(min_index);
                }
            }
        }
        
        
    }
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];
        Random rand = new Random();
        for(int i=0;i<10;i++)
            arr[i] = in.nextInt();
        TestClass tc = new TestClass();
        TestClass.Heap minheap = tc.new Heap(arr.length,false,arr);
        System.out.println(Arrays.toString(minheap.arr));
        while(minheap.size>=0){
        System.out.println(minheap.extract());
        }
    }
}
