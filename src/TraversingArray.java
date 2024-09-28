import java.util.Arrays;
public class TraversingArray {
    public static void main(String[] args) {
        int[] arr = {39, 495, 239, 2, 595, 3};
        System.out.println("Traversing a loop");
        // runs loop, so there is a sout statement for each index
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}

