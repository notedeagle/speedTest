import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Sortowanie {
    static Random r = new Random();

    public void bubbleSort(int[] arr) {
        Instant start = Instant.now();
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        Instant finish = Instant.now();
        long timeBubble = Duration.between(start, finish).toMillis();
        System.out.println("Czas wykonywania bubblesort to: " + timeBubble + "ms");

        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Użyta pamięć to: " + memory + " bytes");
    }

    public void quickSort(int[] arr) {
        Instant start = Instant.now();

        quickSortNext(arr, 0, arr.length - 1);

        Instant finish = Instant.now();
        long timeQuick = Duration.between(start, finish).toMillis();
        System.out.println("Czas wykonywania quicksort to: " + timeQuick + "ms");

        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Użyta pamięć to: " + memory + " bytes");
    }

    public void quickSortNext(int[] arr, int left, int right) {
        int i, j, x, y;
        i = left; j = right;
        x = arr[(left+right)/2];
        do {
            while((arr[i] < x) && (i < right)) i++;
            while((x < arr[j]) && (j > left)) j--;
            if(i <= j) {
                y = arr[i];
                arr[i] = arr[j];
                arr[j] = y;
                i++; j--;
            }
        } while(i <= j);
        if(left < j) quickSortNext(arr, left, j);
        if(i < right) quickSortNext(arr, i, right);
    }

    public void wypelnij(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
    }
}


