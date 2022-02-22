import java.util.Arrays;

public class Task1000 {
    public static void main(String[] args) {
        double[] array = new double[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        array[50] = 0.050059918817297544;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index14 = Arrays.binarySearch(array, 0.050059918817297544);
        System.out.println(index14);
        System.out.println(array.length);


    }
}
