import br.com.alura.mymusics.models.Musics;
import br.com.alura.mymusics.models.Podcasts;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Podcasts podcasts = new Podcasts("Ana MedEnf", 50, 200,100,9.9);

        podcasts.getHoster();
        System.out.println("Would you like this program? Type (y/n): ");
        podcasts.like(scanner.nextLine());
        podcasts.reproduce();
        System.out.println("The podcast is hosted by " + podcasts.getHoster() );

        Musics music = new Musics("Firefly", 3, 200, 300, 9.9);
        music.like("y");

    }
}