import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[7];
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
//            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                array[i] += 1;
            }
//            System.out.println(array[i]);

        }
        int [] temp = Arrays.copyOfRange(array, 2, 6);
        for (int j : temp) {
            System.out.println(j);

        }






    }

}