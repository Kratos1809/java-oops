import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human rajiul = new Human(21, "Rajiul");
        // Human chotu = new Human(rajiul);

        Human chotu = (Human) rajiul.clone();
        System.out.println(chotu.name);

        chotu.name = "Azizul";

        // System.out.println(chotu.name);
        // System.out.println(rajiul.name);

        System.out.println(Arrays.toString(chotu.arr));

        chotu.arr[0] = 100;

        System.out.println(Arrays.toString(chotu.arr));
        System.out.println(Arrays.toString(rajiul.arr));
    }
}
