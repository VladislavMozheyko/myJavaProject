package home.work6;

public class Metod1 {

    public static void main(String[][] args) {
        String[][] arr = new String[][]{
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };
        try {
            try {
                int test = arrMetod(arr);
                System.out.println(test);
            } catch (MyArraySizeException e) {
                System.out.println("Неверный размер массива.");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неверное значение в массиве.");
            System.out.println("Ошибка в ячейках " + e.i + " " + e.j);
        }

    }

    public static int arrMetod(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr.length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}




