import java.util.Arrays;
public class InitializingArrays {
    public static void main(String[] args) {
        // im going to create 2 ints, one with value, one assigned value later.
        int [] array1 = {1, 2, 3, 4, 5};

        int [] array2 = new int[5];
        array2[0] = 1;
        array2[1] = 5;
        array2[3] = 7;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }
}
