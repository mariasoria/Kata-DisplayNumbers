public class DisplayNumbers {
    public static String displayNumbers (int x, int y){

        if (x == 0) return Integer.toString(y);
        if (y == 0) return Integer.toString(x);

        return Integer.toString(x) + Integer.toString(y);
    }
}
