import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(6.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(5.5, "green", false);

        System.out.println("Truoc khi sap xep: ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("Sau khi sap xep theo darius: ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
