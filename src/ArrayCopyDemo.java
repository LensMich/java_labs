/**
 * Created by Tentakli on 19.09.2016.
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = ('d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' );
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}