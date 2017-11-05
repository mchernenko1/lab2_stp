import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input array size: ");

        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        operations operations = new operations(array);

        System.out.println("Number of even elements: " + operations.getEvenNumbers());
        System.out.println("Sum of elements  multiplied by 3: " + operations.getMultipliedSum());
        System.out.println("Array delta: " + operations.getDelta());
        System.out.println("Array mean: " + operations.getMean());
        System.out.println("Max and min sum: " + operations.getMaxMinSum());
        System.out.println("Module max element: " + operations.getModuleMax());

//         for(int i=0; i<array.length; i++){
//             System.out.print(array[i] + " ");
//         }

        System.out.print("\nSet matrix dimension: ");
        size = input.nextInt();
        int[][] matrix = new int[size][size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(30)-15;
            }
        }

        operations matrixOperations = new operations(matrix);

        printMatrix(matrix);
        System.out.println("\nSum of the elements located behind the first negative element:");
        printMatrix(matrixOperations.getAfterNeg());
        System.out.println("Sum of the elements located before the last negative element:");
        printMatrix(matrixOperations.getBeforeNeg());
    }

    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
