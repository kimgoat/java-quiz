package object_oriented_programming1;

public class Exercise6_24 {
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값:" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값:" + abs(value));
    }

    private static int abs(int value) {
        // return Math.abs(value);
        return value >= 0 ? value : -value;
    }
}
