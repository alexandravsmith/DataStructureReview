public class TimeComplexity {
    // 0(1) - constant time. ex: accessing first element in an array
    public static int getFirstElement(int[] array) {
        return array[0];
    }

    //0(n) linear growth time: adding the sum of an array
    // i = index
    public static int sumArray(int [] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] array = {15, 30, 45, 60, 75};
        System.out.println("The sum of the array is " + sumArray(array));
        System.out.println("The first element of the array is " + getFirstElement(array));
    }
}
