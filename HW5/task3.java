package HW5;

public class task3 {
     public static void main(String[] args) {
        int[] array = new int[] { 10, 6, 3, 8, 2, 9, 0 };

        System.out.println("исходный массив:");
        for (int i : array)
            System.out.print(i + "; ");

        piramidSort(array);
        System.out.println("\n отсортированный массив:");
        for (int i : array)
            System.out.print(i + "; ");
    }

    public static int[] piramidSort(int[] array) {
        int top = array.length - 1;
        do {
            for (int i = top; i > 0; i--) {
                int parent;
                if ((i & 1) > 0)
                    parent = (i + 1) / 2 - 1;
                else
                    parent = i / 2 - 1;
                
                if (array[i] < array[parent])
                    continue;
                
                int temp = array[parent];
                array[parent] = array[i];
                array[i] = temp;
            }
            int temp = array[0];
            array[0] = array[top];
            array[top] = temp;
            top--;

        } while (top > 0);
        return array;
    }
}
