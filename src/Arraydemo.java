/**
 * Created by Tentakli on 19.09.2016.
 */
public class Arraydemo {
    public static void main(String[] args) {
        int[] anArray;

        anArray = new int[10];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300; anArray[9] = 1000;

        System.out.println("Element at index 0: "+ anArray[0]);
        System.out.println("Element at index 2: "+ anArray[1]);
        System.out.println("Element at index 3: "+ anArray[2]);
        System.out.println("Element at index 9: "+ anArray[9]);
    }
}
