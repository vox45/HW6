public class HW6 {
    public static void main(String[] args) {
task8();
    }
    public static void task1() {
        int sum = 0;
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void task2() {
        int sum = 0;
        int numbers = 0;
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                numbers++;
            }
        }
        System.out.println(sum / numbers);
    }

    public static void task3() {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 1},
                {2, 3, 4, 5, 6},
                {7, 8, 9, 1, 2}
        };
        for (int i = 0; i < array.length; i++) {
            int maxElement = array[i][0];

            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }

            System.out.println(maxElement);
        }
    }
    public static void task4() {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 1},
                {2, 3, 4, 5, 6},
                {7, 8, 9, 1, 2}
        };

        for (int j = 0; j < array[0].length; j++) {
            int minElement = array[0][j];

            for (int i = 1; i < array.length; i++) {
                if (array[i][j] < minElement) {
                    minElement = array[i][j];
                }
            }

            System.out.println(minElement);
        }
    }
    public static void task5() {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 1},
                {2, 3, 4, 5, 6},
                {7, 8, 9, 1, 2}
        };
        for (int i = 0; i < array.length; i++) {
            int sum = 0;

            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }

            System.out.println(sum);
        }
    }
    public static void task6() {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 1},
                {2, 3, 4, 5, 6},
                {7, 8, 9, 1, -2}
        };
        boolean allPositive = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i][i] <= 0) {
                allPositive = false;
                break;
            }
        }
        if (allPositive) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public static void task7() {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 1},
                {2, 3, 4, 5, 6},
                {7, 8, 9, 1, 2}
        };

        System.out.println();
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        int row1 = 0;
        int row2 = 2;

        int[] tempRow = array[row1];
        array[row1] = array[row2];
        array[row2] = tempRow;

        System.out.println("\n");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    public static void task8() {
        int[][] array = {
                {1, 2, 3, -4, 5},
                {6, 7, 8, 9, 1},
                {2, 3, 4, 5, 6},
                {7, 8, 9, 1, 2}
        };

        for (int i = 0; i < array.length; i++) {
            boolean hasNegative = false;
            int sum = 0;

            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];

                if (array[i][j] < 0) {
                    hasNegative = true;
                }
            }

            if (hasNegative) {
                System.out.println(sum);
            }
        }
    }
    public static void task9() {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };

        // Знаходження кількості парних чисел в масиві
        int evenCount = 0;

        for (int[] row : array) {
            for (int value : row) {
                if (value % 2 == 0) {
                    evenCount++;
                }
            }
        }

        System.out.println(evenCount);
    }
    public static void task10() {
        int[][] array = {
                {1, -2, 3, 4, -5},
                {6, 7, -8, 9, 10},
                {11, -12, 13, 14, 15},
                {-16, 17, 18, 19, 20}
        };

        int negativeCount = 0;

        for (int[] row : array) {
            for (int value : row) {
                if (value < 0) {
                    negativeCount++;
                }
            }
        }

        System.out.println(negativeCount);
    }
    public static void task11() {
        int[][] array = {
                {1, 0, 3, 0, 5},
                {6, 7, 0, 9, 10},
                {11, 0, 13, 14, 15},
                {0, 17, 18, 19, 20}
        };

        int currentNumber = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    array[i][j] = currentNumber;
                    currentNumber++;
                }
            }
        }

        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    public static void teask12() {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < array.length; i++) {
            leftDiagonalSum += array[i][i];
            rightDiagonalSum += array[i][array.length - 1 - i];
        }

        if (leftDiagonalSum == rightDiagonalSum) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public static void task13() {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int leftDiagonalSum = 0;

        for (int i = 0; i < array.length; i++) {
            leftDiagonalSum += array[i][i];
        }

        System.out.println(leftDiagonalSum);
    }
    public static void task14() {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int targetNumber = 10;

        int count = 0;

        for (int[] row : array) {
            for (int value : row) {
                if (value < targetNumber) {
                    count++;
                }
            }
        }

        System.out.println("Кількість елементів, які менше " + targetNumber + ": " + count);
    }
    public static void task15() {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        boolean areAllUnique = checkUniqueElements(array);

        if (areAllUnique) {
            System.out.println("Всі елементи масиву є унікальними.");
        } else {
            System.out.println("Є неуникальні елементи в масиві.");
        }
    }

    private static boolean checkUniqueElements(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int currentElement = array[i][j];

                for (int k = i; k < rows; k++) {
                    int startColumn = (k == i) ? j + 1 : 0;

                    for (int l = startColumn; l < cols; l++) {
                        if (currentElement == array[k][l]) {
                            return false; // Знайдено неуникальний елемент
                        }
                    }
                }
            }
        }

        return true; // Всі елементи унікальні
    }
}
