import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Podcasts podcasts = new Podcasts("Ana MedEnf", 50, 200,100,9.9);

        System.out.println("Would you like this program? Type (y/n): ");
        podcasts.like(scanner.nextLine());
        podcasts.reproduce();
    }
}