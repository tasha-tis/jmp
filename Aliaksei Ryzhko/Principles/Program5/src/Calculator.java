
public class Calculator {

    public int execute() {
        int a = 1, b = 2, c = 3, d = 4, e = 5, f = 6;
        int result = summaPlusA(a, b, c, d, e, f);
        return result;

    }

    private int summaPlusA(int a, int b, int c, int d, int e, int f) {
        int result = a + summaPlusB(b, c, d, e, f);
        return result;
    }
    private int summaPlusB( int b, int c, int d, int e, int f) {
        int result = b + summaPlusC( c, d, e, f);
        return result;
    }
    private int summaPlusC( int c, int d, int e, int f) {
        int result = c + summaPlusD(d, e, f);
        return result;
    }
    private int summaPlusD(int d, int e, int f) {
        int result = d + summaPlusE(e, f);
        return result;
    }
    private int summaPlusE(int e, int f) {
        int result = e + summaPlusF(f);
        return result;
    }
    private int summaPlusF( int f) {
        int result = f;
        return result;
    }
}
