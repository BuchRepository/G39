package libs;

public class WorkWithArray {

    public static void create(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                System.out.println("Elements:[" + i + "]=" + array[i] + "<10");
            } else {
                if (array[i] > 10) {
                    System.out.println("Elements:[" + i + "]=" + array[i] + ">10");
                } else {
                    System.out.println("Elements:[" + i + "]=" + array[i] + "=10");
                }
            }
        }
    }

    public int [][] createMatrix (int amount_elements, int element) {
        int [][] array = new int[amount_elements][amount_elements];
        for (int i = 0; i<amount_elements ; i++) {
            for (int j = 0; j<amount_elements; j++) {
                array [i][j] = element;
            }

        }
        printMatrix(array);
        return array;
    }

    public void printMatrix (int doubleArray[][]) {
        for (int i = 0; i<doubleArray.length ; i++) {
            for (int j = 0; j <doubleArray.length; j++) {
                System.out.print(doubleArray[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public int [][] fillingLeftOfDiagonal (int doubleArray [][], int elementOfDiagonal) {
        for (int i=0; i<doubleArray.length; i++)
            {
                doubleArray [i][i] = elementOfDiagonal;
            }
        printMatrix(doubleArray);
        return doubleArray;
    }

    public int [][] fillingRightOfDiagonal (int doubleArray [][], int elementOfDiagonal){

        for (int i=0; i<doubleArray.length; i++)
            {
                doubleArray [i][doubleArray.length-i-1] = elementOfDiagonal;
            }
        printMatrix(doubleArray);
        return doubleArray;
    }

}

