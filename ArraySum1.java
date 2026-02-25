class SumArray implements Runnable {
    int[] arr;
    int start, end;
    int partialSum = 0;

    SumArray(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public void run() {
        for(int i = start; i < end; i++) {
            partialSum += arr[i];
        }
        System.out.println("Partial Sum: " + partialSum);
    }
}

public class ArraySum1 {
    public static void main(String[] args) throws InterruptedException {
        
        int[] arr = {1, 2, 3, 4, 5, 6};

        SumArray obj1 = new SumArray(arr, 0, arr.length/2);
        SumArray obj2 = new SumArray(arr, arr.length/2, arr.length);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int totalSum = obj1.partialSum + obj2.partialSum;

        System.out.println("Total Sum: " + totalSum);
    }
}