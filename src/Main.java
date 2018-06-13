
/**
 * An equilibrium index of an array (sequence) is an index such that the sum of elements at lower indexes
 * is equal to the sum of elements at higher indexes.
 *
 * Test Class
 */
public class Main {

    public static void main(String[] args) {

        int[] array_1 = {-7, 1, 5, 2, -4, 3, 0};
        int[] array_2 = {4, 3, 2, 1, 0, 1, 2, 3, 4};
        int[] array_3 = {-4, 3, -2, 1, 0, -1, 2, 3, -4};
        int[] array_4 = {1, 0, 1, 2};
        int[] array_5 = {10, 200, 30, 400, 50, 60, 70, 80, 90, 0, 90, 80, 70, 60, 50, 400, 30, 200, 10 };

        EquilibriumIndex.findEquilibriumIndex(array_1);
        EquilibriumIndex.findEquilibriumIndex(array_2);
        EquilibriumIndex.findEquilibriumIndex(array_3);
        EquilibriumIndex.findEquilibriumIndex(array_4);
        EquilibriumIndex.findEquilibriumIndex(array_5);
    }
}
