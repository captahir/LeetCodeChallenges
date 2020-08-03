package indices;

/*
Verilmiş array daxilində cəmi hədəfə (target) bərabər olan iki indeksi əks etdirin.
Yalniz bir həllin olduğu və yalnız müsbət ədədlərin istifadə olunduğu qəbul edilsin.
 */


import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] array = {5, 8, 3, 14, 1};
        run(array, 95);
        array = new int[]{12, 4, 11, 8, 6};
        run(array, 14);
        array = new int[]{4};
        run(array, 54);
        array = new int[]{8, 12, 4, 6, 11};
        run(array, 14);

    }

    private static void run(int[] array, int target) {
        Solution mySolution = new Solution();
        System.out.print(mySolution.pairFind(array, target) + "\n");
    }
}


class Solution {

    public String pairFind(int[] array, int sum) {
        if (array.length < 2) return "Array is too short. Consider adding more elements\n";

        int[] indexes = new int[2];
        indexes[0] = -1;
        Set<Integer> set = new HashSet<>(array.length);

        for (int i = 0; i < array.length; i++) {
            int missing = sum - array[i];
            if (!set.contains(missing)) set.add(array[i]);

            else {
                indexes[1] = i;
                indexes[0] = indexFind(array, missing);
                break;
            }
        }

        if (indexes[0] == -1) return "There is no pairs";
        else return Arrays.toString(indexes);

    }

    private static int indexFind(int[] array, int lost) {
        int index = - 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == lost) {
                index = i;
                break;
            }
        }
        return index;
    }

}
