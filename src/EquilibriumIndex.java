import java.util.Arrays;

/**
 * An equilibrium index of an array (sequence) is an index such that the sum of elements at lower indexes
 * is equal to the sum of elements at higher indexes.
 */
class EquilibriumIndex {
//--------------------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Constructor---------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Private Methods-----------------------------------------------------------------------------------------------------//
    /**
     * helper method to find the sum of the array
     *
     * @param array to iterate to find sum
     * @return sum of the array
     */
    private static long findSum(int[] array) {

        long temp = 0;

        // Find sum of the whole array
        for (int number : array) { temp += number; }

        return temp;
    }
//--------------------------------------------------------------------------------------------------------------------//

//Package Private Methods---------------------------------------------------------------------------------------------//
    /**
     * method to find equilibrium index
     *
     * @param array to iterate to find equilibrium index
     */
    static void findEquilibriumIndex(int[] array) {

        // totalSum will hold the sum of the whole array
        long totalSum = findSum(array);

        // leftSum will hold the sum of the left part of the array as we iterate the array
        long leftSum = 0;

        for (int i = 0; i < array.length; ++i) {

            totalSum -= array[i];

            if (leftSum == totalSum) {

                System.out.printf("\nThe equilibrium index of array: %s is: %s \n", Arrays.toString(array) ,i);
                return;
            }

            leftSum += array[i];
        }
        // If no equilibrium index was found, then return -1
        System.out.printf("\nThe %s array dose not have a equilibrium index\n", Arrays.toString(array));
    }
//--------------------------------------------------------------------------------------------------------------------//

//Public Methods------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Setters-------------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Getters-------------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

}//End of Class.
