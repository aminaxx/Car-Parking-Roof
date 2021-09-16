import static java.lang.Math.min;
import java.util.Arrays;

public class Ex1 {

    static int carParkingRoof(int n, int[] cars, int k) {

        System.out.println(Arrays.toString(cars) + "\n");
        Arrays.sort(cars); // sorting and directly restoring it to the array
        System.out.println(Arrays.toString(cars) + "\n");

        int min_root_len = cars[n - 1]; // taking the last element of array
        int len = cars.length; // number of cars

        for (int i = 0; i + k - 1 < len; i++) // checking all positions
            min_root_len = Math.min(min_root_len, (cars[i + k - 1] - cars[i] + 1));

        return min_root_len;
    }

    public static void main(String[] args) {
        int cars[] = { 6, 2, 12, 7 };
        int k = 3;
        int n = cars.length;
        if (k > n) {
            System.out.println("Please try again");
        } else {
            System.out.println(
                    "Minimum length of a roof that can cover " + k + " cars is: " + carParkingRoof(n, cars, k));
        }
    }
}
