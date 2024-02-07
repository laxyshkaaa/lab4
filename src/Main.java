import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] SortArr = new int[12];
        for (int i = 0; i < SortArr.length; i++){
            SortArr[i] = input.nextInt();
        }
        CombSort(SortArr);
        System.out.println(Arrays.toString(SortArr));

    }
    public static void CombSort(int [] values){
        double factor = 1.247;
        int step = values.length - 1;
        while (step >= 1){
            for(int i = 0; i + step < values.length; ++i){
                if(values[i] > values[i + step]){
                    swap(values, i, i+step);
                    }
                }
            step /= factor;

            }



        }
        static void swap(int [] SortArr, int i, int y){
        int swap = SortArr[i];
        SortArr[i] = SortArr[y];
        SortArr[y] = swap;
        }

    }
