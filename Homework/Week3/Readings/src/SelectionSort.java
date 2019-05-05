
public class SelectionSort{
    public static void sort(int[] x) {
        for (int i = 0; i < x.length; i++) {
            int min = x[i];
            int index = i;
            for (int j = i; j < x.length; j++) {
                if (x[j] < min) {
                    min = x[j];
                    index = j;
                }
            }
            x[index] = x[i];
            x[i] = min;

        }

    }
}

