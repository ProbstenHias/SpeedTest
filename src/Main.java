import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        var start = System.nanoTime();
        int [] array = new int[25000000];
        Arrays.fill(array, -1);
        var end = System.nanoTime();
        System.out.println("Time in sec: " + (end-start)/1e9);
    }
}
