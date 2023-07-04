import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(createNewArray(array)));
    }
    public static int [] createNewArray(int [] array){
        int [] newArray = new int[5];
        int j = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                array[i] += 1;
            }
            if (i >= 2){
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }

}
