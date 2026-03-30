public class Char {
    public static void main(String[] args) {
        String name = "Pedro"; //
        int  hash = 0;
        System.out.println("Calculando hash de: " + name);

        for ( int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            int value = (int) c;
            System.out.println("Character '" + c + "' -> unicode value: " + value);
            hash=31 * hash + c;
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