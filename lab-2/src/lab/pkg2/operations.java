import java.lang.Math;

public class operations {

    int[] array;
    int[][] matrix;
    int size, matrixSize;
    int max, min;
    int[][] newMatrix;

    operations(int[] _array) {
        array = _array;
        size = array.length;
    }

    operations(int[][] _matrix) {
        matrix = _matrix;
        matrixSize = matrix.length;
        newMatrix = new int[matrixSize][matrixSize];
    }



    int getEvenNumbers() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) count++;
        }
        return count;
    }

    int getMultipliedSum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        return sum * 3;
    }

    int getDelta() {
        max = 0;
        min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] >= max) max = array[i];
            if (array[i] < min) min = array[i];
        }
        return max - min;
    }

    int getMean() {
        int mean = 0;
        for (int i = 0; i < size; i++) {
            mean += array[i];
        }
        return mean / size;
    }

    int getMaxMinSum() {
        return max + min;
    }

    int getModuleMax() {
        int moduleMax = 0;
        for (int i = 0; i < size; i++) {
            if (Math.abs(array[i]) >= moduleMax) moduleMax = Math.abs(array[i]);
        }
        return moduleMax;
    }

    // two-dimension array operations

    int[][] getAfterNeg() {
        boolean isNegative;
        int newItem = 0;
        for (int i = 0; i < matrixSize; i++) {
            isNegative = false;
            for (int j = 0; j < matrixSize; j++) {
                if (matrix[i][j] < 0 && !isNegative) {
                    isNegative = true;
                    continue;
                }
                if (isNegative) newItem += matrix[i][j];
            }
            if (!isNegative) fillNewLine(i, 100);
            else fillNewLine(i, newItem);
            newItem = 0;
        }
        return newMatrix;
    }

    int[][] getBeforeNeg() {
        boolean isNegative;
        int newItem = 0;
        for (int i = 0; i < matrixSize; i++) {
            isNegative = false;
            for (int j = matrixSize - 1; j >= 0; j--) {
                if (matrix[i][j] < 0 && !isNegative) {
                    isNegative = true;
                    continue;
                }
                if (isNegative) newItem += matrix[i][j];
            }
            if (!isNegative) fillNewLine(i, -1);
            else fillNewLine(i, newItem);
            newItem = 0;
        }
        return newMatrix;
    }

    void fillNewLine(int i, int newItem) {
        for (int j = 0; j < matrixSize; j++) {
            newMatrix[i][j] = newItem;
        }
    }
}
