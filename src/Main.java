import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");
    }
    public static void main(String[] args) {
			System.out.println("inside main 1st print");

			announceDeveloperTeaTime();

			System.out.println("inside main 2nd print");

			announceDeveloperTeaTime();

			System.out.println("inside main 3nd print");
    }

}
