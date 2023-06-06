import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static int randomNum(int min, int max) {
        int num = new Random().nextInt(min,max);
        return num;
    }
    public static int MaxBit(int i) {
        int lenbit = Integer.toBinaryString(i).length();
        return lenbit;
    }

    // Находим длину массива
    public static int LenArr(int i, int n, int max, boolean kratnost) {
        int lenArr = 0;
        for (int j = i; j <= max; j++) {
            if((j % n == 0) == kratnost ) lenArr+=1;
        }

        return lenArr;
    }
    // Формируем массив
    public static Object[] ArrM(int lenArr, int i, int n, int max, boolean kratnost) {

        Object[] arrM = new Object[lenArr];
        int k = 0;
        for (int j = i; j <= max; j++) {
            if((j % n == 0) == kratnost ) {
                arrM[k++] = j;
            }
        }

        return arrM;
    }

    public static void main(String[] args) {

        // 1 Выбросить случайное целое число и сохранить в i
        int i = randomNum(0,2000);
        System.out.println("i = " +i);

        // 2 Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = MaxBit(i);
        System.out.println("Номер старшего значения бита  n =  " +n);

        //Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int k = LenArr(i, n,2000,true);
        System.out.println("Длина массива m1 = " +k);
        Object[] m1 = ArrM(k,i,n,2000,true);
        System.out.println(Arrays.toString(m1));

        //Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        k = LenArr(0, n, i, false);
        System.out.println("Длина массива m2 = " +k);
        Object[] m2 = ArrM(k,0,n,i,false);
        System.out.println(Arrays.toString(m2));

//
    }
}