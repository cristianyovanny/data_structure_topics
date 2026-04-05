import java.nio.charset.StandardCharsets;

public class Bytes {

    public static void main(String[] args) {
        String name = "Toño"; //
        int  hash = 0;
        System.out.println("Calculate hash of: " + name);

        byte[] bytes = name.getBytes();
        //byte[] bytes = name.getBytes(StandardCharsets.UTF_16BE);

        for ( byte byteRead: bytes) {
            System.out.println("Byte read: " + byteRead);
            hash  = 31 * hash +  byteRead;
            System.out.println("partial hash: " + hash);
            System.out.println();
        }

        int m = 100;
        int index = Math.floorMod(hash, m);
        System.out.println("final hash calculated manually: " + hash);
        System.out.println("real hash using hashCode(): " + name.hashCode());
        System.out.println("for a table of length " + m + " occupies the index " + index);

    }

}