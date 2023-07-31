
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        // Combined length of the new array
        int combinedLength = arr1.length + arr2.length;

        // Create new combined array
        int[] combinedArray = new int[combinedLength];

        // Copy arr1 to combinedArray
        for (int i = 0; i < arr1.length; i++) {
            combinedArray[i] = arr1[i];
        }

        // Copy arr2 to combinedArray
        for (int i = 0; i < arr2.length; i++) {
            combinedArray[arr1.length + i] = arr2[i];
        }

        return combinedArray;
    }
}
