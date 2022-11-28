import java.util.Scanner;

public class Introduction_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Яке в тебе ім'я?");
        String name = scanner.nextLine();
        System.out.println("Де ти жідешь, " + name + "?");
        String address = scanner.nextLine();
        System.out.println(name + "\t" + address);
    }
}
