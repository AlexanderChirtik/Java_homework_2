//2.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.logging.*;
public class Task2 {
    public static void main(String[] args) throws IOException {
        Logger lg = Logger.getLogger(Task2.class.getName());
        FileHandler fh = new FileHandler("logTask2.xml");
        lg.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        lg.info("Sort Array");
        int [] array = {-2, 5, 128, 29, 4, -62, 10};
        int[] newArr = SortArray(array);
        System.out.printf("\n Отсортированный массив: \n");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

    }
    public static int[] SortArray(int [] arr){
        for(int k = 0; k < arr.length-1; k++) {
            for (int i = 0; i < arr.length - k-1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
}