import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        String[] nk = scanner.nextLine().split(" ");

        int array_size = Integer.parseInt(nk[0]);
        int rotation_count = Integer.parseInt(nk[1]);

        String[] array_string= scanner.nextLine().split(" ");

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] array_int = new int[array_size];

        for (int i = 0; i<array_size; i++) {

            array_int[i] = Integer.parseInt(array_string[i]);

        }

        scanner.close();

        System.out.println("size : " + array_size + " rotation : " + rotation_count );

        System.out.println(Arrays.toString(array_int));

        rotate(array_int, array_size, rotation_count);

    }

    public static void rotate (int[] array_int, int array_size, int rotation_count) {

        System.out.println("Rotate");

        int[] new_array_int = new int[array_size];

        for(int i=0; i<array_size; i++){

            new_array_int[(i-rotation_count+array_size)%array_size]= array_int[i];

        }

        System.out.println(Arrays.toString(new_array_int));
    }

}
